package com.epam.five.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad{
    private String name;
    private ArrayList<Vegetable> ingredients;
    private String flavoring;
    //private boolean needMeat;
    private double cost;

    public Salad() {
        this.cost = 0;
        this.name = "";
        this.ingredients = new ArrayList<>();
        this.flavoring = "none";
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vegetable> getIngredients() {
        //return Collections.unmodifiableList(ingredients);
        return ingredients;
    }
    
    public void setIngredients(ArrayList<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }
    public boolean addVeg(Vegetable e) {
        return ingredients.add(e);
    }

    public boolean removeVeg(Object o) {
        return ingredients.remove(o);
    }
    public String getFlavoring() {
        return flavoring;
    }

    public void setFlavoring(String flavoring) {
        this.flavoring = flavoring;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost){
            this.cost = cost;
    }

    @Override
    public String toString() {
        return "Salad{" + "name=" + name + ", ingredients=" + ingredients + ", flavoring=" + flavoring + ", cost=" + cost + '}';
    }

    public Salad(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.ingredients = new ArrayList<>();
        this.flavoring = "";
    }

}
