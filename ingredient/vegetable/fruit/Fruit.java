package com.primisen.java_november.part4.ingredient.vegetable.fruit;

import com.primisen.java_november.part4.ingredient.Ingredient;

//equals hashcode toString
public class Fruit extends Ingredient { //плодовые

    private boolean seeds; //семечки

    public Fruit() {
    }

    public boolean isSeeds() {
        return seeds;
    }

    public void setSeeds(boolean seeds) {
        this.seeds = seeds;
    }
}
