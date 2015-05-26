package com.epam.five.entity;

import com.epam.five.exception.LogicException;

public class Greens extends CanEatFresh{
    private String pickUpDate;

    public Greens(String pickUpDate, String name, double weight, double calories, double digestPersents, boolean peeling)/* throws LogicException */{
        super(name, weight, calories, digestPersents, peeling);
        this.pickUpDate = pickUpDate;
    }

    public Greens() {
        this.pickUpDate = "not specified";
    }
    
    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }
    
}
