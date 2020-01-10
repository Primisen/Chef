package com.primisen.java_november.part4.chef;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.fruit.Fruit;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.Leafy;

import java.util.ArrayList;

public class Chef {

    private ArrayList<Ingredient> ingredients;

    public Chef(){}

    public Chef(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
