package com.john.section04.run;

import com.john.section04.dto.Book;

public class Application3 {
    public static void main(String[] args) {
        Book book = new Book(1, "목민심서", "정약용", 60000);
        Book book2 = new Book(1, "목민심서", "정약용", 60000);

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.equals(book2));

        System.out.println("book hashCode: " + book.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());

    }
}
