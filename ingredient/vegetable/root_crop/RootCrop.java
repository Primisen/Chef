package com.primisen.java_november.part4.ingredient.vegetable.root_crop;

import com.primisen.java_november.part4.ingredient.Ingredient;

public class RootCrop extends Ingredient {

    private RootCropType type;

    public RootCrop(){}

//    public RootCrop(int calorie, double carbohydrates, double fits, double proteins, double weight, RootCropType type) {
//        super(calorie, carbohydrates, fits, proteins, weight);
//        this.type = type;
//    }
//
//    public RootCropType getType() {
//        return type;
//    }

    public void setType(RootCropType type) {
        this.type = type;
    }
}
