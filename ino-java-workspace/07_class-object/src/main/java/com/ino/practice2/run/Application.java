package com.ino.practice2.run;

import com.ino.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");
        BookDTO book2 = new BookDTO("자바의 활용", 40000, 0.3, "문인호");

        System.out.println(book1.getInformation());
        System.out.println(book2.getInformation());

        book1.setPrice(60000);
        System.out.println(book1.getInformation());
        System.out.println(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate()));

    }
}
