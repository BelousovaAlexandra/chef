package com.epam.five.action;

import com.epam.five.entity.Vegetable;
import com.epam.five.report.ActionReports;
import java.io.IOException;
import java.util.ArrayList;

public class FindAction {
    
    public boolean findVegetablesByCalories(ArrayList<Vegetable> ingr,int cal) throws IOException{
        ActionReports reporter = new ActionReports(true);
        String fits="Fitting vegetables: ";
        for (int i=0;i<ingr.size();++i){
            if(ingr.get(i).getCalories() <= cal){
                fits+=ingr.get(i).getName()+"; ";
            }
        }
        reporter.throwLog("Found vegetables in given range of calories");
        reporter.reportToFile("Fitting in cal "+cal+" - "+fits);
        return true;
    }
}
