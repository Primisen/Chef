package com.primisen.java_november.part4.ingredient.sauce_and_dressing;

import com.primisen.java_november.part4.ingredient.Ingredient;

public class Sauce extends Ingredient {

    private SauceType sauceType;

    public Sauce() {
    }

//    public Sauce(int calorie, double carbohydrates, double fits, double proteins, double weight, SauceType sauceType) {
//        super(calorie, carbohydrates, fits, proteins, weight);
//        this.sauceType = sauceType;
//    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }
}
