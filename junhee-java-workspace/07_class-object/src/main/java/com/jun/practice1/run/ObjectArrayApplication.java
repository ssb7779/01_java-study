package com.jun.practice1.run;

import com.jun.practice1.dto.ProductDTO;

public class ObjectArrayApplication {
    public static void main(String[] args) {

        ProductDTO[] phArr1 = new ProductDTO[3] ;

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
            phArr1[i].setPrice(1200000);
            phArr1[i].setTax(0.05);

        }
        for(ProductDTO p : phArr1){
            System.out.println(p.getInformation());
        }
        System.out.println("=========================================");

        for (ProductDTO p : phArr1){
            System.out.println("상품명 = " + p.getProductName());
            System.out.println("부과세 포함 가격 = " + (int)(p.getPrice() + p.getPrice()*p.getPrTax()));
        }
    }
}