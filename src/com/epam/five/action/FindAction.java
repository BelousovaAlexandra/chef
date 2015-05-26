package com.epam.five.action;

import com.epam.five.entity.Vegetable;
import java.util.ArrayList;

public class FindAction {
    public String findVegInByCalories(ArrayList<Vegetable> ingr,int cal){
        String fits="Fitting vegetables: ";
        for (int i=0;i<ingr.size();++i){
            if(ingr.get(i).getCalories() <= cal){
                fits+=ingr.get(i).getName()+"; ";
            }
        }
        
        return fits;
    }
}
