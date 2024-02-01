package com.ohgiraffers.section01.array;

public class Application4 {
    public static void main(String[] args) {

        /*
         * [카드 뽑기]
         * 1. 문자열 배열에 SPADE, CLOVER, HEART < DIAMOND 를 저장
         * 2. 문자열 배열에 2,3,4,5,6,7,8,9,10 ,JACK,QUEEN, KING, ACE 를 저장
         * 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생 시킨다.
         * 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.
         *
         * ======= 출력예시 =======
         * 당신이 뽑은 카드는 DIAMOND 9 카드 입니다.
         * */
//        Math  = Math.random();
        String[] card1 = new String[]{"SPADE", "CLOVER", "HEART", "DIAMOND"};
                                      // 0        1        2          3
        String[] card2 = new String[]{"2","3","4","5","6","7","8","9","10", "KING","ACE","QUEEN","JACK"};

        int ran1 = (int)(Math.random() * card1.length);
        int ran2 = (int)(Math.random() * card2.length);

        System.out.println("당신이 뽑은 카드는" + card1[ran1] +" "+ card2[ran2] + "입니다.");
    }
}
