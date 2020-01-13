package com.primisen.java_november.part4.salad;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.comparator.CarbohydratesSaladComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SaladLogic{ //переделать

    //подсчет калорийности салата
    public int countCalories(Salad salad) {

        int calories = 0;

        for (int i = 0; i < salad.getIngredients().size(); i++) {
            calories += salad.getIngredients().get(i).getCalorie();
        }

        return calories;
    }

    //сортировка по калориности
    public void sort(Salad salad) {
        Collections.sort(salad.getIngredients());
    }

    //сортирвка по углеводам
    public void sort(Salad salad, CarbohydratesSaladComparator carbohydrateComparator){
        Collections.sort(salad.getIngredients(), carbohydrateComparator);
    }



    //сортировка по 3 парметрам.
    // !название  некорректно
    public void sortAll(Salad salad){
        salad.getIngredients().sort(Comparator.comparing(Ingredient::getCalorie)
                .thenComparing(Ingredient::getCarbohydrates));
    }

    public ArrayList<Ingredient> findIngredient(Salad salad, int minCalories, int maxCalories){
        
        ArrayList<Ingredient> ingredients = null;
        for (int i = 0; i < salad.getIngredients().size(); i++) {

            int currentCalorie = salad.getIngredients().get(i).getCalorie();

            if(currentCalorie < maxCalories && currentCalorie > minCalories){
                ingredients.add(salad.getIngredients().get(i));
            }
        }

        return ingredients;
    }
}
