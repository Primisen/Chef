package com.primisen.java_november.part4.util;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.IngredientType;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeParser {

    private Pattern pattern;
    private Matcher matcher;
    private String textToParse;

    public RecipeParser(String textToParse) {
        this.textToParse = textToParse;
    }

    public String getTextToParse() {
        return textToParse;
    }

    public ArrayList<Ingredient> findIngredient() {

//        \uFEFF - специальный символ в начале текстового файла в кодировке unicode
        String parser = "\uFEFF?([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*);\n?";
        pattern = Pattern.compile(parser);
        matcher = pattern.matcher(textToParse);

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        int i = 0;
        while (matcher.find()) {

            ingredients.add(new Ingredient());
            ingredients.get(i).setType(determineType(matcher.group(1)));
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

    private IngredientType determineType(String type) {

        IngredientType ingredientType = null;

        switch (type) {
            case "Корнеплодный":
                ingredientType = IngredientType.ROOT_CROP;
                break;
            case "Листовой":
                ingredientType = IngredientType.LEAFY;
                break;
            case "Плодовый":
                ingredientType = IngredientType.FRUIT;
                break;
            case "Заправка":
                ingredientType = IngredientType.DRESSING;
                break;
            case "Специя":
                ingredientType = IngredientType.FLAVOURING;
                break;
            default:
                break;
        }
        return ingredientType;
    }

    //есть готовый fileReader. использовать его
//    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("monomah.txt", "D:\\Java\\training november\\");
//
//        RecipeParser recipeParser = new RecipeParser(fileReader.read());
//
//        ArrayList<Ingredient> ingredients = recipeParser.findIngredient();
//
//        for (int i = 0; i < ingredients.size(); i++) {
//            System.out.println(ingredients.get(i));
//        }
//    }
}
