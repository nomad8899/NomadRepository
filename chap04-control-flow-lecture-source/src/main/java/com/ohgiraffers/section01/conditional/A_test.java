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

    public void ran3test() {
        Scanner sc = new Scanner(System.in);
        int random100 = (int) (Math.random() * 100) + 1;

        int count = 1;


        for (;; ) {
            count++;
            System.out.println("정수를 입력하세요");
            int sum = sc.nextInt();


            if (random100 > sum) {

                System.out.println("입력하신 정수보다 큽니다.");

            } else if (random100 < sum) {

                System.out.println("입력하신 정수보다 작습니다.");

            } else {
                System.out.println("정답입니다. " + count + " 회 만에 정답을 맞추셨습니다.");
                break;
            }
        }
    }



    /*/* 열심히 일한 판다가 급여를 계산해 보려고 합니다.
     * 월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
     * 축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.
     *
     * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
     * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.
     *
     * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.
     *
     * -- 총 급여 계산식 --
     * 총 급여 = 월 급여  + (매출액 * 보너스율)
     *
     * -- 매출액 대비 보너스율 --
     *   매출액       보너스율
     * 5천만원 이상      5%
     * 3천만원 이상      3%
     * 1천만원 이상      1%
     * 1천만원 미만      0%
     *
     * -- 입력 예시 --
     * 월 급여 입력 : 3000000
     * 매출액 입력 : 20000000
     *
     * -- 출력 예시 --
     * ======================
     * 매출액 : 20000000
     * 보너스율 : 1%
     * 월 급여 : 3000000
     * 보너스 금액 : 200000
     * ======================
     * 총 급여 : 3200000
     * */

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
