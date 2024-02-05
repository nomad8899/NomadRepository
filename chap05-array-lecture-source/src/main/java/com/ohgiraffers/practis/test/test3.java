package com.ohgiraffers.practis.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1*****
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호를 입력하세요 : ");
        String count = sc.nextLine();

//        String array = array[count,7,13];
        if (count.length() >= 14) {
            String maskedString = maskString(count, 8, 14);
            System.out.println(maskedString);
        }
    }
    public static String maskString(String count, int start, int end) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = start; i < end; i++) {
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}
