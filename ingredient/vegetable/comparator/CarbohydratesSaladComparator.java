package com.primisen.java_november.part4.ingredient.vegetable.comparator;

import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.Comparator;

public class CarbohydratesSaladComparator implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient ingredient1, Ingredient ingredient2){
        return (int) (ingredient1.getCarbohydrates() - ingredient2.getCarbohydrates());
    }
}
