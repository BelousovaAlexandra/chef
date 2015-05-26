package com.epam.five.action;

import com.epam.five.entity.Salad;
import java.util.Collections;

public class SortAction {
    
    
    public void sortVegByWeight(Salad s) {
        Collections.sort(s.getIngredients());
    }
    
    
    
}
