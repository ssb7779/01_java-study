package com.john.section04.run;

import com.john.section04.dto.Book;

/*
    ## 동일 객체 동등 객체
        동일 객체 : 주소가 같음
        동등 객체 : 객체를 구성하고 있는 값이 전부 동일
 */
public class Application2 {
    public static void main(String[] args) {
        Book book = new Book(2, "목민심서", "정약용", 60000);
        System.out.println("book Result:" + book);

        Book book2 = new Book(2, "목민심서", "정약용", 60000);
        System.out.println("book2 Result:" + book);

        System.out.println("book == book2: " + (book == book2));
        System.out.println("book.equals(book2): " + (book.equals(book2))); // 주소값 비교

    }
}
