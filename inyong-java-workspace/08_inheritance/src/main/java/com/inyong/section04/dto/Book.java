package com.inyong.section04.dto;

import java.util.Objects;

public class Book {
/*
java.lang.Object
1. 모든 클래스(직접 작성한 클래스, 자바에서 제공하는 클래스)들의 최상위 클래스
2. 모든 객체들은 Object의 후손이므로
    Object(부모)에 정의되어있는 메소드들을 사용할 수 있음
3. Object(부모)에 정의되어있는 메소드를 오버라이딩(재정의) 할 수 있음
4. 대표적인 메소드
    1) 객체.toString()    : 객체의 주소값을 가지고 "객체의 타입 + @ + 주소값의 16진수해서 코드 문자열 반환
    2) 객체1.equals(객체2) : 객체1과 객체2의 주소값(참조값)이 일치하는지를 비교해서 true|false 반환
    3) 객체.hasCode()     : 객체의 주소값을 가지고 10진수해쉬코드를 만들어 반환


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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    /*
    ## toString() 재정의

    해당 객체의 주소값이 아닌
    필드값들을 하나의 문자열로 합쳐서 반환하도록
    (인스턴스 래퍼런스 출력시 자동으로 호출되는 메소드)


     */

    @Override
    public String toString() {
        return " 오버라이딩~";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return no == book.no && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

//    @Override
//    public  int hashCode(){
//        return (title + author + no + price).hashCode();
//    }

    @Override
    public int hashCode() {
        // 필드들이 전달되면 내부적으로 배열로 받고 31 이라는 소수값을 가지고 전달되는 필드값을 통해서 산술연산 진행
        // >> 동일한 필드값들이 전달됐을 경우, 동일한 산술연산 값이 만들어져서
        return Objects.hash(no, title, author, price);
    }
}

