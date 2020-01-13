package com.primisen.java_november.part4.salad;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Sauce;

import java.util.ArrayList;

public class Salad {

    private ArrayList<Ingredient> ingredients;

    public Salad() {
    }

    public Salad(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
