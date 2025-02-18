package com.jjanggu.section04.run;

import com.jjanggu.section04.dto.Book;

public class Application3 {
    public static void main(String[] args) {

        Book book1 = new Book(1,"홍길동전", "허균", 50000);
        Book book2 = new Book(1,"홍길동전", "허균", 50000);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());


//        equals메소드의 결과도 true고 뿐만 아니라 각 인스턴스의 hashCode 값마저도 갈아야됨
    }
}
