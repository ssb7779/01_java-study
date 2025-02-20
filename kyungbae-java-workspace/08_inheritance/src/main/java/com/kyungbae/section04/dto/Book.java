package com.kyungbae.section04.dto;

import java.util.Objects;

public class Book /*extends Object*/ {

    private int no;
    private String title;
    private String author;
    private int price;

    private Book(){}

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

//    /*
//        ## toString() Override
//        해당 객체의 주소값이 아닌
//        필드값들을 하나의 문자열로 합쳐서 반환하도록
//        (인스턴스 레퍼런스 출력시 자동으로 호출되는 메소드)
//     */
//    @Override
//    public String toString() {
//        return "no=" + no + ", title=" + title + ", author=" + author + ", price=" + price;
//    }
//
//    /*
//        ## equals Override
//        주소값 비교가 아닌 각 인스턴스의 필드값들이 모드 같을 경우 true 반환
//        하나라도 틀리면 false 반환
//     */
//    @Override
//    public boolean equals(Object obj) {
//
//        // book1.equals(book2) 호출됨
//        //  this(book1) vs obj(book2)
//        Book other = (Book)obj; // obj는 Objct 타입이여서 Book타입으로 형변환 해준 뒤 other 변수에 대입
//
//        return /*this.*/no == other.no
//                && title.equals(other.title)
//                && author.equals(other.author)
//                && price == other.price;
//
//    }
//
//    /*
//        ## hashCode() Override
//        인스턴스의 필드값을 가지고 10진수 해시코드를 만들어낸다
//     */
//
//    @Override
//    public int hashCode(){
//        return (title + author + no + price).hashCode();
//    }
//


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
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return no == book.no && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, title, author, price);
    }
}
