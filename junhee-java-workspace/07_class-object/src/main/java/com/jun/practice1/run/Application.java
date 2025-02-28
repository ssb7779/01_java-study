package com.jun.practice1.run;

import com.jun.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
/*
        ProductDTO pd1 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        System.out.println(pd1.getInformation());
        ProductDTO pd2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        System.out.println(pd2.getInformation());
        ProductDTO pd3 = new ProductDTO("ktsnote5", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(pd3.getInformation());


        System.out.println("==========================================");

        // 가격 및 부가세 변경 후

        pd1.setPrice(1200000);
        pd1.setTax(0.05);

        pd2.setPrice(1200000);
        pd2.setTax(0.05);

        pd3.setPrice(1200000);
        pd3.setTax(0.05);

        System.out.println(pd1.getInformation());
        System.out.println(pd2.getInformation());
        System.out.println(pd3.getInformation());



        System.out.println("==========================================");

        System.out.println("상품명: " + pd1.getProductName());
        System.out.println("부가세 포함 가격 = " + pd1.getPrTax());
        System.out.println("상품명: " + pd2.getProductName());
        System.out.println("부가세 포함 가격 = " + pd2.getPrTax());
        System.out.println("상품명: " + pd3.getProductName());
        System.out.println("부가세 포함 가격 = " + pd3.getPrTax());

 */
        ProductDTO[] phArr1 = new ProductDTO[3];

        phArr1[0] = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        phArr1[1] = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        phArr1[2] = new ProductDTO("ktsnote5", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        for (int i = 0; i < phArr1.length; i++) {
            System.out.println(phArr1[i].getInformation());
        }
        System.out.println("=========================================");

        ProductDTO[] phArr2 = new ProductDTO[3];
        phArr2[0] = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 1200000, 0.05);
        phArr2[1] = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 1200000, 0.05);
        phArr2[2] = new ProductDTO("ktsnote5", "KT스마트폰3", "서울시 강남", 1200000, 0.05);
        for (int i = 0; i < phArr1.length; i++) {
            System.out.println(phArr2[i].getInformation());
        }
        System.out.println("=========================================");
        for (int i = 0; i < phArr1.length; i++) {
            System.out.println("상품명: " + phArr2[i].getProductName());
            System.out.println();


        }
    }
}