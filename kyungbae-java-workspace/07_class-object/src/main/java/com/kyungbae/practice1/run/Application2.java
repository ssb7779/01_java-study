package com.kyungbae.practice1.run;

import com.kyungbae.practice1.dto.ProductDTO;

public class Application2 {
    public static void main(String[] args) {

        // 배열로 변환
        ProductDTO[] pd = new ProductDTO[3];
        pd[0] = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        pd[1] = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        pd[2] = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        for (int i = 0; i < pd.length; i++) {
            System.out.println(pd[i].getInformation());
        }

        System.out.println("============================================");

        for (int i = 0; i < pd.length; i++) {
            pd[i].setTax(0.05);
            pd[i].setPrice(1200000);
            System.out.println(pd[i].getInformation());
        }

        System.out.println("============================================");

        for(ProductDTO product : pd){
            System.out.println("상품명 = " + product.getProductName());
            System.out.println("부가세 포함 가격 = " + (int)(product.getPrice() + product.getPrice() * product.getTax()) + "원");
        }

    }
}
