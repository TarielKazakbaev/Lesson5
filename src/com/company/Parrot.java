package com.company;

import java.util.Scanner;

public class Parrot {
    private String type;
    private String habitat;
    private String classes;
    private String color;
    private double weight;
    private int lifeExpectancy;
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }
     void name(){
        System.out.println(type);
        System.out.println(habitat);
        System.out.println(classes);
        System.out.println(color);
        System.out.println(weight+" кг");
        if(lifeExpectancy<=0){
            System.out.println("Введите положителное значение возраста");
        }
        else if (lifeExpectancy>0){
            System.out.println(lifeExpectancy+" лет/год");
        }
         System.out.println("");
    }
}
