package com.epam.five.entity;

import com.epam.five.exception.LogicException;

public class CanEatFresh extends Vegetable{
    private double digestPersents;

    public CanEatFresh(String name, double weight, double calories,double digestPersents, boolean peeling) throws LogicException{
        super(name, weight, calories, peeling);
        setDigestPersents(digestPersents);
    }

    public CanEatFresh() {
        super();
        this.digestPersents = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "digestPersents=" + digestPersents + '}';
    }

    public double getDigestPersents() {
        return digestPersents;
    }

    public void setDigestPersents(double digestPersents) {
        this.digestPersents = digestPersents;
    }
    
}
