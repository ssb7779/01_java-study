package com.minkook.practice7.controller;

import com.minkook.practice7.dto.Product;

import java.util.Scanner;

public class ProductManager{
    Scanner sc = new Scanner(System.in);
    public static  int count = 0;
    private Product [] products = new Product[10];

    // 위의 클래스 다이어그램을 보고 필드 작성

    public void mainMenu() {


        // 메뉴 출력 --> 무한 반복 실행 처리함
				/*
					===== 제품 관리 메뉴 =====
					1. 제품 정보 추가 		// productInput() 메소드 실행
					2. 제품 전체 조회 		// productPrint() 메소드 실행
					3. 제품 정보 수정		// productUpdate() 메소드 실행
					0. 프로그램 종료
				*/
        while (true){

            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 정보 수정");
            System.out.println("4. 해당가격 모든 제품조회");
            System.out.println("0. 프로그램 종료");
            System.out.print("번호입력: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 0){
                break;
            }else if(menu == 1){
                productInput();
            }else if(menu == 2){
                productPrint();
            }else if(menu == 3){
                productUpdate();
            }else if(menu == 4){
                searchPrice();
            }
        }
    }

    public void productInput() {
        // 키보드로 제품 정보를 입력 받아 객체 생성
        // -> Product 생성자 내부에서 ProductManager의 count 클래스 변수 값이 1씩 증가될꺼임
        // 현재 카운트 인덱스에 생성된 객체 저장
        System.out.println("제품등록");
        System.out.println("======================");
        System.out.print("제품번호: ");
        int pId = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명: ");
        String pName = sc.nextLine();

        System.out.print("제품가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("세금: ");
        double tax = sc.nextDouble();
        sc.nextLine();
        products[count] = new Product(pId,pName,price,tax);
        count++;

    }

    public void productPrint() {
        // 현재까지 기록된 모든 제품 정보 모두 출력
        for(int i = 0; i <count; i++){
            System.out.println(products[i].getInformation());
        }
    }

    public void productUpdate() {
        // 키보드로 수정하고자하는 제품명을 입력받으시오 => 해당 제품을 찾기 위한 값

        // 변경할 제품명, 가격, 세금을 입력 받으시오
        // 현재 보유하고있는 제품들 중에 해당 수정할 제품을 찾아서
        // 사용자가 입력한 제품명, 가격, 세금으로 필드 값을 변경하시오.
        System.out.print("변경할 제품명을 입력하시오: ");
        String search = sc.nextLine();
        int cur = 0;
        for(int i = 0; i < products.length; i++){
            if(!products[i].getpName().equals(search)){
               continue;
            }
            if(products[i].getpName().equals(search)){
                 cur = i;
                 break;
            }
        }
        System.out.print("변경할 제품명: ");
        String pName = sc.nextLine();

        System.out.print("변경할 가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("변경할 세금: ");
        double tax = sc.nextDouble();
        sc.nextLine();

        products[cur].setpName(pName);
        products[cur].setPrice(price);
        products[cur].setTax(tax);

    }
    public void searchPrice() {
        // 그 밖에 검색 기능 같은 것도 넣어보시오!
        // 예를 들어 검색할 제품명 입력 받아 해당 제품의 세금 포함 가격을 출력해주는..
        Product [] sProducts = new Product[products.length];
        System.out.print("가격을 입력하세요: ");
        int sPrice = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getPrice() == sPrice) {
                sProducts[i] = new Product(products[i].getpId(), products[i].getpName(), products[i].getPrice(), products[i].getTax());
            }
        }

        for(int i = 0; i < sProducts.length; i++){
            if (sProducts[i] != null) {
                System.out.println(sProducts[i].getInformation());
            }
        }
    }
}