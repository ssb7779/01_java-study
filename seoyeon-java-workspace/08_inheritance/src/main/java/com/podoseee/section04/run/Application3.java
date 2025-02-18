package com.podoseee.section04.run;

import com.podoseee.section04.dto.Book;

public class Application3 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "홍길동전", "허균", 50000); //"홍길동전허균150000".hashCode()
        Book book2 = new Book(1, "홍길동전", "허균", 50000); //"홍길동전허균150000".hashCode()

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());
        /*equals메소드의 결과도 true고 뿐만아니라 각 인스턴스의 hashCode 값마저도 같아야됨*/
    }
}
