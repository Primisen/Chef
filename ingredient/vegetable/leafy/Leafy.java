package com.primisen.java_november.part4.ingredient.vegetable.leafy;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.IngredientCook;

public class Leafy extends Ingredient implements IngredientCook { //листовые

    private boolean crushed; //измельченный

    public Leafy(){}

    public boolean isCrushed() {
        return crushed;
    }

    public void setCrushed(boolean crushed) {
        this.crushed = crushed;
    }

    @Override
    public void cook(){
        setCrushed(true);
    }
}
