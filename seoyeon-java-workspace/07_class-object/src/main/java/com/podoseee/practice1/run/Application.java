package com.podoseee.practice1.run;


import com.podoseee.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO pro1 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        ProductDTO pro2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        ProductDTO pro3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        System.out.println(pro1.getInformation());
        System.out.println(pro2.getInformation());
        System.out.println(pro3.getInformation());

        System.out.println("==============================================================");

        pro1.setPrice(1200000);
        pro2.setPrice(1200000);
        pro3.setPrice(1200000);

        pro1.setTax(0.5);
        pro2.setTax(0.5);
        pro3.setTax(0.5);

        System.out.println(pro1.getInformation());
        System.out.println(pro2.getInformation());
        System.out.println(pro3.getInformation());

        System.out.println("==============================================================");

        System.out.println("상품명 = " + pro1.getProductName());
        System.out.println("부가세 포함 가격 = "  + pro1.getPrice() + pro1.getPrice()*pro1.getTax());
        System.out.println("상품명 = " + pro2.getProductName());
        System.out.println("부가세 포함 가격 = "  + pro2.getPrice() + pro2.getPrice()*pro2.getTax());
        System.out.println("상품명 = " + pro3.getProductName());
        System.out.println("부가세 포함 가격 = "  + pro3.getPrice() + pro3.getPrice()*pro3.getTax());
    }
}
