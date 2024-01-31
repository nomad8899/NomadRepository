package com.ohgiraffers.section03.branching;

public class A_break {

    /* break문은 반복문 내에서 사용한다.
    * 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져나올때 사용한다.
    * 일반적으로  if(조건식) { break; } 처럼 사용된다.
    * 단, Switch 문은 반복문이 아니지만 예외적으로 사용가능하다.
    * */

    public void simpleBreakStatement() {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;    // i를 sum에 대입

            if(i == 100) { //i 가 100이 된다면 브레이크로 빠짐
                break;      //i 가 100인 조건 만족시 반복문 빠져나옴
            }
            i++;
        }
        System.out.println("1 부터 100까지의 합 : " + sum);
    }

    public void simpleBreakStatement2() {
        /* break는 모든 반복문을 종료하는것이 아닌,
        * 자신에게 가장 인접한 반복문만 종료한다. */

        for(int dan = 2; dan < 10; dan++) {
            for(int su = 1; su <10; su++) {
                if(su > 5) {
                    break;
                }
                System.out.println(dan + " * " + su + " = " +(dan*su));
            }
            System.out.println();
        }
    }
    public void testJumpBreak() {
        label:
        for(;;){
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3){
                    break label; //가까운 반복문이 아닌 지정된위치로 빠져나올수 있다,
                }
            }
        }
    }
}
