package com.john.section04.dto;

/*
    자바 Object 클래스
        1. 모든 클래스들의 최상위 클래스(직접 작성한 클래스 포함)
        2. 모든 객체들은 Object의 자식 클래스로 Object에 정의 되어있는
            메서드들 사용 가능, 메서드 오버라이딩 가능
        3. 메서드 오버라이딩의 예(toString(), equals()..) ==> 주소값기반...


 */

import java.util.Objects;

public class Book {

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



    /*
        Object의 toString() 재정의
     */
    @Override
    public String toString() {
        return "Book [no=" + no + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

//    /*
//        Object의 equals() 재정의
//        => 동일객체가 아닌 동등객체
//     */
//    @Override
//    public boolean equals(Object obj) {
//

    /// /        book.equals(book2) 호출
    /// /        this = book, obj = book2
    /// /        this(book) VS obj(book2)
    /// /        obj.no 의 경우 Object 클래스의 no를 찾음
//        Book other = (Book) obj; // 비교하기 위해 타입을 일치시킴
//        return (this.no == other.no)
//                && (this.price == other.price)
//                && (this.title.equals(other.title)
//                && (this.author.equals(other.author)));
//    }
//
//    /*
//        Object의 hashCode() 재정의
//        주소값 기반으로 만들어지는 기존 메서드 => 값을 기준으로 hashCode()를 새로 만듬
//        equals 메서드의 결과도 true, 각 인스턴스의 hashCode 값 마저도 같아야 됨
//     */
//    @Override
//    public int hashCode() {
//        return (title + author + no + price).hashCode();
//    }

    // Auto Create(Alt + insert => equals and hashCode)
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return no == book.no && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    /*
        필드들이 전달되면 내부적으로 배열을 받고
        31이라는 소수값을 가지고 전달되는 필드값들을 통해 산술연산진행
        => 동일한 필드값들이 전달됐을 경우, 동일한 산술연산 값이 만들어져서 비교
     */

    @Override
    public int hashCode() {
        return Objects.hash(no, title, author, price);
    }
}
