package com.minkook.section04.run;

import com.minkook.section04.dto.Book;

public class Application3 {
    public static void main(String [] args){
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book1.hashCode()); //Object클래스의 equals메소드:주소값 비교

        /*
            ## 동일객체와 동등객체##
            1. 동일객체: 주소가 동일한 인스턴스를 동일 객체라 함
            2. 동등객체: 주소가 다르더라도 필드값들이 모두 동일한 객체를 동등 객체라 함
         */
    }
}
