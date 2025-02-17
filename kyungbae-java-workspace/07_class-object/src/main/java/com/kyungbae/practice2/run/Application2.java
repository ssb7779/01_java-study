package com.kyungbae.practice2.run;

import com.kyungbae.practice2.dto.BookDTO;

public class Application2 {
    public static void main(String[] args) {
        // 배열로 변환
        BookDTO[] bk = {
                new BookDTO(),
                new BookDTO("자바의 정석", 20000, 0.2, "윤상섭")
        };
        // 출력
        for (BookDTO b : bk){
            System.out.println(b.getInformaion());
        }
        System.out.println("================================");
        // 수정
        bk[0].setTitle("C언어");
        bk[0].setPrice(30000);
        bk[0].setDiscountRate(0.1);
        bk[0].setAuthor("홍길동");
        System.out.println("수정된 결과 확인");
        System.out.println(bk[0].getInformaion());

        System.out.println("================================");

        for (BookDTO b : bk){
            System.out.println("도서명 = " + b.getTitle());
            System.out.println("할인된 가격 = " + (int)(b.getPrice() - (b.getPrice() * b.getDiscountRate())) + "원");
        }

    }


} // class end
