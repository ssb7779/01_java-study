package com.pch.practice7.controller;

import com.pch.practice7.dto.Product;

import java.util.Scanner;

public class ProductManager {
    private Product []pro = new Product[10];
    public static int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        int input = sc.nextInt();
        if(input == 1){
            System.out.println("1. 제품 정보 추가");
            productInput();
        } else if(input == 2){
            System.out.println("2. 제품 전체 조회");
            productPrint();
        } else if(input == 3){
            System.out.println("3. 제품 정보 수정");
            productUpdate();
        } else if(input == 0){
            System.out.println("0. 프로그램 종료");
            System.exit(0);
        }
    }

    public void productInput(){
        System.out.println("제품아이디 입력");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.println("제품이름 입력");
        String pName = sc.nextLine();
        System.out.println("제품가격 입력");
        int price = sc.nextInt();
        System.out.println("제품세금 입력");
        double tax = sc.nextDouble();

        pro[count] = new Product(pid, pName, price, tax);
    }

    public void productPrint(){
        for(int i = 0; i < count; i++){
            System.out.println(pro[i].getInformation());
        }
    }

    public void productUpdate(){
        System.out.println("수정할 제품명 입력");
        String editName = sc.nextLine();

        int editIdx = 0;
        for(int i = 0; i<count; i++){
            if(pro[i].getpName().equals(editName)){
                editIdx = i;
                break;
            }
        }

        System.out.println("변경할 제품명 입력");
        String pName = sc.nextLine();
        System.out.println("변경할 가격 입력");
        int price = sc.nextInt();
        System.out.println("변경할 세금 입력");
        double tax = sc.nextDouble();

        pro[editIdx].setpName(pName);
        pro[editIdx].setPrice(price);
        pro[editIdx].setTax(tax);
    }
}
