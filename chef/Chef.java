package com.primisen.java_november.part4.chef;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.utility.RecipeReader;
import com.primisen.java_november.part4.utility.RecipeReaderLogic;

import java.io.IOException;
import java.util.ArrayList;

public class Chef {

    private ArrayList<Ingredient> ingredients;

    public Chef(String recipe) throws IOException {
        RecipeReader recipeReader = new RecipeReader(recipe);
        RecipeReaderLogic recipeReaderLogic = new RecipeReaderLogic(recipeReader);
        this.ingredients = recipeReaderLogic.readRecipe();
    }

    public Chef(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
