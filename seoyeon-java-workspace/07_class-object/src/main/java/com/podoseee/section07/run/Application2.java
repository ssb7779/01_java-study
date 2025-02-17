package com.podoseee.section07.run;

import com.podoseee.section07.dto.Book;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
            ## 3개의 도서를 관리하는 프로그램 ##
         */

        Book[] books = new Book[3];

        // 등록 서비스 ===========================================
        Scanner sc  = new Scanner(System.in);
        for(int i=0; i<books.length; i++){
            
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter publisher: ");
            String publisher = sc.nextLine();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();

            // 각 인덱스별 인스턴스 생성
            books[i] = new Book(price, author, publisher, title);
        }

        // 조회 서비스 ==========================================
        /*
        for(int i=0; i<books.length; i++){
            System.out.println(books[i].getInformation());
        }
        */
        for(Book bk : books){
            System.out.println(bk.getInformation());
        }

        // 검색 서비스 ===========================================
        System.out.print("검색할 책 제목 : ");
        String search = sc.nextLine();

        for(int i=0; i<books.length; i++){
            if(books[i].getTitle().equals(search)){ //getTitle() 빼먹지 않기
                System.out.println(books[i].getInformation());
            }
        }
    }
}
