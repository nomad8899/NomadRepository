package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        System.out.println("========================================");

        Monster monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        System.out.println("========================================");

        Monster monster3 = new Monster();

        monster3.name = "드라큘라";
        monster3.setHp(-200);

        System.out.println("monster4 name : " + monster3.name);
        System.out.println("monster4 hp : " + monster3.hp);


    }
}
