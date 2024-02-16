package com.test;

import java.util.Arrays;

public class Puppy {
    /*
    * 강아지 속성 : 이름(String) , 재주(String[])*/

    private String name;
    private String[] jeju;

    public Puppy(String name) {
        this.name = name;

    }

    /**/
    public void setJeju(String[] jeju) {
        this.jeju = jeju;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", jeju=" + Arrays.toString(jeju) +
                '}';
    }

    //    public void learnAbility(/*매개변수*/String sit,String bang,String wait) {
//
//        if (sit == "앉아"){
//            System.out.println("강아지가 앉습니다.");
//        } else if (bang)
//    }

    /* 강아지의 정보가 출력되는
    * 조회메소드
    * 이름과 재주가 출력 되도록하기
    * (재주는 배열이라 FOr문 사용*/

    /* Puppy의 반환타입인 void인 메소드 호출 */
    public void doSomeThingVoid(/*매개변수ㅇ*/String skill) {
        /* switch문 사용 작성 */

        switch (skill) {
            case "앉아" : skill = "가 앉습니다"; break;
            case "빵" : skill = "가 드러눕습니다"; break;
            case "기다려" : skill = "가 가만히 기다립니다"; break;
            default:
                System.out.println(name + "가 아직 배우지 않은 재주입니다"); return;

        }


        System.out.println(name + skill);
    }

    public String doSomeThing2Void(/*매개변수ㅇ*/String skill) {
        /* switch문 사용 작성 */

        switch (skill) {
            case "앉아" : return skill = "가 앉습니다";
            case "빵" : skill = "가 드러눕습니다"; break;
            case "기다려" : skill = "가 가만히 기다립니다"; break;
            default:
                System.out.println(name + "가 아직 배우지 않은 재주입니다"); return;

        }


        System.out.println(name + skill);
    }






    /*3 boolean 반환*/
    public boolean doSomeVoid(/*매개변수ㅇ*/String skill) {
        /* switch문 사용 작성 */

        switch (skill) {
            case "앉아" :
                return true;
            case "빵" :
                return true;
            case "기다려" :
                return true;
            default:
                return false;

        }


    }
}
