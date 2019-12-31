package com.primisen.java_november.part4.ingredient.sauce_and_dressing;

public enum SauceType {
    MAYONNAISE("Майонез"),
    SUNFLOWER_OIL("Подсолнечное масло");

    private String title;

    SauceType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return "Title {" +
                title +
                "}";
    }
}
