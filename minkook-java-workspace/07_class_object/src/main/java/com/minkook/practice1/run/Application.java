package com.minkook.practice1.run;

import com.minkook.practice1.dto.ProductDto;

public class Application {
    public static void main(String [] args){
//        ProductDto productDto1 = new ProductDto("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
////        ProductDto productDto2 = new ProductDto("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
////        ProductDto productDto3 = new ProductDto("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
////
////        System.out.println(productDto1.getInformation());
////        System.out.println(productDto2.getInformation());
////        System.out.println(productDto3.getInformation());
////        System.out.println("========================================");
////
////        productDto1.setPrice(1200000);
////        productDto1.setTax(0.05);
////        productDto2.setPrice(1200000);
////        productDto2.setTax(0.05);
////        productDto3.setPrice(1200000);
////        productDto3.setTax(0.05);
////
////        System.out.println(productDto1.getInformation());
////        System.out.println(productDto2.getInformation());
////        System.out.println(productDto3.getInformation());
////        System.out.println("========================================");
////        System.out.println("상품명 = " + productDto1.getProductName());
////        System.out.println("부가세 포함 가격 = " + (productDto1.getPrice() +(int)(productDto1.getTax() * productDto1.getPrice())));
////
////        System.out.println("상품명 = " + productDto2.getProductName());
////        System.out.println("부가세 포함 가격 = " + (productDto2.getPrice() +(int)(productDto2.getTax() * productDto2.getPrice())));
////
////        System.out.println("상품명 = " + productDto3.getProductName());
////        System.out.println("부가세 포함 가격 = " + (productDto3.getPrice() +(int)(productDto3.getTax() * productDto3.getPrice())));
        ProductDto [] products = new ProductDto[]{new ProductDto("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0)
                ,new ProductDto("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7)
        ,new ProductDto("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3)};

        for(int i = 0; i < products.length; i++) {
            System.out.println(products[i].getInformation());
        }

        for(int i = 0; i < products.length; i++) {
            products[i].setPrice(1200000);
            products[i].setTax(0.05);
        }
        System.out.println("========================================");
        for(int i = 0; i < products.length; i++) {
            System.out.println(products[i].getInformation());
        }

        for(int i = 0; i < products.length; i++) {
            System.out.println("상품명 = " + products[i].getProductName());
            System.out.println("부가세 포함 가격 = " + (products[i].getPrice() +(int)(products[i].getTax() * products[i].getPrice())));
        }
//        System.out.println("========================================");
//        System.out.println("상품명 = " + products[0].getProductName());
//        System.out.println("부가세 포함 가격 = " + (products[0].getPrice() +(int)(products[0].getTax() * products[0].getPrice())));
//
//        System.out.println("상품명 = " + products[1].getProductName());
//        System.out.println("부가세 포함 가격 = " + (products[1].getPrice() +(int)(products[1].getTax() * products[1].getPrice())));
//
//        System.out.println("상품명 = " + products[2].getProductName());
//        System.out.println("부가세 포함 가격 = " + (products[2].getPrice() +(int)(products[2].getTax() * products[2].getPrice())));

    }
}
