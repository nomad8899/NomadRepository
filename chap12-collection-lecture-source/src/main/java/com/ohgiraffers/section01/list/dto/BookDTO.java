package com.ohgiraffers.section01.list.dto;

public class BookDTO {

    private int number;
    private String author;
    private String title;
    private int price;

    public BookDTO() {}

    public BookDTO(int number, String author, String title, int price) {
        this.number = number;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
