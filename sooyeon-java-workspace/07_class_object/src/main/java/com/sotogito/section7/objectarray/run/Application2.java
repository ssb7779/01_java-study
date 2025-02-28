package com.sotogito.section7.objectarray.run;

import com.sotogito.section7.objectarray.dto.Book;

import java.util.Scanner;

public class Application2 {
    /**
     * ## 3개 도서 관리 프로그램
     * - 도서 등록 시 사용자로부터 도서 정보를 입력받기
     * - 도서 조회 시 전체 도서에 대한 정보 출력
     * - 도서 검색시 사용자가 입력한 도서명과 일치하는 도서 조회 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("이름 : ");
            String title = sc.nextLine();
            System.out.println("저자 :");
            String author = sc.nextLine();
            System.out.println("출판사 :");
            String publisher = sc.nextLine();
            System.out.println("가격 :");
            int price = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(author, title, publisher, price);
        }


        // 조회 서비스 =-==-=-=-=-=-=-=
        for (Book book : books) {
            System.out.println(book.getInformation());
        }


        // 검색 서비스========================
        System.out.println("검색할 책 제목 : ");
        String searchTitle = sc.nextLine();

//        for(Book book : books){
//            if(searchTitle.equals(book.getTitle())){
//                System.out.println("존재합니다.");
//                break;
//            }
//        }

        for (int i = 0; i < books.length; i++) {
            if (searchTitle.equals(books[i].getTitle())) {
                System.out.println("존재합니다.");
                System.out.println(books[i].getInformation());
                break;
            }
            if (i == books.length - 1) {
                System.out.println("존재하지 않습니다.");
            }
        }
    }
}
