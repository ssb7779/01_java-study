package com.jun.practice1.run;

import com.jun.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {

        ProductDTO pd1 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        System.out.println(pd1.getInformation());
        ProductDTO pd2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        System.out.println(pd2.getInformation());
        ProductDTO pd3 = new ProductDTO("ktsnote5", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(pd3.getInformation());


        System.out.println("==========================================");

        ProductDTO pd4 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 120000, 0.05);
        System.out.println(pd4.getInformation());
        ProductDTO pd5 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 120000, 0.05);
        System.out.println(pd5.getInformation());
        ProductDTO pd6 = new ProductDTO("ktsnote5", "KT스마트폰3", "서울시 강남", 120000, 0.05);
        System.out.println(pd6.getInformation());

        System.out.println("==========================================");

        System.out.println("상품명: " + pd1.getProductName());





    }
}
