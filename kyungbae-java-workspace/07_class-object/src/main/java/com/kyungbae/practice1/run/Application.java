package com.kyungbae.practice1.run;

import com.kyungbae.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {

        ProductDTO pd1 = new ProductDTO("ssgnote", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        System.out.println(pd1.getInformation());
        ProductDTO pd2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        System.out.println(pd2.getInformation());
        ProductDTO pd3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(pd3.getInformation());

        System.out.println("=====================================");

        pd1.setPrice(1200000);
        pd2.setPrice(1200000);
        pd3.setPrice(1200000);

        pd1.setTax(0.05);
        pd2.setTax(0.05);
        pd3.setTax(0.05);

        System.out.println(pd1.getInformation());
        System.out.println(pd2.getInformation());
        System.out.println(pd3.getInformation());

        System.out.println("=====================================");

        System.out.println("상품명 = " + pd1.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pd1.getPrice() + (pd1.getPrice() * pd1.getTax())) + "원");
        System.out.println("상품명 = " + pd2.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pd2.getPrice() + (pd2.getPrice() * pd2.getTax())) + "원");
        System.out.println("상품명 = " + pd3.getProductName());
        System.out.println("부가세 포함 가격 = " + (int)(pd2.getPrice() + (pd2.getPrice() * pd2.getTax())) + "원");

    }
}
