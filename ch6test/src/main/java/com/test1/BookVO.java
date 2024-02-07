package com.test1;

public class BookVO {

    String title;
    String publisher;
    String author;
    int price;
    double discount;

    /* 생성자 3가지 */
    public BookVO() {
        System.out.println("기본생성자를 호출");
    }

    public BookVO(String title, String publisher, String author) {
        System.out.println("3가지생성자를 호출");
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookVO(String title, String publisher, String author, int price, double discount) {
        System.out.println("5가지생성자를 호출");
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }
    /* 설정자 */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /* 가지는 자 */
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public  String getinformation() {
        return "BookVO [title = " + this.title + " , publisher = " + this.publisher + " , author = " + this.author +
                " , price = " + this.price + " , discount = " +this.discount+ "]";
    }

}
