package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /*
        * [ FileWriter ]
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림으로,
        * 1글자 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97);
            /* 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다.
            * */
            fw.write('A');
            fw.write(System.lineSeparator());

            fw.write(new char[] {'a','p','p','l','e' ,'\n'});
            fw.write("우리나라 대한민국");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
