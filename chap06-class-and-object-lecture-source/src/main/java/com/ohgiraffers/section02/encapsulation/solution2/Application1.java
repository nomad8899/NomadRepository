package com.ohgiraffers.section02.encapsulation.solution2;

public class Application1 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
//        monster1.kinds = "프랑키"; //error
//        monster1.hp = 200;

        monster1.setkinds("프랑키");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
    }
}
