package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    /* extends 키워드로 클래스를 상속 받을 때 두개 이상의 클래스는 상속하지 못한다.
    *   추상클래스가 가지는 추상 메소드를 반드시 오버라이딩 해야 한다. (강제성 부여)
    * */
    public  SmartPhone() {}
    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출됨");

    }
    public  void  printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함");
    }
}
