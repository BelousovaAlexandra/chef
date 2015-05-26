package com.epam.five.creator;
/*make your own objects w/ harcode today!*/
import com.epam.five.entity.CanEatFresh;
import com.epam.five.entity.Greens;
import com.epam.five.entity.NeedToCook;
import com.epam.five.entity.Salad;
import com.epam.five.entity.Vegetable;
import com.epam.five.exception.LogicException;
import java.util.ArrayList;


public class Creator {
    public Vegetable setVegetableUncooked(String name,double calories, double weight, boolean needToPeel, int minsToCook) throws LogicException {
        NeedToCook v = new NeedToCook();
        v.setName(name);
        v.setCalories(calories);
        v.setWeight(weight);
        v.setNeedToPeel(needToPeel);
        v.setMinsToCook(minsToCook);
        return v;
    }
    public Vegetable setVegetableFresh(String name,double calories, double weight, boolean needToPeel, int digestPersents) throws LogicException{
        CanEatFresh v = new CanEatFresh();
        v.setName(name);
        v.setCalories(calories);
        v.setWeight(weight);
        v.setNeedToPeel(needToPeel);
        v.setDigestPersents(digestPersents);
        return v;
    }
    public Vegetable setVegetableGreen(String name,double calories, double weight, boolean needToPeel, int digestPersents, String pickUpDate) throws LogicException{
        Greens v = new Greens();
        v.setName(name);
        v.setCalories(calories);
        v.setWeight(weight);
        v.setNeedToPeel(needToPeel);
        v.setDigestPersents(digestPersents);
        v.setPickUpDate(pickUpDate);
        return v;
    }
    
    public int givenRangeOfCalories(){
        return (int)(Math.random()*100);
    }
    
    public Salad setSaladTomato() throws LogicException{
        Salad s = new Salad("Tomato and Onion",113);
        s.addVeg(setVegetableFresh("Tomato",3.5,75,false,80));
        s.addVeg(setVegetableFresh("Onion",3.5,30,true,70));
        s.setFlavoring("oil");
        return s;
    }
    public Salad setSaladSimple() throws LogicException{
        Salad s = new Salad("Simple Vegetables",113);
        s.addVeg(setVegetableFresh("Tomato",3.5,75,false,80));
        s.addVeg(setVegetableGreen("Green Onion",3.5,30,false,70,"2 days"));
        s.addVeg(setVegetableFresh("Onion",3.5,30,true,70));
        s.addVeg(setVegetableFresh("Cucumber",3.5,75,false,98));
        s.addVeg(setVegetableFresh("Pepper",3.5,75,false,80));
        s.setFlavoring("olive oil");
        return s;
    }
    public Salad setSaladHolodnik() throws LogicException{
        Salad s = new Salad();
        s.setName("Holodnik");
        s.setCost(41.3);
        ArrayList<Vegetable> ing = new ArrayList<>();
        ing.add(setVegetableUncooked("Beats",50,20,false,20));
        ing.add(setVegetableGreen("Green Onion",3.5,30,false,70,"2 days"));
        ing.add(setVegetableFresh("Cucumber",3.5,75,false,98));
        s.setIngredients(ing);
        s.setFlavoring("kefir");
        return s;
    }
    public Salad setSaladRadish() throws LogicException{
        Salad s = new Salad("Radish",413);
        s.addVeg(setVegetableFresh("Radish",3.5,75,false,98));
        s.addVeg(setVegetableGreen("Green Onion",3.5,30,false,70,"2 days"));
        s.addVeg(setVegetableFresh("Cucumber",3.5,75,false,98));
        s.setFlavoring("cream");
        return s;
    }
}
