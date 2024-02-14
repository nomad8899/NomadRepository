package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList();

        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add(45.63);
        arrayList.add(new Date());

        System.out.println("arrayList : " + arrayList.get(0));
    }
}
