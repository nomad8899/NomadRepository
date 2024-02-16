package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception{

        /* [ 예외를 발생시키는 구문 ]
        *  throw new 예외클래스명();
        *
        * [ 예외 처리 방법 ]
        * 1. throws로 위임
        * 2. try-catch 로 처리
        * */

        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(10000,50000);
        et.checkEnoughMoney(50000,10000);
    }
}
