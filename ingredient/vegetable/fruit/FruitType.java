package com.primisen.java_november.part4.ingredient.vegetable.fruit;

public enum FruitType {
    TOMATO("Помидор"),
    CUCUMBER("Огурец");

    private String title;


    FruitType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return "FruitType {" +
                title + "}";
    }
}
