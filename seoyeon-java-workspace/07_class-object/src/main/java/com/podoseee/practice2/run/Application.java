package com.podoseee.practice2.run;

import com.podoseee.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        BookDTO book2 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");
        System.out.println(book2.getInformation());

        System.out.println("===============================================");

        book1.setTitle("C언어");
        book1.setPrice(30000);
        book1.setDiscountRate(0.1);
        book1.setAuthor("홍길동");

        System.out.println("수정된 결과 확인");
        System.out.println(book2.getInformation());

        System.out.println("===============================================");

        System.out.println("도서명 = " + book1.getTitle());
        System.out.println("할인된 가격 = " + (int)(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate())) + "원");

        System.out.println("도서명 = " + book2.getTitle());
        System.out.println("할인된 가격 = " + (int)(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate())) + "원");

    }
}
