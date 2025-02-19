package com.seungjoo.section04.dto.run;

import com.seungjoo.section04.dto.Book;

public class Application2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"홍길동전", "허균", 50000);
        Book book2 = new Book(1,"홍길동전", "허균", 50000);

        System.out.println("boo1" + book1);
        System.out.println("boo2" + book2);

        System.out.println("두 인스턴스의 == 비교:" + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교:" + book1.equals(book2));// Object 클래스의 equals 메소드 : 주소값 비교


    }
}
