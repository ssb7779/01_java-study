package com.john.practice1.dto;

public class Application {
    public static void main(String[] args) {
        ProductDTO productDTO = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10);
        ProductDTO productDTO2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        ProductDTO productDTO3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        System.out.println(productDTO.getInformation());
        System.out.println(productDTO2.getInformation());
        System.out.println(productDTO3.getInformation());
        System.out.println("========================================");

        productDTO.setPrice(1200000);
        productDTO2.setPrice(1200000);
        productDTO3.setPrice(1200000);
        productDTO.setTax(0.05);
        productDTO2.setTax(0.05);
        productDTO3.setTax(0.05);

        System.out.println(productDTO.getInformation());
        System.out.println(productDTO2.getInformation());
        System.out.println(productDTO3.getInformation());
        System.out.println("========================================");
        System.out.println(productDTO.getInformation(productDTO.getProductName(),productDTO.getPrice(),productDTO.getTax()));
        System.out.println(productDTO2.getInformation(productDTO2.getProductName(),productDTO2.getPrice(),productDTO2.getTax()));
        System.out.println(productDTO3.getInformation(productDTO3.getProductName(),productDTO3.getPrice(),productDTO3.getTax()));

    }
}
