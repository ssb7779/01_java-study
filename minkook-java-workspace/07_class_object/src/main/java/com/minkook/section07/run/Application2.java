package com.minkook.section07.run;

import com.minkook.section07.dto.Book;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){
        /*
            ## 3개의 도서를 관리하는 프로그램 ##
            
            * 시스템 요구사항
            1. 도서 등록시 사용자로부터 도서 정보를 입력받기
            2. 도서 조회시 전체 도서에 대한 정보 출력
            3. 도서 검색시 사용자가 입력한 도서명과 일치하는 도서 조회하여 출력
         */

        Book [] books = new Book[3];

        //등록서비스
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< books.length; i++){
            System.out.print("Enter title:");
            String title = sc.nextLine();

            System.out.print("Enter author:");
            String author = sc.nextLine();

            System.out.print("Enter publisher:");
            String publisher = sc.nextLine();

            System.out.print("Enter price:");
            int price = sc.nextInt();
            sc.nextLine();

            //각 인덱스 별 인스턴스 생성
            books[i] = new Book(title,author,publisher,price);
        }

        //조회서비스
        for(int i = 0; i < books.length; i++){
            System.out.println(i + " 번째 " + books[i].getInformation());
        }

        //검색서비스
        System.out.print("검색할 책 제목:");
        String search = sc.nextLine();

        for(int i = 0; i < books.length; i++){
            if(books[i].getTitle().equals(search)){
                System.out.println(books[i].getInformation());
            }
        }
    }
}
