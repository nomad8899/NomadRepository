package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        /*
        * [ DTO ]
        * 캡슐화 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진 클래스와 객체를 추상화 하는 기법.
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체 (Data Transfer Object) 의 경우 이다.
        * 캡슐화의 원칙을 준수하여 모든 필드를 private로 설정해 직접 접근을 막고,
        * 각 필드 값을 변경하거나 반환하는 메소드를 세트로 미리 작성한다.
        * private 필드와 필드값을 수정하는 설정자 (setter), 필드에 접근하는 접근자(getter)들로 구성된다.
        * 주로 게층간 데이터를 주고 받을 목적으로 사용한다.
        * */

        MemberDTO memberDTO = new MemberDTO();

        /* setter 메소드를 이용해 필드에 값 대입 */

        memberDTO.setNumber(1);
        memberDTO.setName("박진영");
        memberDTO.setAge(25);
        memberDTO.setGender('남');
        memberDTO.setHeight(185.3);
        memberDTO.setWeight(73.3);
        memberDTO.setActivated(true);

        System.out.println("회원번호 : " +memberDTO.getNumber());
        System.out.println("회원명 : " +memberDTO.getName());
        System.out.println("회원나이 : " +memberDTO.getAge());
        System.out.println("회원성별 : " +memberDTO.getGender());
        System.out.println("회원키 : " +memberDTO.getHeight());
        System.out.println("회원무게 : " +memberDTO.getWeight());
        System.out.println("회원 활성화 샅애 : " +memberDTO.isActivated());




    }
}
