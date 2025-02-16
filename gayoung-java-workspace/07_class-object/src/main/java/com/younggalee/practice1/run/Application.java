package com.younggalee.practice1.run;
import com.younggalee.practice1.dto.ProductDTO; // 다른 패키지니까

public class Application {
    public static void main(String[] args){
        ProductDTO prod1 = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원" , 960000, 10.0);
        ProductDTO prod2 = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택" , 780000, 0.7);
        ProductDTO prod3 = new ProductDTO("lgxnote5", "KT스마트폰3", "서울시 강남" , 250000, 0.3);

        System.out.println(prod1.getInformation());
        System.out.println(prod2.getInformation());
        System.out.println(prod3.getInformation());

        System.out.println("============================");

        prod1.setPrice(1200000);
        prod2.setPrice(1200000);
        prod3.setPrice(1200000);

        prod1.setTax(0.05);
        prod2.setTax(0.05);
        prod3.setTax(0.05);

        System.out.println(prod1.getInformation());
        System.out.println(prod2.getInformation());
        System.out.println(prod3.getInformation());

        System.out.println("============================");

        System.out.println("상품명 = " + prod1.getProductName());
        prod1.setPrice( (int)(prod1.getPrice() + prod1.getPrice() * prod1.getTax()) );
        System.out.println("부가세 포함 가격 = " + prod1.getPrice() + "원");

        System.out.println("상품명 = " + prod2.getProductName());
        prod2.setPrice( (int)(prod2.getPrice() + prod2.getPrice() * prod2.getTax()) );
        System.out.println("부가세 포함 가격 = " + prod2.getPrice() + "원");

        System.out.println("상품명 = " + prod3.getProductName());
        prod3.setPrice( (int)(prod3.getPrice() + prod3.getPrice() * prod3.getTax()) );
        System.out.println("부가세 포함 가격 = " + prod3.getPrice() + "원");


    }
}
