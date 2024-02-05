package com.ohgiraffers.practis.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {


        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

        String[] fruit = new String[]{"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);

        System.out.println("0 부터 4 까지의 정수를 입력하세요 : ");
        int sum = sc.nextInt();


        if(sum <= 4){
            System.out.println(fruit[sum]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
//            System.out.println(fruit[sum]);

//        int ran1 = (int)(sum  fruit.length);
//
//        (ran1);
//        for (int i = 0; i <= fruit.length; i++) {
//            if (i == 0) {
//
//            }
//
//        }
        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1*****
         */


    }


}
