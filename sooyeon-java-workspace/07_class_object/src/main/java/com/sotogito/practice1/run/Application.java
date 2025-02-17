package com.sotogito.practice1.run;

import com.sotogito.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO ssgnote9 = new ProductDTO(
                "ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0
        );
        ProductDTO lgxnote5 = new ProductDTO(
                "lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7
        );
        ProductDTO ktsnote3 = new ProductDTO(
                "ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3
        );

        System.out.println(ssgnote9.getInformation());
        System.out.println(lgxnote5.getInformation());
        System.out.println(ktsnote3.getInformation());


        System.out.println("========================================");


        ssgnote9.setPrice(1200000);
        ssgnote9.setTax(0.05);
        lgxnote5.setPrice(1200000);
        lgxnote5.setTax(0.05);
        ktsnote3.setPrice(1200000);
        ktsnote3.setTax(0.05);

        System.out.println(ssgnote9.getInformation());
        System.out.println(lgxnote5.getInformation());
        System.out.println(ktsnote3.getInformation());


        System.out.println("========================================");


        String taxPricePrintout = "상품명 = %s\n" + "부가세 포함 가격 = %d원\n";
        System.out.printf(
                taxPricePrintout,
                ssgnote9.getProductName(),
                (int) (ssgnote9.getPrice() + (ssgnote9.getPrice() * ssgnote9.getTax()))
        );
        System.out.printf(
                taxPricePrintout,
                lgxnote5.getProductName(),
                (int) (lgxnote5.getPrice() + (lgxnote5.getPrice() * lgxnote5.getTax()))
        );
        System.out.printf(
                taxPricePrintout,
                ktsnote3.getProductName(),
                (int) (ktsnote3.getPrice() + (ktsnote3.getPrice() * ktsnote3.getTax()))
        );
    }

}
