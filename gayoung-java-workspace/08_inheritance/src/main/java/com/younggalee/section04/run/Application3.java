package com.younggalee.section04.run;

import com.younggalee.section04.dto.Book;

public class Application3 {

    public static void main(String[] args) {
        Book b1 = new Book(1, "홍길동전", "허균", 50000);
        Book b2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.equals(b2));

        System.out.println("b1 = " + b1.hashCode());
        System.out.println("b2 = " + b2.hashCode()); // 주소값 다름을 10진수 변환으로 확인

        // 동등객체 : equals메소드의 결과도 true 이고, hashCode 값마저도 같아야됨
    }
}
