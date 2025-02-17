package com.sotogito.practice7.controller;

import com.sotogito.practice7.dto.Product;

import java.util.Scanner;

public class ProductManager {

    private Product[] pro = new Product[10];
    public int count = 0;
    Scanner sc = new Scanner(System.in);


    public void mainMenu(){
        while (true){
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 정보 수정");
            System.out.println("0. 프로그램 종료");
            int functionNum = sc.nextInt();

            if(functionNum == 0){
                return;
            }
            if(functionNum == 1){
                productInput();
            } else if (functionNum == 2) {
                productPrint();
            } else if (functionNum ==3) {
                productUpdate();
            }else {
                System.out.println("존재하지 않는 기능입니다.");
            }
        }
    }

    public void productInput(){
        System.out.println("상품 아이디 : ");
        int id = sc.nextInt();
        System.out.println("상품 이름 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("상품 가격 : ");
        int price = sc.nextInt();
        System.out.println("상품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new Product(id,name,price,tax);
        count++;
    }

    public void productPrint(){
        for(int i = 0; i<count; i++){
            System.out.println(pro[i].getInfromation());
        }
    }

    public void productUpdate(){
        System.out.println("수정하고자 하는 제품명을 입력하세요.");
        sc.nextLine();
        String productName = sc.nextLine();

        Product editProduct = null;
        for(int i = 0; i<count; i++){
            if(pro[i].getName().equals(productName)){
                editProduct = pro[i];
            }
        }

        if(editProduct == null){
            System.out.println("찾고자 하는 상품이 없습니다.");
        }

        System.out.println("변경할 이름 : ");
        editProduct.setName(sc.nextLine());
        System.out.println("변경할 가격 : ");
        editProduct.setPrice(sc.nextInt());
        System.out.println("변경할 세금 : ");
        editProduct.setTax(sc.nextDouble());
        System.out.println("수정이 완료되었습니다.");
    }

}