package com.ohgiraffers.practis.test;

public class test4 {
    public static void main(String[] args) {
        int[] ran = new int[5];

        int ran1 = (int)(Math.random() * 45)+1;
        int ran2 = (ran1 + ran.length);



        for (int i = 0; i < ran.length; i++) {
            for (int j = i + 1; j < ran.length; j++) {
                /*부등호만 반대로 처리 하면 내림차순 정렬이 됨*/
                if (ran[i] > ran[j]) {
                    int temp = ran[i];
                    ran[i] = ran[j];
                    ran[j] = temp;
                }
            }
        }
        for (int i = 0; i < ran.length; i++) {
            System.out.println(ran[i]+" ");
        }
    }
}
