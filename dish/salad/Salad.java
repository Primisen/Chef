package com.primisen.java_november.part4.dish.salad;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Sauce;

import java.util.ArrayList;

public class Salad {

    private ArrayList<Ingredient> ingredients;
    private Sauce sauce;

    public Salad() {
    }

    public Salad(ArrayList<Ingredient> ingredients, Sauce sauce) {
        this.ingredients = ingredients;
        this.sauce = sauce;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
