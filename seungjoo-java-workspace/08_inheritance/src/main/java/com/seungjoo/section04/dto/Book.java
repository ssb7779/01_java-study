package com.seungjoo.section04.dto;

import java.util.Objects;

public class Book /*extends Object*/ {


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
//
//    @Override
//    public String toString() {
//        return "no=" + no + ", title=" + title + ", author=" + author + ", price=" + price;
//    }

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
    public int hashCode() {
        return Objects.hash(no, title, author, price);
    } //필드들이 전달되면 내부적으로 배열로 받고 31이라는 소수값을 가지고 전달되는 필드값들을 통해서 산술연산 진행


    /*
                equals() 재정의
                주소값 비교가 아닌 각 인스턴스의 필드값들이 모둑 ㅏㅌ을 경우 true반환
                하나라도 틀리면 false 반환하도록
             */
    @Override
    public boolean equals(Object obj) {
        Book other = (Book) obj; //비교를 위해 타입을 일치시킴
        return no == other.no
                && title.equals(other.title)
                && author.equals(other.author)
                && price == other.price;
    }

    /*
     hashCode() 재정의
     */
//    @Override
//    public int hashCode() {
//        return (title + author + no + price).hashCode();
//    }
    //필드값을 가지고 해시코드를 만들도록 재정의해서 모든 필드의 값이 동일하다면 해시코드도 동일하게 됨.
    /*
    자바에서 + 연산자를 사용할 때, String + 다른 타입 (예: int, double)의 경우, 다른 타입은 자동으로 String으로 변환됩니다.
     */


}
