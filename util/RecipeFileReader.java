package com.primisen.java_november.part4.util;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.IngredientType;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Dressing;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Flavouring;
import com.primisen.java_november.part4.ingredient.vegetable.fruit.Fruit;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.Leafy;
import com.primisen.java_november.part4.ingredient.vegetable.root_crop.RootCrop;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeFileReader {

    private String textToParse;

    public RecipeFileReader(String textToParse) {
        this.textToParse = textToParse;
    }

    public String getTextToParse() {
        return textToParse;
    }

    public ArrayList<Ingredient> findIngredient() {

//        \uFEFF - специальный символ в начале текстового файла в кодировке unicode
        String parser = "\uFEFF?([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*);\n?";
        Pattern pattern = Pattern.compile(parser);
        Matcher matcher = pattern.matcher(textToParse);

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        int i = 0;
        while (matcher.find()) {

            ingredients.add(determineType(matcher.group(1)));
            ingredients.get(i).setName(matcher.group(2));
            ingredients.get(i).setWeight(Double.parseDouble(matcher.group(3)));
            ingredients.get(i).setCalorie(Integer.parseInt(matcher.group(4)));
            ingredients.get(i).setCarbohydrates(Double.parseDouble(matcher.group(5)));
            ingredients.get(i).setFits(Double.parseDouble(matcher.group(6)));
            ingredients.get(i).setProteins(Double.parseDouble(matcher.group(7)));

            i++;
        }
        return ingredients;
    }

//    private IngredientType determineType(String type) {
//
//        IngredientType ingredientType = null;
//
//        switch (type) {
//            case "Корнеплодный":
//                ingredientType = IngredientType.ROOT_CROP;
//                break;
//            case "Листовой":
//                ingredientType = IngredientType.LEAFY;
//                break;
//            case "Плодовый":
//                ingredientType = IngredientType.FRUIT;
//                break;
//            case "Заправка":
//                ingredientType = IngredientType.DRESSING;
//                break;
//            case "Специя":
//                ingredientType = IngredientType.FLAVOURING;
//                break;
//            default:
//                break;
//        }
//        return ingredientType;
//    }

    //возможно метод связан с фабрикой. разобраться
    //default вариант доработать
    private Ingredient determineType(String type) {

        Ingredient ingredient = null;

        switch (type) {
            case "Корнеплодный":
                ingredient = new RootCrop();
                break;
            case "Листовой":
                ingredient = new Leafy();
                break;
            case "Плодовый":
                ingredient = new Fruit();
                break;
            case "Заправка":
                ingredient = new Dressing();
                break;
            case "Специя":
                ingredient = new Flavouring();
                break;
            default:
                break;
        }
        return ingredient;
    }


    //есть готовый fileReader. использовать его
//    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("monomah.txt", "D:\\Java\\training november\\");
//
//        RecipeFileReader recipeFileReader = new RecipeFileReader(fileReader.read());
//
//        ArrayList<Ingredient> ingredients = recipeFileReader.findIngredient();
//
//        for (int i = 0; i < ingredients.size(); i++) {
//            System.out.println(ingredients.get(i));
//        }
//    }
}
