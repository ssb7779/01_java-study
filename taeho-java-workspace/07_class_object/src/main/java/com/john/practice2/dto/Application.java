package com.john.practice2.dto;

public class Application {
    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();
        System.out.println(bookDTO.getInformation());
        System.out.println("===================================");
        BookDTO bookDTO2 = new BookDTO("자바의정석", 20000, 0.2, "윤상섭");
        System.out.println(bookDTO2.getInformation());

        bookDTO.setTitle("C언어");
        bookDTO.setPrice(30000);
        bookDTO.setDiscountRate(0.1);
        bookDTO.setAuthor("홍길동");

        System.out.println(bookDTO.getInformation(bookDTO.getTitle(),bookDTO.getPrice(),bookDTO.getDiscountRate()));
        System.out.println(bookDTO2.getInformation(bookDTO2.getTitle(),bookDTO2.getPrice(),bookDTO2.getDiscountRate()));
    }
}
