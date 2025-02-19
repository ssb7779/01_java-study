package com.seungjoo.practice1.dto;

public class Application {
    public static void main(String[] args) {
        ProductDTO dto1 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        ProductDTO dto2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택",780000 , 0.7);
        ProductDTO dto3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);


        dto1.setPrice(1200000);
        dto2.setPrice(1200000);
        dto3.setPrice(1200000);


        System.out.println(dto1.getInformation());
        System.out.println(dto2.getInformation());
        System.out.println(dto3.getInformation());
        System.out.println("================================");
        dto1.setTax(0.05);
        dto2.setTax(0.05);
        dto3.setTax(0.05);

        System.out.println(dto1.getInformation());
        System.out.println(dto2.getInformation());
        System.out.println(dto3.getInformation());
        System.out.println("=======================");
        System.out.println("상품명 = " + dto1.getProductName());
        System.out.println("부가세 포함 가격 = " + (dto1.getPrice()+(int)(dto1.getPrice() * dto1.getTax())));
        System.out.println("상품명 = " + dto2.getProductName());
        System.out.println("부가세 포함 가격 = " +(dto2.getPrice()+(int)(dto2.getPrice() * dto2.getTax())));
        System.out.println("상품명 = " + dto3.getProductName());
        System.out.println("부가세 포함 가격 = " +(dto1.getPrice()+ (int)(dto3.getPrice() * dto3.getTax())));





    }





}
