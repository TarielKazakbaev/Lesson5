package com.company;

import java.util.Scanner;

public class HomeWorkClass {

    public static void main(String[] args) {


        Parrot parrotOne = new Parrot();
        parrotOne.type = "Какаду";
        parrotOne.habitat = "Австралия";
        parrotOne.classes = "Птицы";
        parrotOne.color = "Белый";
        parrotOne.setWeight(0.400);
        parrotOne.setLifeExpectancy(14);


        Fish fishOne = new Fish();
        fishOne.type = "Форель";
        fishOne.habitat = "Горные реки";
        fishOne.classes = "Рыбы";
        fishOne.color = "Радужный";
        fishOne.setWeight(12);
        fishOne.setLifeExpectancy(11);


        Dog dogOne = new Dog();
        dogOne.type = "Питбуль";
        dogOne.habitat = "Америка";
        dogOne.classes = "Собаки";
        dogOne.color = "Коричневый";
        dogOne.setWeight(25);
        dogOne.setLifeExpectancy(15);


        Cat catOne = new Cat();
        catOne.type = "Сиамская";
        catOne.habitat = "Тайланд";
        catOne.classes = "Кошачьи";
        catOne.color = "Белый";
        catOne.setWeight(5);
        catOne.setLifeExpectancy(20);


        parrotOne.name();
        fishOne.name();
        dogOne.name();
        catOne.name();
    }
}

