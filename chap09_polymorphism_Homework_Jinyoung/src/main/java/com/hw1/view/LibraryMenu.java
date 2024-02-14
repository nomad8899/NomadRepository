package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
        private LibraryManager lm = new LibraryManager();
        Scanner sc = new Scanner(System.in);



        public void mainMenu() {



            System.out.println("이름을 입력해주세요 : ");
            String name = sc.nextLine();
            System.out.println("나이를 입력해주세요 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("성별을 입력해주세요 : ");
            char gender = sc.nextLine().charAt(0);

            Member mem = new Member(name,age,gender);
            lm.insertMember(mem);
            boolean pro = true;

            while (pro){

                System.out.println("=====메뉴=====");
                System.out.println("1. 마이 페이지");
                System.out.println("2. 도서 전체 조회");
                System.out.println("3. 도서 검색");
                System.out.println("4. 도서 대여하기");
                System.out.println("0. 프로그램 종료하기");

                int num = sc.nextInt();

                switch (num) {
                    case 1 :
                        System.out.println(lm.myInfo()); break;
                    case 2 : selectAll(); break;
                    case 3 : searchBook(); break;
                    case 4 : rentBook(); break;
                    case 0 :
                        System.out.println("프로그램 종료");
                        pro = false;
                }
            }




        }
        public void selectAll() {
            Book[] bList = lm.selectAll();

            for(int i = 0; i < bList.length; i++) {
                System.out.println(i + "번 도서 : " + bList[i]);
            }
        }
        public void searchBook() {
            System.out.println("검색할 제목 키워드");
            String keyword = sc.nextLine();
            lm.searchBook(keyword);

        }
        public void rentBook () {
        }


}