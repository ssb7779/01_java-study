package com.podoseee.practice2.run;

import com.podoseee.practice2.dto.BookDTO;

    public class ObjectArrayApplication {
        public static void main(String[] args) {
            BookDTO[] arr = {
                    new BookDTO()
                    , new BookDTO("자바의정석", 20000, 0.2, "윤상섭")
            };

            for (BookDTO bk : arr) {
                System.out.println(bk.getInformation());
            }

            System.out.println("=============================");

            arr[0].setTitle("C언어");
            arr[0].setPrice(30000);
            arr[0].setDiscountRate(0.1);
            arr[0].setAuthor("홍길동");

            System.out.println("수정된 결과 확인");
            System.out.println(arr[0].getInformation());

            System.out.println("=============================");

            for (BookDTO bk : arr) {
                System.out.println("도서명 = " + bk.getTitle());
                System.out.println("할인된 가격 = " + (int) (bk.getPrice() - bk.getPrice() * bk.getDiscountRate()) + "원");
            }


        }
    }
