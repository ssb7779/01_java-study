package com.john.section07.run;

import com.john.section07.dto.Book;

import java.util.Scanner;

/*
    도서 관리 프로그램
    1. 도서 등록 시 사용자로부터 도서 정보 입력받기
    2. 도서 조회 시 전체 도서에 대한 정보 출력
    3. 도서 검색 시 사용자가 입력한 도서명과 일치하는 도서 조회후 출력
 */
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.print("도서명: ");
            String title = sc.nextLine();
            System.out.print("저자: ");
            String author = sc.nextLine();
            System.out.print("출판사: ");
            String publisher = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, author, publisher, price);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInformation());
        }

        System.out.print("검색할 도서명: ");
        String search = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(search)) {
                System.out.println(books[i].getInformation());
            }
        }
    }
}
