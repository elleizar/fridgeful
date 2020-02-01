package com.example.fridge;
import java.util.*;

class IngredientsComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Ingredients ing1=(Ingredients) o1;
        Ingredients ing2=(Ingredients)o2;

        if(ing1.daysToExpire > ing2.daysToExpire)
             return 1;
        else
             return -1;
    }
}
