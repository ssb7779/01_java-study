package com.minkook.practice2.run;

import com.minkook.practice2.dto.BookDto;

public class Application {
    public static void main(String [] args){
        BookDto bookDto1 = new BookDto();
        System.out.println(bookDto1.getInformation());
        BookDto bookDto2 = new BookDto("자바의정석",20000,0.2,"윤상섭");
        System.out.println(bookDto2.getInformation());

        System.out.println("========================");
        bookDto1.setTitle("C언어");
        bookDto1.setPrice(30000);
        bookDto1.setDiscountRate(0.1);
        bookDto1.setAuthor("홍길동");
        System.out.println(bookDto1.getInformation());
        System.out.println("========================");
        System.out.println("도서명 = " + bookDto1.getTitle());
        System.out.println("할인된 가격 = " +(int)(bookDto1.getPrice() - (bookDto1.getPrice() * bookDto1.getDiscountRate()))+"원");
        System.out.println("도서명 = " + bookDto2.getTitle());
        System.out.println("할인된 가격 = " +(int)(bookDto2.getPrice() - (bookDto2.getPrice() * bookDto2.getDiscountRate()))+"원");

    }
}
