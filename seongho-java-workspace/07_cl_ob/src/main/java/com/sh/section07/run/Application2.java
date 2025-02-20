package com.sh.section07.run;

import com.sh.section07.dto.Book;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*
        도서 3개 관리하는 프로그램
        1. 사용자로부터 도서 정보 입력받기
        2. 도서 조회시 전체 도서 정보 출력
        3. 도서 검색시 사용자가 입력한 도서명과 일치하는 도서 조회하여 출력
         */

        Book[] books = new Book[3];
        //등록 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< books.length;i++){
            System.out.print("타이틀: ");
            String title = sc.nextLine();
            System.out.print("저자: ");
            String author = sc.nextLine();
            System.out.print("출판사: ");
            String publisher = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, author,publisher,price);

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        }
        //            for (int i = 0; i<books.length; i++){
//                System.out.println(books[i].toString());
//            }
        for (Book bk :books){
            System.out.println(bk.toString());
        }
        //mㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        System.out.print("검색 책 제목: ");
        String search = sc.nextLine();

        for (int i = 0; i<books.length;i++){
            if (books[i].getTitle().equals(search)){
                System.out.println(books[i].toString());
            }
        }
    }
}
