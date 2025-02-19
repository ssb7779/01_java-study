package com.ibe6.practice1.run;

import com.ibe6.practice1.dto.ProductDto;

public class Application {
    public static void main(String[] args) {

        ProductDto[] arr = new ProductDto[3];
        arr[0] = new ProductDto("ssgnote9", "갤럭시노트9", "경기도 수원", 1200000, 0.05);
        arr[1] = new ProductDto("lgxnote5", "LG스마트폰5", "경기도 평택", 1200000, 0.05);
        arr[2] = new ProductDto("ktsnote3", "KT스마트폰3", "서울시 강남", 1200000, 0.05);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInformation());
        }
        System.out.println("========================================");

        for (int i = 0; i<arr.length; i++){
            arr[i].setPrice(1200000);
            arr[i].setTax(0.05);
        }
        for (ProductDto p : arr) {
            System.out.println(p.getInformation());
        }

        System.out.println("========================================");
        /*
        System.out.println("상품명 = " + arr[i].getProductName());
        System.out.println("부가세 포함 가격 = " + (int) (arr[i].getPrice() + arr[i].getPrice() * arr[i].getTax() ) + "원" );
         */

        for (ProductDto p : arr) {
            System.out.println("상품명 = " + p.getProductName());
            System.out.println("부가세 포함 가격 = " + (int) (p.getPrice() + p.getPrice() * p.getTax()) + "원");

        }
    }
}
