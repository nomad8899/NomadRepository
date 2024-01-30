package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void simpleSwitchStatement() {

        /*
         * [switch문 표현식]
         * switch(비교할 변수) {
         *   case 비교값1 : 비교할 변수의 값 == 비교값1 인 경우 실행할 구문 ; break;
         *   case 비교값2 : 비교할 변수의 값 == 비교값2 인 경우 실행할 구문 ; break;
         *   default : 위 case에 모두 해당하지 않는 경우 실행할 구문; break;
         * }
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();
        System.out.println("연산 기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        /* 연산 결과를 저장할 변수 */
        int result = 0;

        switch(op) {
            case '+' : result = firstNum + secondNum; break;
            case '-' : result = firstNum - secondNum; break;
            case '*' : result = firstNum * secondNum; break;
            case '/' : result = firstNum / secondNum; break;
            case '%' : result = firstNum % secondNum; break;
            default:
                System.out.println("잘못된 연산자를 입력하였습니다."); break;
        }
        System.out.println(firstNum + " " + op + " " + secondNum + " " + result);

    }

    public void switchVendingMachine() {

        /* <switch-case>문 이용 실습
        *   1. Scanner를 이용해 음료 이름(String) 과 개수(int)를 입력받는다.
        *   2. switch-case 문을 사용해 전체 가격을 구한다.
        *   3. ['음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해 주세요. ]
        *       위와 같이 출력 되도록 한다.*/

        System.out.println("================Ohgiraffers Vending Machine==================");
        System.out.println("/* 코카콜라 1,700 / 환타 1,200 / 하늘보리 1,000 / 핫식스 2,000 */");
        System.out.println("============================================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("음료 이름 : ");
        String juice = sc.next();
        System.out.println("음료 개수 : ");
        int much = sc.nextInt();

        int price = 0;



        switch (juice) {
            case  "코카콜라" : price = 1700 * much; break;
            case  "환타" : price = 1200 * much; break;
            case  "하늘보리" : price = 1000 * much; break;
            case  "핫식스" : price = 2000 * much; break;
            default:
                System.out.println("응답 없음.."); return;  //많이 쓰는 형식
        }



        System.out.println(juice + "를" + much + "개 선택하셨습니다." + price +"을 투입해주세요.");
    }
}
