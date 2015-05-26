package com.epam.five.entity;

import com.epam.five.exception.LogicException;

public class Vegetable implements Comparable <Vegetable> {
    private String name;
    private double weight;
    private double calories;
    private boolean needToPeel;


    public Vegetable() {
        this.name = "default name";
        this.weight = 0;
        this.calories = 0;
        this.needToPeel = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws LogicException {
        if(weight > 0){
            this.weight = weight;
        } else{
            throw new LogicException();
        }
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories){
        //if(calories > 0){
            this.calories = calories;
        /*} else{
            throw new LogicException();
        }*/
        
    }
    
    public boolean isNeedToPeel() {
        return needToPeel;
    }

    public void setNeedToPeel(boolean needToPeel) {
        this.needToPeel = needToPeel;
    }
    

    public Vegetable(String name, double weight, double calories,boolean peeling) throws LogicException {
        this.name = name;
        setWeight(weight);
        setCalories(calories);
        this.needToPeel = peeling;
    }

    @Override
    public int compareTo(Vegetable t) {
        return (int)(this.weight-t.getWeight());
    }
    @Override
    public String toString() {
        return ("name: " + this.name + "weight: " + this.weight + "; calories: " + this.calories);
    }
    
}
