package com.company;

public class Horse extends DomesticAnimal {
    private String color;

    public Horse() {

    }


    public Horse(double weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse: " +
                super.toString() +
                ", color - " + color;

    }
}
