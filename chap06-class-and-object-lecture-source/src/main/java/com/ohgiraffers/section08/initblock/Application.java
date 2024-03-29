package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {
        /*
        * 초기화 블럭
        * 1. 인스턴스 초기화 블럭
        *   인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
        *   인스턴스를 호출하는 시점마다 호출이 된다.
        *   인스턴스변수를 초기화하며 정적(static)필드에는 실행시점마다 값을 덮어쓴다.
        *  {
        *       초기화 내용 작성
        *  }
        * 2. 정적 초기화 블럭
        *   클래스가 로드 될때 한번 동작한다.
        *   정적 필드를 초기화 하며, 인스턴스 변수는 초기화 하지 못한다.
        *  static {
        *       초기화 내용 작성
        *  }
        * */

        Product pro = new Product();
        /*초기화 블럭이 명시적 초기 값을 덮어 쓴다.*/
        System.out.println(pro.getInformation());

        /*매개변수 있는 생성자를 이용한 초기화 확인*/
        Product product2 = new Product("캐모마일차",4200,"투썸");
        System.out.println(product2.getInformation());

        /* 여기서 알 수 있는 초기화 순서는
        * 인스턴스변수 : 기본값 -> 명시적초기값 -> 인스턴스 초기화 블럭 -> 생성자
        * 클래스 변수 : 기본값 -> 명시적초기값 -> 정적 초기화 블럭 -> 인스턴스초기화블럭 -> 생성자
        * */
    }
}
