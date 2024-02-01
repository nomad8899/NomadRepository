package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
         * [깊은 복사(deep copy)]
         * 깊은 복사는 heap 에 생성된 배열이 가진 값을 , 또 다른 배열에 복사하는 것이다.
         * 서로 같은 값을 가지고 있지만, heap 영역에 각각 다르게 생성된 배열이므로
         * 하나의 배열 값을 변경하더라도 다른 배열에 영향을 주지 않는다.
         *
         * [깊은 복사를 하는 방법 4가지]
         * 1. for문을 이용하여 동일한 인덱스의 값 복사
         * 2. object의 clone() 을 이용한 복사
         * 3. Sustem의 arraycopy() 를 이용한 복사
         * 4. Arrays의 copy0f() 를 이용한 복사
         * */

        int[] originArr = new int[]{2, 3, 4, 5};
        System.out.println();

        /*for문을 이용하여 인덱스 값 복사*/
        int[] copyFor = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyFor[i] = originArr[i];
        }
        print("copyFor",copyFor);

        /* Object 의 clone() 을 이용한 복사 */
        int[] copyClone = originArr.clone();
        print("copyClone", copyClone);

        /* System의 arraycopy()를 이용한 복사 */
        int[] copyArraycopy = new int[4];
        /* System.arraycopy(원본배열, 복사를시작할인덱스, 복사본배열, 복사를시작할 인덱스, 복사할길이) */
        System.arraycopy(originArr, 0, copyArraycopy, 0, originArr.length);
        print("copyArraycopy",copyArraycopy);

        /* Arrays의 copyOf() 를 이용한 복사 */
        /*원본배열의 시작 인덱스 부터 원하는 길이 만큼 복사해서 사용 가능 하다.*/
        int[] copyCopyof = Arrays.copyOf(originArr, 4);
        print("copyCopyof", copyCopyof);

        /*[향상된 for문]
        * for(자료형 변수명B : 반복가능한 객체A) {
        *
        * }
        * A 에 들어있는 값을 변수명B로 순서대로 받아온다.
        * */
        int[] tempArr = {3,1,2,3};
        for (int value : tempArr) {
            copyClone[value] = 5;
        }
        /*
        * copyClone[3] = 5;
        * copyClone[1] = 5;
        * copyClone[2] = 5;
        * copyClone[3] = 5;
        * */
        print("수정된 copyClone",copyClone);
        print("copyClone 수정 후 originArr",originArr);

    }

    public static void print(String name, int[] arr) {
        System.out.println(name + "의 hashCode() : " + arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
