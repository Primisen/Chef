package com.primisen.java_november.part4;

import com.primisen.java_november.part4.dish.salad.Salad;
import com.primisen.java_november.part4.ingredient.Dialog;
import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.LeafyDialog;
import com.primisen.java_november.part4.util.FileReader;
import com.primisen.java_november.part4.util.RecipeParser;

import java.util.ArrayList;

/*
Шеф-повар.
- Определить иерархию овощей (плодовые, корнеплодные и листовые).
+ Сделать салат.
+ Посчитать калорийность.
+ Провести сортировку овощей для салата на основе одного
+ и нескольких параметров.
+ Найти ингредиенты в салате, соответствующие заданному диапазону калорийности.
 */
public class Application {

    private static Dialog dialog;


    public static void main(String[] args) {

        FileReader fileReader = new FileReader("monomah.txt", "D:\\Java\\training november\\");
        RecipeParser recipeParser = new RecipeParser(fileReader.read());

        recipeParser.findIngredient();

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        Salad salad = new Salad();

    }
}
