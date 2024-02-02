package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
//    String name;
//    int hp;

    String name;  //전역변수 == 필드 == 속성 == 인스턴스변수
    int hp; //전역변수

    public void setHp(int hp) {
        if(hp > 0 ) {
            /*
            * this 는 인스턴스가 생성되었을때 자신의 주소를 저장하는 래퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            * 전역변수에 접근하기 위해서 this.을 명시해야한다.
            * */
            this.hp = hp;
        } else {
            System.out.println("음수가 입력되어 몬스터 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}
