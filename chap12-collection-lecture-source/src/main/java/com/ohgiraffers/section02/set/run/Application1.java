package com.ohgiraffers.section02.set.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        /* [Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징 ]
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *
        * [HashSet 클래스 ]
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * JDK 1.2 부터 제공되고 있으며 해시 알고리즘을 사요하여 검색 속도가 빠르다는 장점을 가진다.
        * */

        HashSet<String> hset = new HashSet<>();
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset : " + hset);

        hset.add("java");
        System.out.println("hset : " + hset);
        System.out.println("저장된 객체수 : " + hset.size());
        System.out.println("포함확인 : " + hset.contains("css"));

        /* toArray() : HashSet 에 저장된 모든 요소를 포함하는 새로운 'Object' 타입의 배열 반환 */
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " +arr[i]);
        }
        /* iterator() : Collection 인터페이스의 메소드로 , Collection 에 저장된
        *               요소들을 순차적으로 접근하는데 사용되는 Iterator를 반환함.*/
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        hset.clear();
        System.out.println("empty? : " + hset.isEmpty());
        System.out.println(hset.size());
    }
}
