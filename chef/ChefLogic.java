package com.primisen.java_november.part4.chef;

import com.primisen.java_november.part4.chef.exception.ChefLogicException;
import com.primisen.java_november.part4.ingredient.IngredientCook;
import com.primisen.java_november.part4.salad.Salad;
import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.fruit.Fruit;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.Leafy;
import com.primisen.java_november.part4.ingredient.vegetable.root_crop.RootCrop;

import java.util.ArrayList;

//в объекте салат проверить наличие всех необхадимых компонентов

public class ChefLogic {

    public Chef chef;

    //ex: chef останется пустой. проверить, пустой chef или нет
    public ChefLogic() {
    }

    public ChefLogic(Chef chef) {
        this.chef = chef;
    }

    public Salad cook() throws ChefLogicException { //ингредиент + специя + заправка != ингредиент

        ArrayList<Ingredient> ingredients = chef.getIngredients();

        if(ingredients == null){
            throw new ChefLogicException("Chef has no ingredients!");
        }

        for (int i = 0; i < ingredients.size(); i++) {

            if(ingredients instanceof IngredientCook){
                ((IngredientCook) ingredients).cook();
            }
        }

        return new Salad(ingredients);
    }
}
