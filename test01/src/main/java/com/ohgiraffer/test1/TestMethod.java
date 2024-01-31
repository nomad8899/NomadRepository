package com.ohgiraffer.test1;

import java.util.Scanner;

public class TestMethod {

    public static void Calculator(int a, int b) {


//        TestMethod method1 = new TestMethod(); // 다른 클래스에소 불러올때 사용

        System.out.println("두수의 합은 : " + (a + b) + "입니다.");
        System.out.println("두수를 뺀 값은 : " + (a - b) + "입니다.");
        System.out.println("두수를 곱한 값은 : " + (a * b) + "입니다.");
        System.out.println("두수를 나눈 값은 : " + (a / b) + "입니다.");
        System.out.println("두수를 나누고 난 나머지 값은 : " + (a % b) + "입니다.");

    }

    public static double CircleArea() {


        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("반지름을 입력해주세요");
        int half = sc.nextInt();

        double result = pi * half * half;
        System.out.println("원의 부피 : " + result);

        return result;


    }

    public static void /*or String*/ TestRandom() { //static 이 없어도 정상작동 예시

        int ran = (int) (Math.random() * 10) + 1;


        String result = "생성된 난수는" + ran + "입니다.";
        System.out.println(result);

//        return;
//        return result;

    }


}
