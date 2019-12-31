package com.primisen.java_november.part4.ingredient.vegetable.fruit;

import com.primisen.java_november.part4.ingredient.Ingredient;

//equals hashcode toString
public class Fruit extends Ingredient { //плодовые

    private FruitType type;

    public Fruit() {
    }

//    public Fruit(int calorie, double carbohydrates, double fits, double proteins, double weight, FruitType type) {
//        super(calorie, carbohydrates, fits, proteins, weight);
//        this.type = type;
//    }
//
//    public FruitType getType() {
//        return type;
//    }

    public void setType(FruitType type) {
        this.type = type;
    }
}
