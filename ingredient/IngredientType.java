package com.primisen.java_november.part4.ingredient;

public enum IngredientType {
    ROOT_CROP("Корнеплодный"),
    LEAFY("Листовой"),
    FRUIT("Плодовый"),
    DRESSING("Заправка"),
    FLAVOURING("Специя");

    private String name;

    IngredientType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
