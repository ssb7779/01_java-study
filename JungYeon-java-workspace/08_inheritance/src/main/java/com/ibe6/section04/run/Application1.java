package com.ibe6.section04.run;

import com.ibe6.section04.dto.Book;

public class Application1 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println("book1: " + book1);
        System.out.println("book1.toString(): " + book1.toString());
        System.out.println("book2: " + book2);

        /*
            toString()을 직접 호출하지 않고 레퍼런스 변수 제시만 해도 결과는 동일
            왜? : 레퍼런스 변수 출력시 자동으로 .toString()메소드가 호출됨
         */

    }
}
