package com.test;

import java.util.Scanner;

public class Person {

    /*
    * 사람의 속성 : 이름(String) , 나이(int) , 국적(String), 강아지(클래스) --- 캡슐화
    * */

    private String name;
    private int age;
    private String Country;
    private Puppy myPuppy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return Country;
    }

    public Puppy getMyPuppy() {
        return myPuppy;
    }

    public void setMyPuppy(Puppy myPuppy) {
        this.myPuppy = myPuppy;
    }

    public void setCountry(String cot) {
        /* String[] 국적배열 만든후 반목문 , 조건문 작성 */
        String[] ct = new String[5];
        ct[0] = "한국";
        ct[1] = "일본";
        ct[2] = "중국";
        ct[3] = "홍콩";
        ct[4] = "터키";
        for (String nationalList : ct) {
            if (cot.equals(nationalList)) {

                this.Country = cot;
                break;
            } else {
                this.Country = "한국";

//                System.out.println(Country);

            }
//            break;
        }
        System.out.println(this.Country);
//        System.out.println("한국");
    }

    public void adoptDog() {
        /* 강아지 이름을 입력 받고 , 입력받은 이름을 속성으로 강아지 객체 생성하여
         * 이 사람의 강아지로 설정 */
        Scanner sc = new Scanner(System.in);

        System.out.println("강아지 이름 입력 : ");
        String puppy = sc.next();
//        Puppy pup = new Puppy(puppy);

        this.myPuppy= new Puppy(puppy);

//        System.out.println("입력 받은 강아지 이름 : " +  puppy);
    }

    public void teachDog(/*매개변수*/String[] jeju) {
        /* 강아지 재주 설정*/

        this.myPuppy.setJeju(jeju);



    }

    public void orderToDog() {
        //여기에서 시킬 재주 입력 하는 출력문 작성후 마이퍼피가 입력받은 재주를 하도록 시킴
        Scanner sc = new Scanner(System.in);
        System.out.println("강아지랑 놀아줄까?");
        String jeju = sc.next();
//        this.myPuppy.doSomeVoid(jeju);
        this.myPuppy.doSomeThingVoid(jeju);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Country='" + Country + '\'' +
                ", myPuppy=" + myPuppy +
                '}';
    }
}
