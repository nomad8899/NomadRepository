package com.ohgiraffers.practis.test;

public class test1 {
    public static void main(String[] args) {

        int[] array = {5, 3, 9, 2, 4, 1, 7, 6, 8};
        // 배열 출력 (정렬 전)
        System.out.println("정렬 전");
        printArray(array);

        // 버블 정렬을 이용한 배열 정렬
        bubbleSort(array);

        // 배열 출력 (정렬 후)
        System.out.println("정렬 후");
        printArray(array);
    }

    // 배열 출력 메서드
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "      ");
        }
        System.out.println();
    }

    // 버블 정렬을 이용한 배열 정렬 메서드
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 두 요소의 위치를 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


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


//    public static void main(String[] args) {


//        String[] =new String[]{"딸기", "바나나", "복숭아", "키위", "사과"}
    }

