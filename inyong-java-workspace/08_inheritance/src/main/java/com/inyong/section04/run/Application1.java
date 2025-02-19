package com.inyong.section04.run;

import com.inyong.section04.dto.Book;

public class Application1 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "홍길동전2", "허위", 60000);

        System.out.println("book1"+ book1);
        System.out.println("book1.toString(): " + book1.toString());

        System.out.println("book2"+ book2);
        System.out.println("book2.toString(): " + book2.toString());

        /*
        toString()을 직접 호출하지 않고 래퍼런스 변수 제시만해도 결과는 동일
        왜? : 레퍼런스변수 출력시 자동으로 .toString() 메소드가 호출됨
         */
    }
}
