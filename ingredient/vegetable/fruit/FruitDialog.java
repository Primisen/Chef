package com.primisen.java_november.part4.ingredient.vegetable.fruit;

import com.primisen.java_november.part4.ingredient.Dialog;
import com.primisen.java_november.part4.ingredient.Ingredient;

public class FruitDialog extends Dialog {

    @Override
    public Ingredient createIngredient(){
        return new Fruit();
    }
}
