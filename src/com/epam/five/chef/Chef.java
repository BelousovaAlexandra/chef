package com.epam.five.chef;

import com.epam.five.action.*;
import com.epam.five.creator.Creator;
import com.epam.five.entity.Salad;
import com.epam.five.exception.LogicException;
import com.epam.five.exception.TechnicalException;
import com.epam.five.report.*;
import java.io.IOException;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class Chef {
    
    private static final Logger LOG = Logger.getLogger(Chef.class);
    static{
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }
    public static void main(String[] args) {
        try{
        ChefReports reporter = new ChefReports();
        reporter.throwLog("Programm Started");
        CountAction actC = new CountAction();
        FindAction actF = new FindAction();
        SortAction actS = new SortAction();
        Creator creator = new Creator();

        Salad s = creator.setSaladHolodnik();
        reporter.throwLog("Created user's salad");
                
        double saladCalories = actC.countSaladCalories(s);
        reporter.throwLog("Counted calories");
        reporter.reportToFile("Calories in salad \""+s.getName()+"\" - "+saladCalories);
        
        int cal = creator.givenRangeOfCalories();
        reporter.reportToFile("Fitting in cal"+cal+" - "+actF.findVegInByCalories(s.getIngredients(),cal));
        
        actS.sortVegByWeight(s);
        reporter.reportToFile(s.toString());
        
        reporter.throwLog("End of the program");
        reporter.closeFile();
        
        }catch(LogicException le){
            //lc.throwLog();
            LOG.error("Logic Error - " + le);
        }catch(IOException te){
            LOG.error("Technical Error - " + te);
        }
    }
    
}
