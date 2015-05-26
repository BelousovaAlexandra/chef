package com.epam.five.creator;

import com.epam.five.entity.CanEatFresh;
import com.epam.five.entity.NeedToCook;
import com.epam.five.entity.Salad;
import com.epam.five.entity.Vegetable;
import com.epam.five.exception.LogicException;
import com.epam.five.report.CreatorReports;
import java.io.IOException;
import java.util.ArrayList;


public class Creator {
    private CreatorReports reporter;

    public Creator() throws IOException {
        this.reporter = new CreatorReports(true);
    }
 
    public int givenRangeOfCalories(){
        return (int)(Math.random()*100);
    }
    
    public Salad setSaladTomato() throws LogicException{
        Salad s = new Salad("Tomato and Onion",113);
        s.addVeg(new CanEatFresh("Tomato",3.5,75,false,80));
        s.addVeg(new CanEatFresh("Onion",3.5,30,true,70));
        s.setFlavoring("oil");
        reporter.throwLog("Created user's salad");
        return s;
    }
    public Salad setSaladSimple() throws LogicException{
        Salad s = new Salad("Simple Vegetables",113);
        s.addVeg(new CanEatFresh("Tomato",3.5,75,false,80));
        s.addVeg(new CanEatFresh("Green Onion",3.5,30,false,70));
        s.addVeg(new CanEatFresh("Onion",3.5,30,true,70));
        s.addVeg(new CanEatFresh("Cucumber",3.5,75,false,98));
        s.addVeg(new CanEatFresh("Pepper",3.5,75,false,80));
        s.setFlavoring("olive oil");
        reporter.throwLog("Created user's salad");
        return s;
    }
    public Salad setSaladHolodnik() throws LogicException{
        Salad s = new Salad();
        s.setName("Holodnik");
        s.setCost(41.3);
        ArrayList<Vegetable> ing = new ArrayList<>();
        ing.add(new NeedToCook("Beats",50,20,false,20));
        ing.add(new CanEatFresh("Green Onion",3.5,30,false,70));
        ing.add(new CanEatFresh("Cucumber",3.5,75,false,98));
        s.setIngredients(ing);
        s.setFlavoring("kefir");
        
        reporter.throwLog("Created user's salad");
        
        return s;
        
    }
    public Salad setSaladRadish() throws LogicException{
        Salad s = new Salad("Radish",413);
        s.addVeg(new CanEatFresh("Radish",3.5,75,false,98));
        s.addVeg(new CanEatFresh("Green Onion",3.5,30,false,70));
        s.addVeg(new CanEatFresh("Cucumber",3.5,75,false,98));
        s.setFlavoring("cream");
        reporter.throwLog("Created user's salad");
        return s;
    }
}
