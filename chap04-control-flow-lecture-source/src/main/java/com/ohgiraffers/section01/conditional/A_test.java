package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_test {

    public void pandaPanda() {

        Scanner sc = new Scanner(System.in);

        System.out.println("나이가 어떻게 되세요?");
        int age = sc.nextInt();

        if (age <= 19) {
            System.out.println("미성년자 이므로 판매 불가입니다.");
            return;

        }
        System.out.println("판매 가능합니다.");
    }

    public void pandaPandaEvent() {

        Scanner sc = new Scanner(System.in);

        System.out.println("당첨 번호가 어떻게 되세요?");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
            return;
        } else if ((num % 2) == 0) {
            System.out.println("짝수네요! 인형 선물입니다.");
            return;
        }
        System.out.println("홀수네요 모자 선물입니다.");

    }

    public void panPandaHello() {

        Scanner sc = new Scanner(System.in);

        System.out.println("성실 점수 : ");
        int sung = sc.nextInt();
        System.out.println("서비스 점수 : ");
        int service = sc.nextInt();
        System.out.println("미소 점수 : ");
        int smile = sc.nextInt();

        int total = (sung + service + smile);

        /*성따로 서비스따로 미소따로 이프문 하고 밑줄에 다같이 평균 값을 구하는 */

        if (sung < 40) {
            System.out.println("성실 점수 미달로 불합격입니다.");
            return;
        } else if (service < 40) {
            System.out.println("서비스 점수 미달로 불합격입니다.");
            return;
        } else if (smile < 40) {
            System.out.println("미소 점수 미달로 불합격입니다.");
            return;
        } else if ((total / 3) < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
            return;
        }
        System.out.println("합격입니다!");

    }

//    public void panPandacash() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("월 급여액은? :");
//        int cash = sc.nextInt();
//        System.out.println("총 매출액은? :");
//        int totalCash = sc.nextInt();
//
//        int bonus5 = 5%;
//        int bonus3 = 3%;
//        int bonus1 = 1%;
//        int bonusM1 = -1%;
//
//
//        switch (totalCash) {
//            case bonus5 :
//                totalCash = totalCash * 5; break;

//        }
//    }
}
