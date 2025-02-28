package com.jun.practice2.run;

import com.jun.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO();
        System.out.println(book1.getInformation());
        BookDTO book2 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");
        System.out.println(book2.getInformation());

        System.out.println("===============================");

        System.out.println("수정된 결과 확인");

        BookDTO book3 = new BookDTO("C언어", 30000, 0.1, "홍길동");
        System.out.println(book3.getInformation());

        System.out.println("===============================");





    }
}
