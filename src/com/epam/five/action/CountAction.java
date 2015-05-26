package com.epam.five.action;

import com.epam.five.entity.Salad;
import com.epam.five.report.ActionReports;
import java.io.IOException;

public class CountAction {
    public double countSaladCalories(Salad s) throws IOException{
       ActionReports reporter = new ActionReports(true);
       double sum = 0;
       for(int i = 0; i < s.getIngredients().size(); ++i){
           sum+=s.getIngredients().get(i).getCalories();
       }
       reporter.throwLog("Counted calories");
       reporter.reportToFile("Calories in salad \""+s.getName()+"\" - "+sum);
       reporter.closeFile();
       return sum;
    }
}
