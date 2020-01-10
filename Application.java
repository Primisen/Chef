package com.primisen.java_november.part4;

import com.primisen.java_november.part4.chef.Chef;
import com.primisen.java_november.part4.chef.ChefLogic;
import com.primisen.java_november.part4.dish.salad.Salad;
import com.primisen.java_november.part4.dish.salad.SaladLogic;
import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.util.FileReader;
import com.primisen.java_november.part4.util.RecipeFileReader;

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

    public static void main(String[] args) {

        //проверять правильность пути к файлу
        FileReader fileReader = new FileReader("monomah.txt", "D:\\Java\\training november\\");
        RecipeFileReader recipeFileReader = new RecipeFileReader(fileReader.read());

        ArrayList<Ingredient> ingredients = recipeFileReader.findIngredient();

        Chef chef = new Chef(ingredients);

        ChefLogic chefLogic = new ChefLogic(chef);

        Salad salad = chefLogic.cook();
        SaladLogic saladLogic = new SaladLogic();
        System.out.println("Каллорийность салата = " + saladLogic.countCalories(salad)); //отдельный метод
        saladLogic.sort(salad);
        System.out.println("Сортировка по каллорийности = " + salad.getIngredients());
    }
}
