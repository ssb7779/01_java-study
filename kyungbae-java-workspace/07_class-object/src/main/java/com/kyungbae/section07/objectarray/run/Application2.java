package com.kyungbae.section07.objectarray.run;

import com.kyungbae.section07.objectarray.dto.Book;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Book[] books = new Book[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter Title : ");
            String title = sc.nextLine();
            System.out.print("Enter Author : ");
            String author = sc.nextLine();
            System.out.print("Enter publisher : ");
            String publisher = sc.nextLine();
            System.out.print("Enter price : ");
            int price = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(title, author, publisher, price);
        }

        System.out.println("=================================");

        System.out.println("입력된 도서 정보");
        for(Book book : books){
            System.out.println(book.getInformation());
        }

        System.out.println("=================================");
        System.out.print("검색할 책 제목 : ");
        String search = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(search)){
                System.out.println(books[i].getInformation());
            }
        }


    }

} // class end
