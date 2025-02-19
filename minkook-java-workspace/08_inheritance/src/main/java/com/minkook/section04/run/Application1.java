package com.minkook.section04.run;

import com.minkook.section04.dto.Book;

public class Application1 {
    public static void main(String [] args){
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(2,"목민심서","정약용",30000);

        System.out.println("book1" + book1);
        System.out.println("book1.toString()" + book1.toString());

        System.out.println("book2" + book2);
        System.out.println("book2.toString()" + book2.toString());

        /*
            toString()을 직접 호출하지 않고 레퍼런스 변수 제시만 해도 결과값은 같다
            왜?: 레퍼런스 변수 출력시 자동으로 .toString()메소드를
         */

        /*
            ## toString() 재정의 ##
            해당 객체의 주소값이 아닌
            필드값들을 하나의 문자열로 합쳐서 반환하도록
            (인스턴스 레퍼런스 출력시 자동으로 호출되는 메소드)
         */
    }
}
