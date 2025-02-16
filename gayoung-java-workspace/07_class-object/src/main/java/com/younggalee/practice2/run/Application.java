package main.java.com.younggalee.practice2.run;

import main.java.com.younggalee.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args){
        BookDTO book1 = new BookDTO();
        BookDTO book2 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");

        System.out.println(book1.getInformation());
        System.out.println(book2.getInformation());

        //setter 이용 첫번째 객체 수정
        book1.setTitle("C언어");
        book1.setPrice(30000);
        book1.setDiscountRate(0.1);
        book1.setAuthor("홍길동");

        System.out.println("======================");
        System.out.println("수정된 결과 확인");
        System.out.println(book1.getInformation());

        System.out.println("======================");
        System.out.printf("도서명 = %s\n",book1.getTitle());
        System.out.printf("할인된 가격 = %d원\n",(int)(book1.getPrice()*(1 - book1.getDiscountRate())));
        System.out.printf("도서명 = %s\n",book2.getTitle());
        System.out.printf("할인된 가격 = %d원\n",(int)(book2.getPrice()*(1 - book2.getDiscountRate())));
    }
}
