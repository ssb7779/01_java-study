package com.inyong.practice7.controller;

import com.inyong.practice7.dto.Product;
import java.util.Scanner;

public class ProductManager {
    private static int count = 0; // 등록된 제품 개수
    private Product[] products = new Product[10]; // 최대 10개 제품 저장 가능
    private Scanner sc = new Scanner(System.in);

    // count 증가 메서드
    public static void incrementCount() {
        count++;
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 정보 수정");
            System.out.println("4. 제품 검색");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine(); // 개행문자 처리

            switch (choice) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 3:
                    productUpdate();
                    break;
                case 4:
                    productSearch();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    // 제품 정보 추가
    public void productInput() {
        if (count >= products.length) {
            System.out.println("더 이상 제품을 추가할 수 없습니다.");
            return;
        }

        System.out.print("제품 ID: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명: ");
        String pName = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("세금(%): ");
        double tax = sc.nextDouble();

        products[count - 1] = new Product(pId, pName, price, tax);
        System.out.println("제품이 추가되었습니다.");
    }

    // 제품 전체 출력
    public void productPrint() {
        if (count == 0) {
            System.out.println("등록된 제품이 없습니다.");
            return;
        }

        System.out.println("\n===== 등록된 제품 목록 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getInformation());
        }
    }

    // 제품 정보 수정
    public void productUpdate() {
        System.out.print("수정할 제품명을 입력하세요: ");
        String searchName = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (products[i].getpName().equals(searchName)) {
                System.out.print("새로운 제품명: ");
                String newName = sc.nextLine();
                System.out.print("새로운 가격: ");
                int newPrice = sc.nextInt();
                System.out.print("새로운 세금(%): ");
                double newTax = sc.nextDouble();
                sc.nextLine(); // 개행문자 처리

                products[i].setpName(newName);
                products[i].setPrice(newPrice);
                products[i].setTax(newTax);
                System.out.println("제품 정보가 수정되었습니다.");
                return;
            }
        }

        System.out.println("해당 제품이 존재하지 않습니다.");
    }

    // 제품 검색
    public void productSearch() {
        System.out.print("검색할 제품명을 입력하세요: ");
        String searchName = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (products[i].getpName().equals(searchName)) {
                System.out.println(products[i].getInformation());
                System.out.println("세금 포함 가격: " + (products[i].getPrice() * (1 + products[i].getTax() / 100)));
                return;
            }
        }

        System.out.println("해당 제품이 존재하지 않습니다.");
    }
}