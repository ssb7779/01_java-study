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

        System.out.println("===========");

        // 1. 빵 객체 생성 (기본생성자+setter)
        BreadDTO br1 = new BreadDTO();
        br1.setName("소금빵");
        br1.setPrice(2000);

        System.out.println(br1.getInformation());

        // 2. 빵집 객체 생성 (기본생성자+setter)
        BakeryDTO bk1 = new BakeryDTO();
        bk1.setStoreName("파리바게뜨");
        bk1.setStoreAddr("삼성동");
        System.out.println(bk1.getInfo());

        // 3. 빵집 객체 생성
        BakeryDTO bk2 = new BakeryDTO();
        bk2.setStoreName("뚜레주르");
        bk2.setStoreAddr("마곡동");
        bk2.setBread(new BreadDTO("크로와상", 4000)); // 이미 생성해둔 Bread 객체 전달

        System.out.println(bk2.getInfo());


        /*
            2500원짜리 튀김소보로를 판매하는 성심당(대전시) 빵집 만들기 => bk3

            빵집정보출력
            성심당에서 판매하는 빵정보만 출력
         */
        /*
        BakeryDTO bk3 = new BakeryDTO();
        bk3.setStoreName("성심당");
        bk3.setStoreAddr("대전시");
        bk3.setBread(new BreadDTO("튀김소보로", 2500));
         */
        BakeryDTO bk3 = new BakeryDTO("성심당", "대전시", new BreadDTO("튀김소보로", 2500));

        System.out.println(bk3.getInfo());
        System.out.println("판매하는 빵: " + bk3.getBread().getInformation());


    }



}
