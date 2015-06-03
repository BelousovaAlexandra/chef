package com.epam.five.entity;

import com.epam.five.exception.LogicException;

public class CanEatFresh extends Vegetable{
    private double digestPersents;

    
    public CanEatFresh() {
        super();
        this.digestPersents = 0;
    }
    
    public CanEatFresh(String name, double weight, double calories, boolean peeling,double digestPersents) throws LogicException{
        super(name, weight, calories, peeling);
        setDigestPersents(digestPersents);
    }

    public double getDigestPersents() {
        return digestPersents;
    }

    public void setDigestPersents(double digestPersents) {
        this.digestPersents = digestPersents;
    }
    @Override
    public String toString() {
        return super.toString() + "digestPersents=" + digestPersents + '}';
    }

}
