package com.john.section04.run;

import com.john.section04.dto.Book;

public class Application {
    public static void main(String[] args) {

        Book book = new Book(1,"김택견", "박균",50000);
        // same result
        // reference 변수 출력시 자동으로 toString() 메서드가 호출됨
        System.out.println(book);


        Book book2 = new Book(2, "목민심서", "정약용", 60000);
        System.out.println(book2);
    }
}
