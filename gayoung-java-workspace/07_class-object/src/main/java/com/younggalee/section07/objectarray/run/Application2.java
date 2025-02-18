package com.younggalee.section07.objectarray.run;

import com.younggalee.section07.dto.Book;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    /*
    ## 시스템 요구사항
    1. 도서 등록시 사용자로부터 도서 정보를 입력받기
    2. 도서 조회 시 전체 도서에 대한 정보 출력
    3. 도서 검색 시 사용자가 입력한 도서명과 일치하는 도서 조회하여 출력
     */
    public static void main(String[] args){

        Book[] bookArr = new Book[3];

        // 등록 서비스 =====================
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("제목을 입력하세요.");
            String title = sc.nextLine();
            System.out.print("저자을 입력하세요.");
            String author = sc.nextLine();
            System.out.print("출판사을 입력하세요.");
            String publisher = sc.nextLine();
            System.out.print("가격을 입력하세요.");
            int price = sc.nextInt();
            sc.nextLine();

            bookArr[i] = new Book(title, author, publisher, price);
        }

        for(int i=0; i<bookArr.length; i++) {
            System.out.println(bookArr[i].getInformation());

        }
        // 검색서비스 ======================

        System.out.println("검색할 책 제목을 입력하시오");
        String search = sc.nextLine();

        for (Book book : bookArr){
            if (book.getTitle().equals(search)){
                System.out.println(book.getInformation());
            }
        }

        for(int i=0; i<bookArr.length;i++){
            System.out.println("상품명 = " + bookArr[i].getTitle());
            bookArr[i].setPrice( (int)(bookArr[i].getPrice() + bookArr[i].getPrice() * bookArr[i].getTax()) );
            System.out.println("부가세 포함 가격 = " + bookArr[i].getPrice() + "원");
        }

    }

}
