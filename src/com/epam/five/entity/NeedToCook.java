package com.epam.five.entity;

import com.epam.five.exception.LogicException;

public class NeedToCook extends Vegetable {
    private double minsToCook;

    public NeedToCook(String name, double weight, double calories,boolean peeling,double minsToCook) throws LogicException {
        super(name, weight, calories,peeling);
        setMinsToCook(minsToCook);
    }

    public NeedToCook() {
        super();
        this.minsToCook = 0;
    }

    public double getMinsToCook() {
        return minsToCook;
    }
    public void setMinsToCook(double minsToCook) throws LogicException {
        if(minsToCook > 0){
            this.minsToCook = minsToCook;
        }else{
            throw new LogicException();
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "minsToCook=" + minsToCook + '}';
    }
    
}
