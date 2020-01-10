package com.primisen.java_november.part4.utility;

import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Dressing;
import com.primisen.java_november.part4.ingredient.sauce_and_dressing.Flavouring;
import com.primisen.java_november.part4.ingredient.vegetable.fruit.Fruit;
import com.primisen.java_november.part4.ingredient.vegetable.leafy.Leafy;
import com.primisen.java_november.part4.ingredient.vegetable.root_crop.RootCrop;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeReaderLogic {

    private RecipeReader recipeReader;

    public RecipeReaderLogic(RecipeReader recipeReader) throws IOException {
        this.recipeReader = recipeReader;
        readRecipeFile();
    }

    private void readRecipeFile() throws IOException {

        FileReader fileReader = new FileReader(recipeReader.getPath());
        Scanner scanner = new Scanner(fileReader);

        String textToParse = scanner.nextLine();
        while (scanner.hasNextLine()) {
            textToParse = textToParse + "\n" + scanner.nextLine();
        }

        fileReader.close();
        recipeReader.setTextToParse(textToParse);
    }

    public ArrayList<Ingredient> readRecipe() throws IOException {
        readRecipeFile();

        // \uFEFF - специальный символ в начале текстового файла в кодировке unicode
        String parser = "\uFEFF?([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*);\n?";
        Pattern pattern = Pattern.compile(parser);
        Matcher matcher = pattern.matcher(recipeReader.getTextToParse());

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
                System.out.println("Тип не обнаружен!");
                break;
        }
        return ingredient;
    }

//    public static void main(String[] args) throws IOException {
//        RecipeReader recipeFileReader = new RecipeReader("D:\\Java\\training november\\monomah.txt");
//
//        RecipeReaderLogic recipeReaderLogic = new RecipeReaderLogic(recipeFileReader);
//
//        ArrayList<Ingredient> ingredients = recipeReaderLogic.readRecipe();
//
//        for (int i = 0; i < ingredients.size(); i++) {
//            System.out.println(ingredients.get(i));
//        }
//    }
}
