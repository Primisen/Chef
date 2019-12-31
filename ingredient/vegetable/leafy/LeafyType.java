package com.primisen.java_november.part4.ingredient.vegetable.leafy;

public enum LeafyType {
    PARSLEY("Петрушка");

    private String title;

    LeafyType(String title) {
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
