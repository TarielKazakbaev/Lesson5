package com.company;

public class Main {

    public static void main(String[] args) {


        Parrot parrotOne = new Parrot();
        parrotOne.setType("Какаду");
        parrotOne.setHabitat("Австралия");
        parrotOne.setClasses("Птицы");
        parrotOne.setColor("Белый");
        parrotOne.setWeight(0.400);
        parrotOne.setLifeExpectancy(14);


        Fish fishOne = new Fish();
        fishOne.setType("Форель");
        fishOne.setHabitat("Горные реки");
        fishOne.setClasses("Рыбы");
        fishOne.setColor("Радужный");
        fishOne.setWeight(12);
        fishOne.setLifeExpectancy(11);


        Dog dogOne = new Dog();
        dogOne.setType("Питбуль");
        dogOne.setHabitat("Америка");
        dogOne.setClasses("Собаки");
        dogOne.setColor("Коричневый");
        dogOne.setWeight(25);
        dogOne.setLifeExpectancy(15);


        Cat catOne = new Cat();
        catOne.setType("Сиамская");
        catOne.setHabitat("Тайланд");
        catOne.setClasses("Кошачьи");
        catOne.setColor("Белый");
        catOne.setWeight(5);
        catOne.setLifeExpectancy(14);

        fishOne.name();
        parrotOne.name();
        dogOne.name();
        catOne.name();
    }
}

