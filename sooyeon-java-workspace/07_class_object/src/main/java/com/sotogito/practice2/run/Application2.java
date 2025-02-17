package com.sotogito.practice2.run;

import com.sotogito.practice2.dto.BookDTO;

public class Application2 {
    public static void main(String[] args) {
        BookDTO[] books = new BookDTO[2];

        books[0] = new BookDTO();
        books[1] = new BookDTO(
                "자바의정석", 20000, 0.2, "윤상섭"
        );

        for (BookDTO dto : books) {
            System.out.println(dto.getInformation());
        }


        for (BookDTO dto : books) {
            if (dto.getTitle() == null) {
                dto.setTitle("C언어");
                dto.setPrice(30000);
                dto.setDiscountRate(0.1);
                dto.setAuthor("홍길동");
            }
        }

        for (BookDTO dto : books) {
            System.out.println(dto.getInformation());
        }


        for (BookDTO dto : books) {
            System.out.println(
                    (int) (dto.getPrice() - (dto.getPrice()) * dto.getDiscountRate()));
        }
    }

}
