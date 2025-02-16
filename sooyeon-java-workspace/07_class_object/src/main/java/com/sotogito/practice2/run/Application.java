package com.sotogito.practice2.run;

import com.sotogito.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO nullBookDto = new BookDTO();
        BookDTO bookDTO = new BookDTO(
                "자바의정석", 20000, 0.2, "윤상섭"
        );

        System.out.println(nullBookDto.getInformation());
        System.out.println(bookDTO.getInformation());


        System.out.println("========================");
        System.out.println("수정된 결과 확인");


        nullBookDto.setTitle("C언어");
        nullBookDto.setPrice(30000);
        nullBookDto.setDiscountRate(0.1);
        nullBookDto.setAuthor("홍길동");

        System.out.println(nullBookDto.getInformation());


        System.out.println("========================");

        String taxPricePrintout =
                "도서명 = %s\n" + "할인된 가격 = %d원\n";

        System.out.printf(taxPricePrintout,
                nullBookDto.getTitle(),
                (int) (nullBookDto.getPrice() - (nullBookDto.getPrice()) * nullBookDto.getDiscountRate()));

        System.out.printf(taxPricePrintout,
                bookDTO.getTitle(),
                (int) (bookDTO.getPrice() - (bookDTO.getPrice()) * bookDTO.getDiscountRate()));
    }
    
}
