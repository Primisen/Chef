package com.primisen.java_november.part4;

import com.primisen.java_november.part4.dish.salad.Salad;
import com.primisen.java_november.part4.ingredient.Dialog;
import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.LeafyDialog;
import com.primisen.java_november.part4.util.FileReader;
import com.primisen.java_november.part4.util.RecipeParser;

import java.util.ArrayList;


    public static void main(String[] args) {

        FileReader fileReader = new FileReader("monomah.txt", "D:\\Java\\training november\\");
        RecipeParser recipeParser = new RecipeParser(fileReader.read());

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        ingredients = recipeParser.findIngredient();

        Salad salad = new Salad(ingredients);
    }
}
