package com.epam.five.chef;

import com.epam.five.action.*;
import com.epam.five.creator.Creator;
import com.epam.five.entity.Salad;
import com.epam.five.exception.LogicException;
import com.epam.five.report.*;
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
        Creator creator = new Creator();
        CountAction actC = new CountAction();
        FindAction actF = new FindAction();
        SortSaladByWeight actSW = new SortSaladByWeight();
        
        Salad s = creator.setSaladHolodnik();
                
        actC.countSaladCalories(s);
        
        int cal = creator.givenRangeOfCalories();
        actF.findVegetablesByCalories(s.getIngredients(),cal);
        
        actSW.sortSalad(s);
        reporter.reportToFile(s.toString());
        
        reporter.throwLog("End of the program");
        reporter.reportToFile("End of the program");
        reporter.closeFile();
        
        }catch(LogicException le){
            LOG.error("Logic Error - " + le);
        }catch(Exception e){
            LOG.error("Technical Error - " + e);
        }
    }
    
}
