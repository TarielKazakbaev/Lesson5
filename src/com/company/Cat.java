package com.company;

public class Cat {
    String type;
    String habitat;
    String classes;
    String color;
    double weight;
    int lifeExpectancy;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    void name() {
        System.out.println(type);
        System.out.println(habitat);
        System.out.println(classes);
        System.out.println(color);
        System.out.println(weight + " кг");
        if (lifeExpectancy < 0) {
            System.out.println("Введите положителное значение возраста");
        } else if (lifeExpectancy > 0) {
            System.out.println(lifeExpectancy + " лет/год");
        }
        System.out.println("");
    }
}
