package com.minkook.section04.dto;

import java.util.Objects;

public class Book /*extends Object*/{
    private int no;
    private String title;
    private String author;
    private int price;

    public Book(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(){

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

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    /*
        ##equlas() 재정의
        주소값 비교가 아닌 각 인스턴스의 필드값들이 모드 같을 경우 true반환
        하나라도 틀리면 false 반환하도록
     */
//    @Override
//    public boolean equals(Object obj){
//        //book1.equlas(book2) 호출
//        // this(book1) VS obj(book2)
//
//        Book other = (Book)obj;
//        return this.no == other.no
//                && this.title.equals(other.title)
//                    && this.author.equals(other.author)
//                         && this.price == other.price;
//
//    }
    
    /*
        해쉬코드 재정의
        인스턴스 필드값을 가지고 10진수 해쉬코드를 만들어냄
     */
//    @Override
//    public int hashCode(){
//        return (title + author + no + price).hashCode();
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return no == book.no && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        //필들이 전달되면 내부적으로 배열을 받고
        //31이라는 소수값을 가지고 전달되는 필드값들을 통해서 산술연산 진행
        //동일한 필드값들이 전달됬을경우
        return Objects.hash(no, title, author, price);
    }
}
