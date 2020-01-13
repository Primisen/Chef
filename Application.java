package com.primisen.java_november.part4;

import com.primisen.java_november.part4.chef.Chef;
import com.primisen.java_november.part4.chef.ChefLogic;
import com.primisen.java_november.part4.chef.exception.ChefLogicException;
import com.primisen.java_november.part4.salad.Salad;
import com.primisen.java_november.part4.salad.SaladLogic;

import java.io.IOException;

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

    public static void main(String[] args) throws ChefLogicException, IOException {

        //проверять правильность пути к файлу

        Chef chef = new Chef("D:\\Java\\training november\\monomah.txt");

        ChefLogic chefLogic = new ChefLogic(chef);

        Salad salad = chefLogic.cook();

        SaladLogic saladLogic = new SaladLogic();
        System.out.println("Каллорийность салата = " + saladLogic.countCalories(salad)); //отдельный метод
        saladLogic.sort(salad);
        System.out.println("Сортировка по каллорийности = " + salad.getIngredients());
    }
}
