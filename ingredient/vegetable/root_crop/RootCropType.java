package com.primisen.java_november.part4.ingredient.vegetable.root_crop;

public enum RootCropType {
    BOW("Лук");

    private String title;

    RootCropType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return "Title {" +
        title + "}";
    }
}
