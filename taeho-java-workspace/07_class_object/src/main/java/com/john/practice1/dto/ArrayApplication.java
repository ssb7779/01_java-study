package com.john.practice1.dto;

import java.util.Scanner;

public class ArrayApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDTO[] products = new ProductDTO[3];
        for (int i = 0; i < products.length; i++) {
            System.out.print("상품ID: ");
            String productId = sc.nextLine();
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("생산지: ");
            String productArea = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("부가세비율: ");
            double tax = sc.nextDouble();
            sc.nextLine();
            products[i] = new ProductDTO(productId, productName, productArea, price, tax);
        }

        for (ProductDTO product : products) {
            System.out.println(product.getInformation());
        }
        System.out.println("========================================");

        for (int i = 0; i < products.length; i++) {
            products[i].setPrice(1200000);
            products[i].setTax(0.05);
        }

        for (ProductDTO product : products) {
            System.out.println(product.getInformation());
        }
        System.out.println("========================================");

        for (ProductDTO product : products) {
            System.out.println(product.getInformation(product.getProductName(),
                    product.getPrice(),
                    product.getTax()));
        }
    }
}

