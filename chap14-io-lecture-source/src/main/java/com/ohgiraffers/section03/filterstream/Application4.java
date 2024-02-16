package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        /* ObjectInputStream / ObjectOutputStream
        *  - 객체 단위로 입출력하도록 하는 보조 스트림
        * */

        MemberDTO[] outputMembers = {
                new MemberDTO("user01","pass01","홍길동","hong777@ohgiraffers.com",25,'남',1250.7),
                new MemberDTO("user02","pass02","유관순","hong777@ohgiraffers.com",16,'여',1221.6),
                new MemberDTO("user03","pass03","권은지","hong777@ohgiraffers.com",20,'여',1234.6)};
        ObjectOutputStream objOut = null;

//        objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt)));
        }
    /*NotSerializableException이란?
    *직렬화 란?
    * 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록 byte 형태로
    * 역직렬화 란?*/

    MemberDTO [] inputMembers = new MemberDTO[3];
    ObjectInputStream objIn = null;

//    try {
//        objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream()))
//    }
}


