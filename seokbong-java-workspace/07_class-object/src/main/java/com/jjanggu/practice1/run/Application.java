package com.jjanggu.practice1.run;

import com.jjanggu.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {

        ProductDTO pd1 = new ProductDTO("ssgnote9", "갤럭시노트9","경기도 수원", 960000, 10.0);
        System.out.println(pd1.getInformation1());

        ProductDTO pd2 = new ProductDTO("lgnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        System.out.println(pd2.getInformation1());

        ProductDTO pd3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(pd3.getInformation1());

        System.out.println("========================================================");

        ProductDTO.setStaticPrice(1200000);
        ProductDTO.setStaticTax(0.05);

        System.out.println(pd1.getInformation2());
        System.out.println(pd2.getInformation2());
        System.out.println(pd3.getInformation2());

        System.out.println("=========================================================");

        System.out.println("상품명 = " + pd1.getProductId());
        System.out.println("부가세 포함 가격 = " + (int)(ProductDTO.getStaticPrice()+ProductDTO.getStaticPrice()*ProductDTO.getStaticTax()) + "원");
        System.out.println("상품명 = " + pd1.getProductId());
        System.out.println("부가세 포함 가격 = " + (int)(ProductDTO.getStaticPrice()+ProductDTO.getStaticPrice()*ProductDTO.getStaticTax()) + "원");
        System.out.println("상품명 = " + pd1.getProductId());
        System.out.println("부가세 포함 가격 = " + (int)(ProductDTO.getStaticPrice()+ProductDTO.getStaticPrice()*ProductDTO.getStaticTax()) + "원");

    }



}
