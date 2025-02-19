package com.younggalee.section04.run;

import com.younggalee.section04.dto.Book;

public class Application2 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "홍길동전", "허균", 50000);
        Book b2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println(b1);
        System.out.println(b2);
        // 두 인스턴스는 내용물만 같을 뿐 둘은 다름 (참조값 다름)
        System.out.println(b1.equals(b2));  // equals는 주소값 비교

        /*
            ## 동일객체와 동등객체 ##
            1. 동일 객체 : 주소가 동일한 인스턴스들을 동일 객체라 함. (완전 같은 인스턴스)
            2. 동등 객체 : 주소가 다르더라도 필드값들이 모두 동일한 객체를 동등 객체라 함. (객체 내용이 같은지)
         */
    }
}
