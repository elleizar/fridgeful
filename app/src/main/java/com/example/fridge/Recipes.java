package com.example.fridge;

import java.util.ArrayList;

public class Recipes {
    String name;
    ArrayList<Ingredients> ingredients;
    int timeToCook;
    String diet;

    public Recipes(String name, ArrayList ingredients, int timeToCook, String diet){
        this.name = name;
        this.ingredients = new ArrayList<Ingredients>();
        this.timeToCook = timeToCook;
        this.diet = diet;
    }

    int getTimeToCook(){
        return timeToCook;
    }

    String getRecipe(){
        return name;
    }

}
