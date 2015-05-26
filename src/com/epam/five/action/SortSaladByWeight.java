package com.epam.five.action;

import com.epam.five.entity.Salad;
import com.epam.five.entity.Vegetable;
import java.util.Collections;
import java.util.Comparator;

public class SortSaladByWeight implements Comparator<Vegetable>{
    
    @Override
    public int compare(Vegetable t, Vegetable t1) {
        return (int) ( t.getWeight() - t1.getWeight());
    }
    public Salad sortSalad(Salad s){
        Collections.sort(s.getIngredients(), this);
        return s;
    }
}
