package com.example.fridge;

public class Ingredients {
    String name;
    String foodGroup;
    int count;
    int daysToExpire;


    public Ingredients(String name, int daysToExpire){
        this.name = name;
        this.daysToExpire = daysToExpire;
    }

    public Ingredients(String name, int daysToExpire, int count){
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.count = count;
    }

    public Ingredients(String name, String foodGroup, int daysToExpire){
        this.name = name;
        this.foodGroup = foodGroup;
        this.daysToExpire = daysToExpire;
    }

    String getExpiryDate(){
        return name + " it exprires in " + daysToExpire;
    }

    String getFoodGroup(){
        return name + " is a "+ foodGroup;
    }
}
