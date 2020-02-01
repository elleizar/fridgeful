package com.example.fridge;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Fridge {
    ArrayList<Ingredients> inventory;
    ArrayList<Recipes> myRecipes;

    public Fridge(ArrayList inventory, ArrayList recipes){
        this.inventory = inventory;
        this.myRecipes = recipes;
    }

    void addIngredient(String name, String foodGroup, int day, int month){
        inventory.add(new Ingredients(name, foodGroup, day, month));
        Collections.sort(inventory,new IngredientsComparator());
    }

    void addIngredient(String name,  int day, int month){
        inventory.add(new Ingredients(name, day, month));
        Collections.sort(inventory,new IngredientsComparator());
    }

    void addRecipe(String name, ArrayList ingredients, int timeToCook, String diet){
        myRecipes.add(new Recipes(name, ingredients, timeToCook, diet));
    }

    void removeIngredient(String n){
        for (Ingredients temp : inventory) {
            if (temp.name.equals(n)){
                inventory.remove(temp);
            }
        }
    }

    String listInventory(){
        String out = "";
        for (Ingredients temp : inventory) {
            out +=  temp.name + "\n";
        }
        return out;
    }

    String listRecipes(){
        String out = "";
        for (Recipes temp : myRecipes) {
            out +=  temp.name + "\n";
        }
        return out;
    }

//    Recipes findRecipe(){
//        int mostBalanced;
//        Recipes mostBalancedRecipe;
//
//        for (int i = 0 ; i < inventory.size(); i++){
//
//
//        }
//    }
}
