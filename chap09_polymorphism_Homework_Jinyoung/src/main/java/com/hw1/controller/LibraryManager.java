package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;
import com.hw1.view.LibraryMenu;

import java.util.Arrays;

public class LibraryManager {
    private Member mem;

    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

    }

    public void insertMember(Member mem2) {

        this.mem = mem2;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
         return bList;
    }

    public Book[] searchBook(String keyword) {
        Book[] books = new Book[5];
        int count = 0;
        for (Book books1 : bList ) {
            if(books1.getTitle().contains(keyword)) {

                books = bList;

                count++;

            }
        }
        return books;

//        for(int i = 0; i < books.length; i++) {
//            if(bList[i].getTitle().contains(keyword)) {
//
//
//            }
//        }
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }

}
