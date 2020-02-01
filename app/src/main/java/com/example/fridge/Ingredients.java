package com.example.fridge;

public class Ingredients {
    String name;
    String foodGroup;
    int day;
    int month;


    public Ingredients(String name, int day, int month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public Ingredients(String name, String foodGroup, int day, int month){
        this.name = name;
        this.foodGroup = foodGroup;
        this.day = day;
        this.month = month;
    }

    String getExpiryDate(){
        return name + " it exprires on " + day + "/" + month;
    }

    String getFoodGroup(){
        return name + " is a "+ foodGroup;
    }
}
