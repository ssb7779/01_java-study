package com.seungjoo.section07.objcetarray.run;
import com.seungjoo.section07.objcetarray.dto.Book;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {



        Book[] books = new Book[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {


            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter year: ");
            String publisher = sc.nextLine();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, author, publisher, price);
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInformation());

        }
        System.out.println("검색할 책 제목: ");
        String search = sc.nextLine();
        for (int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(search)){
                System.out.println(books[i].getInformation());
            }
            }


    }
}
