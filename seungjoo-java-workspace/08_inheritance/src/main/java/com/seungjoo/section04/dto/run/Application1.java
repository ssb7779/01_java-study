package com.seungjoo.section04.dto.run;

import com.seungjoo.section04.dto.Book;

public class Application1 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println("book1:" + book1);
        System.out.println("book1.toString():" + book1.toString()); //레퍼런스 변수를 출력한거랑 toString()출력한것이랑 결과가 동일
        System.out.println("book2:" + book2);
        System.out.println("book2.toString():" + book2.toString());
    }
}
