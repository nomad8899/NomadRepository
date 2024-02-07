package com.test1run;

import com.test1.BookVO;

public class Application1 {
    public static void main(String[] args) {

        BookVO bookVO1 = new BookVO(); // 기본생성자 호출 코드
        System.out.println(bookVO1.getinformation());

        BookVO bookVO2 = new BookVO("노르웨이숲","두치","뿌꾸"); // 3가지 생성자 호출 코드
        System.out.println(bookVO2.getinformation());

        BookVO bookVO3 = new BookVO("노르웨이숲","두치","뿌꾸",17000,5.5);
        System.out.println(bookVO3.getinformation());

    }
}
