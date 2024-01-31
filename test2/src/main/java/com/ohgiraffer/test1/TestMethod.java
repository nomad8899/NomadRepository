package com.ohgiraffer.test1;

import java.util.Scanner;

public class TestMethod {

    /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 10
     *
     * -- 출력 예시 --
     * 1부터 10까지 짝수의 합 : 30
     * */

    public void ssd() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int su = sc.nextInt();

//        int jjak = (su % 2 == 0);
        int num = 0;


        for (int i = 1; i <= su; i++) {

            if(i % 2 == 0) {
                num += i;
            }


        }
        System.out.println("1부터 " + su + "까지 짝수의 합 : "+ num);
    }
    public void ssd2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(i % 2 ==0) {
                System.out.print("마");
            } else {
                System.out.print("토");
            }
        }
    }
}


