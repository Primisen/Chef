package com.primisen.java_november.part4.ingredient.vegetable.root_crop;

import com.primisen.java_november.part4.ingredient.Dialog;
import com.primisen.java_november.part4.ingredient.Ingredient;

public class RootCropDialog extends Dialog {

    @Override
    public Ingredient createIngredient() {
        return new RootCrop();
    }
}
