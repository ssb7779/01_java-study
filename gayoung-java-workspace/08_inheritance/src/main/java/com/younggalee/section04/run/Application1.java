package com.younggalee.section04.run;

import com.younggalee.section04.dto.Book;

public class Application1 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "홍길동전", "허균", 50000);
        Book b2 = new Book(1, "정인용전", "허균", 30000);

        System.out.println(b1);  //주소값 출력됨
        System.out.println(b1.toString());
        /*
        toString()을 직접 호출하지 않고 레퍼런스 변수 제시만 해도 결과는 동일
        왜? 레퍼런스변수 출력시 자동으로 .toString() 메소드가 호출됨
         */


        System.out.println(b2);
        System.out.println(b2.toString());



    }
}
