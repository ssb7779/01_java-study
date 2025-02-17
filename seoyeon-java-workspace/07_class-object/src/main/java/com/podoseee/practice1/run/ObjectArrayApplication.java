package com.podoseee.practice1.run;

import com.podoseee.practice1.dto.ProductDTO;

public class ObjectArrayApplication {
    public static void main(String[] args) {

        ProductDTO[] arr = new ProductDTO[3];
        arr[0] = new ProductDTO("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        arr[1] = new ProductDTO("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        arr[2] = new ProductDTO("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInformation());
        }

        System.out.println("==============================================================");

        for(int i=0; i<arr.length; i++){
            arr[i].setPrice(1200000);
            arr[i].setTax(0.05);
        }

        for(ProductDTO p : arr){
            System.out.println(p.getInformation());
        }

        System.out.println("==============================================================");

        /*
        for(int i=0; i<arr.length; i++){
            System.out.println("상품명 = " + arr[i].getProductName());
            System.out.println("부가세 포함 가격 = " + (int)( arr[i].getPrice() + arr[i].getPrice() * arr[i].getTax() ) + "원");
        }
         */

        for(ProductDTO p : arr){
            System.out.println("상품명 = " + p.getProductName());
            System.out.println("부가세 포함 가격 = " + (int)( p.getPrice() + p.getPrice() * p.getTax() ) + "원");
        }

    }
}
