package com.primisen.java_november.part4.ingredient;

//провести честку закомментированных полей
public class Ingredient implements Comparable<Ingredient> {

//    private IngredientType type; //удален из конструктора
    private String name;
    private double weight;
    private int calorie;
    private double carbohydrates; //углеводы
    private double fits; //жиры
    private double proteins; //белки

    public Ingredient(){}

    public Ingredient(String name, double weight, int calorie, double carbohydrates, double fits, double proteins) {
        this.name = name;
        this.weight = weight;
        this.calorie = calorie;
        this.carbohydrates = carbohydrates;
        this.fits = fits;
        this.proteins = proteins;
    }

//    public IngredientType getType() {
//        return type;
//    }
//
//    public void setType(IngredientType type) {
//        this.type = type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFits() {
        return fits;
    }

    public void setFits(double fits) {
        this.fits = fits;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    //
    @Override
    public int compareTo(Ingredient ingredient) {
        return this.getCalorie() - ingredient.getCalorie();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
//        sb.append("type=").append(type);
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", calorie=").append(calorie);
        sb.append(", carbohydrates=").append(carbohydrates);
        sb.append(", fits=").append(fits);
        sb.append(", proteins=").append(proteins);
        sb.append('}');
        return sb.toString();
    }
}
