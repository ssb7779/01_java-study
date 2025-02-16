package com.minkook.practice1.run;

import com.minkook.practice1.dto.ProductDto;

public class Application {
    public static void main(String [] args){
        ProductDto productDto1 = new ProductDto("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
        ProductDto productDto2 = new ProductDto("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
        ProductDto productDto3 = new ProductDto("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);

        System.out.println(productDto1.getInformation());
        System.out.println(productDto2.getInformation());
        System.out.println(productDto3.getInformation());
        System.out.println("========================================");

        productDto1.setPrice(1200000);
        productDto1.setTax(0.05);
        productDto2.setPrice(1200000);
        productDto2.setTax(0.05);
        productDto3.setPrice(1200000);
        productDto3.setTax(0.05);

        System.out.println(productDto1.getInformation());
        System.out.println(productDto2.getInformation());
        System.out.println(productDto3.getInformation());
        System.out.println("========================================");
        System.out.println("상품명 = " + productDto1.getProductName());
        System.out.println("부가세 포함 가격 = " + (productDto1.getPrice() +(int)(productDto1.getTax() * productDto1.getPrice())));

        System.out.println("상품명 = " + productDto2.getProductName());
        System.out.println("부가세 포함 가격 = " + (productDto2.getPrice() +(int)(productDto2.getTax() * productDto2.getPrice())));

        System.out.println("상품명 = " + productDto3.getProductName());
        System.out.println("부가세 포함 가격 = " + (productDto3.getPrice() +(int)(productDto3.getTax() * productDto3.getPrice())));
    }
}
