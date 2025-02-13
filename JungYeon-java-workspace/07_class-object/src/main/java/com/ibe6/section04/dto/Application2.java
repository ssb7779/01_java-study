package com.ibe6.section04.dto;

public class Application2 {
    public static void main(String[] args) {

                /*
            실습.
            화장품과 관련된 데이터를 보관할 CosmeticDTO 클래스 작성해보시오.
            이름, 가격, 브랜드, 카테고리, 할인여부를 속성으로 가져야된다.

            CosmeticDTO 클래스 작성이 다 끝나면 실행용 클래스에서
            1. 기본생성자 + setter 이용해서 객체 생성
               - 화장품명 : 젠틀토닝로션
               - 가격 : 23000
               - 브랜드 : 아벤느
               - 카테고리 : 스킨케어
               - 할인여부 : 할인안함
           2. 매개변수생성자 이용해서 객체 생성
               - 화장품명 : 펜라이너
               - 가격 : 15000
               - 브랜드 : 클리오
               - 카테고리 : 아이메이크업
               - 할인여부 : 할인함 (불린자료형으로)
         */
        CosmeticDTO cosmetic1 = new CosmeticDTO();
        cosmetic1.setName("젠틀토닝로션");
        cosmetic1.setPrice(23000);
        cosmetic1.setBrand("아벤느");
        cosmetic1.setCategory("스킨케어");
        cosmetic1.setDiscount(false);
        System.out.println(cosmetic1.getInformation());

        System.out.println("===========");

        CosmeticDTO cosmetic2 = new CosmeticDTO("펜라이너", 15000, "클리오", "아이메이크업", true);
        System.out.println(cosmetic2.getInformation());


    }


}
