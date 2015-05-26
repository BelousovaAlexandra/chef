package com.epam.five.action;

import com.epam.five.entity.Salad;

public class CountAction {
    public double countSaladCalories(Salad s){
       double sum = 0;
       for(int i = 0; i < s.getIngredients().size(); ++i){
           sum+=s.getIngredients().get(i).getCalories();
       }
       return sum;
    }
}
