package com.sotogito.section04.dto;

import java.util.Objects;

public class Book {
    /**
     * ## java.lang.Object
     * 1. 모든 클래스의 최상위 클래스-> 사용, 재정의 가능
     * - toString() : 객체의 주소를 가지고 "객체의타입+@+주소값의16진수해시코드"문자열 반환
     * - equals(객체2) : 주소값이 일치하는지 비교하여 boolean으로 반환
     * - hashCode() : 객체의 주소값을 가지고 10진수 hashcode를 만들어 반환
     */
    private int no;
    private String title;
    private String author;
    private int price;

    public Book() {
    }


    public Book(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return no == book.no
                && price == book.price
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }


    @Override //주소값을 같게 정의
    public int hashCode() {
        return Objects.hash(no, title, author, price);
    }

}
