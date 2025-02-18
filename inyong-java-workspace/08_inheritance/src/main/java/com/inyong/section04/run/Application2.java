package com.inyong.section04.run;
import com.inyong.section04.dto.Book;

public class Application2 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "홍길동전2", "허위", 60000);

        System.out.println("book1"+ book1);
        System.out.println("book2"+ book2);

        System.out.println("두 인스턴스 == 비교 : " + (book1 == book2)); // 주소값 비교
        System.out.println("두 인스턴스 == 비교 : " + book1.equals(book2)); // 주소값 비교

    }

}
