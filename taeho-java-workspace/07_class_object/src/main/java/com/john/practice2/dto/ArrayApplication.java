package com.john.practice2.dto;

public class ArrayApplication {
    public static void main(String[] args) {
        BookDTO[] books = {
                new BookDTO()
                , new BookDTO("자바의정석", 20000, 0.2, "윤상섭")
        };

        for (BookDTO book : books) {
            System.out.println(book.getInformation());
        }
        System.out.println("===================================");

        books[0].setTitle("C언어");
        books[0].setPrice(30000);
        books[0].setDiscountRate(0.1);
        books[0].setAuthor("홍길동");

        System.out.println(books[0].getInformation());
        System.out.println("===================================");

        for (BookDTO book : books) {
            System.out.println(book.getInformation(book.getTitle(),book.getPrice(),book.getDiscountRate()));
        }
    }
}
