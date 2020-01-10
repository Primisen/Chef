package com.primisen.java_november.part4.utility;

public class RecipeReader {

    private String path;
    private String textToParse;

    public RecipeReader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTextToParse() {
        return textToParse;
    }

    public void setTextToParse(String textToParse) {
        this.textToParse = textToParse;
    }
}
