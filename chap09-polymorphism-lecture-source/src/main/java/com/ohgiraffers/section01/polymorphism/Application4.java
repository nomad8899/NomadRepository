package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        Animal reandomAnimal = app4.getRandomAnimal();
        reandomAnimal.cry();

    }
    public Animal getRandomAnimal() {
        int random = (int)(Math.random() * 2);
        return random == 0? new Cat(): new Tiger();
    }
}
