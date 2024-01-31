package com.ohgiraffer.test1;

public class Application1 {

    public static void main(String[] args) {

        //1.
        byte byt = 1;
        short sho = 2;
        int in = 3;
        long lon = 4;
        float flo = 1.2f;
        double dou = 2.1;
        boolean boo = true;
        char cha = 'a';

//        int sd = (long)4;

        //2.
        int su = (int) (in + lon);

        //3.
        int plus = 5;


        String sam = (plus >= 0)? "양수입니다." : "음수입니다.";
        System.out.println("plus 의 값은? : " + sam);



    }
//    TestMethod t = new TestMethod();
//    t

}
