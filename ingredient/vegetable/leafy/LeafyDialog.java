package com.primisen.java_november.part4.ingredient.vegetable.leafy;

import com.primisen.java_november.part4.ingredient.Dialog;
import com.primisen.java_november.part4.ingredient.Ingredient;

public class LeafyDialog extends Dialog {

    @Override
    public Ingredient createIngredient(){
        return new Leafy();
    }
}
