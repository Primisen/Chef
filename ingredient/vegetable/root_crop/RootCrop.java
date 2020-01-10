package com.primisen.java_november.part4.ingredient.vegetable.root_crop;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.IngredientType;

//ex: кожура должна быть очищена!
public class RootCrop extends Ingredient {

    private boolean peel; //наличие кожуры, шелухи

    public RootCrop(){}

    public boolean isPeel() {
        return peel;
    }

    public void setPeel(boolean peel) {
        this.peel = peel;
    }
}
