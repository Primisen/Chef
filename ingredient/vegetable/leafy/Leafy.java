package com.primisen.java_november.part4.ingredient.vegetable.leafy;

import com.primisen.java_november.part4.ingredient.Ingredient;

public class Leafy extends Ingredient { //листовые

    private LeafyType type;

    public Leafy(){}
//
//    public Leafy(int calorie, double carbohydrates, double fits, double proteins, double weight, LeafyType type) {
//        super(calorie, carbohydrates, fits, proteins, weight);
//        this.type = type;
//    }
//
//    public LeafyType getType() {
//        return type;
//    }

    public void setType(LeafyType type) {
        this.type = type;
    }
}
