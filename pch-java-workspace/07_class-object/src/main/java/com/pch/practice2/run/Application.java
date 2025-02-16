package com.pch.practice2.run;

import com.pch.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO1 = new BookDTO();
        BookDTO bookDTO2 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");

        System.out.println(bookDTO1.getInformation());
        System.out.println(bookDTO2.getInformation());
        System.out.println("\n===============================\n");

        bookDTO1.setTitle("C언어");
        bookDTO1.setPrice(30000);
        bookDTO1.setDiscountRate(0.1);
        bookDTO1.setAuthor("홍길동");

        System.out.println("수정된 결과 확인");
        System.out.println(bookDTO1.getInformation());
        System.out.println("\n===============================\n");

        System.out.println(bookDTO1.getRealprice());
        System.out.println(bookDTO2.getRealprice());
    }
}
