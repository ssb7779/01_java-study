package com.pch.practice1.run;

import com.pch.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO productDTO1 = new ProductDTO("ssgnote9","갤럭시노트9", "경기도 수원", 960000, 10.0);
        ProductDTO productDTO2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        ProductDTO productDTO3 = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        System.out.println(productDTO1.getInformation());
        System.out.println(productDTO2.getInformation());
        System.out.println(productDTO3.getInformation());

        System.out.println("\n===============\n");

        productDTO1.setPrice(1200000);
        productDTO2.setPrice(1200000);
        productDTO3.setPrice(1200000);

        productDTO1.setTax(0.05);
        productDTO2.setTax(0.05);
        productDTO3.setTax(0.05);

        System.out.println(productDTO1.getInformation());
        System.out.println(productDTO2.getInformation());
        System.out.println(productDTO3.getInformation());

        System.out.println("\n===============\n");

        System.out.println(productDTO1.getRealprice());
        System.out.println(productDTO2.getRealprice());
        System.out.println(productDTO3.getRealprice());
    }
}
