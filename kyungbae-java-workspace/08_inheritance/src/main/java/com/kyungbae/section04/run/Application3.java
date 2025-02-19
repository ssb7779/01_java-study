package com.kyungbae.section04.run;

import com.kyungbae.section04.dto.Book;

public class Application3 {

    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());



    }

}
