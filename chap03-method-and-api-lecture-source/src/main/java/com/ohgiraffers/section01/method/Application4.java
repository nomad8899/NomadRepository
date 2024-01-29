package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        /*여러 개의 전달 인자를 이용한 메소드 호출 테스트 */

        Application4 app4 = new Application4();
        app4.testMethod("진영",25,'남'); // 메소드 작성 순서에 유의할것 (이름, 나이, 성별순)
//        app4.testMethod(24,"진영",'M'); // 값의 개수는 맞지만 순서가 다르게 전달시 호출불가.

        String name = "진영";
        int age= 26;
        char gender = '남';

        gender = '여';

        app4.testMethod(name,age,gender); // 순서 유의


    }
    public void testMethod(String name, int age, final char gender) {
        /*매개변수도 일종의 지역변수로 분류된다.
        * 매개변수 역시 final 키워드를 사용할 수 있다.
        * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
        * final 매개 변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.
        * */
        name = "진영";
        age = 50;
//        gender ='여'  // 메소드 안에서 파이널 키워드 적용을 해주었기 때문에 해당 메소드 안에서는 변경 불가능
        System.out.println("당신의 이름은 " + name + "이고, 나이는" + age + "세 이며, 셩별은 " + gender + "입니다.");
    }
}
