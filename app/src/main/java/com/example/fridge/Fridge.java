package com.example.fridge;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Fridge{
    ArrayList<Ingredients> inventory;
    ArrayList<Recipes> myRecipes;

    public Fridge(){
        this.inventory = new ArrayList<>();
        this.myRecipes = new ArrayList<>();
    }

    public Fridge(ArrayList inventory, ArrayList recipes){
        this.inventory = inventory;
        this.myRecipes = recipes;
    }

    void addIngredient(String name, String foodGroup, int daysToExpire){
        inventory.add(new Ingredients(name, foodGroup, daysToExpire));
        Collections.sort(inventory,new IngredientsComparator());
    }

    void addIngredient(String name,  int daysToExpire){
        inventory.add(new Ingredients(name, daysToExpire));
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
            out = out + temp.name ;
        }
        return out;
    }

    String listRecipes(){
        String out = "";
        for (Recipes temp : myRecipes) {
            out = out +  temp.name ;
        }
        return out;
    }

    ArrayList<Ingredients> findListOfIngrediantsBalanced(){
        ArrayList<Ingredients> out = new ArrayList<Ingredients>();
        int[] balance = new int[5];
        for (int i = 0 ; i < inventory.size(); i++){
            if (inventory.get(i).foodGroup.equals("Dairy") && balance[0] == 0 ){
                out.add(inventory.get(i));
                balance[0]++;
            }
            else if (inventory.get(i).foodGroup.equals("Vegetable") && balance[1] == 0 ){
                out.add(inventory.get(i));
                balance[1]++;
            }
            else if (inventory.get(i).foodGroup.equals("Fruit") && balance[2] == 0 ){
                out.add(inventory.get(i));
                balance[2]++;
            }
            else if (inventory.get(i).foodGroup.equals("Protein") && balance[3] == 0 ){
                out.add(inventory.get(i));
                balance[3]++;
            }
            else if (inventory.get(i).foodGroup.equals("Grains") && balance[4] == 0 ){
                out.add(inventory.get(i));
                balance[4]++;
            }
        }

        return out;
    }

    ArrayList<Ingredients> findLeastWastefulIngrediants(){
        ArrayList<Ingredients> out = new ArrayList<Ingredients>();
        for (int i = 0 ; i < 5; i++){
            out.add(inventory.get(i));
        }

        return out;
    }

    void clearFridge(int days){
        for (Ingredients temp : inventory) {
            if (temp.daysToExpire < days){
                inventory.remove(temp);
            }

        }
    }

    ArrayList<Recipes> findRecipeOptimial(){
        ArrayList<Ingredients> ing = findListOfIngrediantsBalanced();
        ArrayList<Recipes> out = new ArrayList<>();

        for (Recipes temp : myRecipes) {
            if (temp.ingredients.containsAll(ing)){
                out.add(temp);
            }

        }

        return out;
    }

    ArrayList<Recipes> findRecipeLeastWasteful(){
        ArrayList<Ingredients> ing = findLeastWastefulIngrediants();
        ArrayList<Recipes> out = new ArrayList<>();

        for (Recipes temp : myRecipes) {
            if (temp.ingredients.containsAll(ing)){
                out.add(temp);
            }

        }

        return out;
    }


}
