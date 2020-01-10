package com.primisen.java_november.part4.chef;

import com.primisen.java_november.part4.dish.salad.Salad;
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

    //улучшение: кожура уже может быть снята
    private void cook(RootCrop rootCrop) { //cleanOut - обчистить, снять кожуру
        rootCrop.setPeel(false);
    }

    private void cook(Fruit fruit) { //убрать семечки
        fruit.setSeeds(false);
    }

    private void cook(Leafy leafy) { //высушить
        leafy.setDried(true);
    }

    public Salad cook() { //ингредиент + специя + заправка != ингредиент

        ArrayList<Ingredient> ingredients = chef.getIngredients();

        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i) instanceof RootCrop) {
                cook((RootCrop) ingredients.get(i));
            }
            if (ingredients.get(i) instanceof Fruit) {
                cook((Fruit) ingredients.get(i));
            }
            if (ingredients.get(i) instanceof Leafy) {
                cook((Leafy)ingredients.get(i));
            }
        }

        return new Salad(ingredients);
    }

//    public Salad cookSalad(){
//        ArrayList<Ingredient> ingredients = chef.getIngredients();
//
//
//    }

//    public ArrayList<Ingredient> prepareIngredient(){
//        ArrayList<Ingredient> ingredients = chef.getIngredients();
//        ArrayList<Ingredient> preparedIngredient = new ArrayList<>();
//
//        for (int i = 0; i < ingredients.size(); i++) {
//            switch (ingredients.get(i).getType()){
//                case ROOT_CROP:
//                    preparedIngredient.add(new RootCrop());
//                    break;
//                case LEAFY:
//                    preparedIngredient.add(new Leafy());
//                    break;
//                case FRUIT:
//                    preparedIngredient.add(new Fruit());
//                    break;
////                case DRESSING:
////                    preparedIngredient.add(new Dressing)
//            }
//        }
//    }


}
