package com.minkook.section04.dto;

public class Application {
    /*
    실습.
    화장품과 관련된 데이터를 보관할 CosmeticDTO 클래스 작성해보시오.
    이름, 가격, 브랜드, 카테고리, 할인여부를 속성으로 가져야된다.

    CosmeticDTO 클래스 작성이 다끝나면 실행용 클래스에서
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
       - 할인여부 : 할인함

    각 객체의 정보 출력.
 */
    public static void main(String [] args){
//        CosmeticDTO cosmeticDTO = new CosmeticDTO();
//
//        cosmeticDTO.setName("젠틀토닝로션");
//        cosmeticDTO.setPrice(23000);
//        cosmeticDTO.setBrand("아벤느");
//        cosmeticDTO.setCategory("스킨케어");
//        cosmeticDTO.setDiscout(false);
//
//        cosmeticDTO.pritCosmeticDTO();
//
//        CosmeticDTO cosmeticDTO2 = new CosmeticDTO("펜라이너",15000,"클리오","아이메이크업",true);
//
//        cosmeticDTO2.pritCosmeticDTO();


        //CosmeticDTO cosmeticDTO = new CosmeticDTO();


        BreadDTO breadDTO = new BreadDTO();

        breadDTO.setbName("소금빵");
        breadDTO.setbPrice(1000);
        BakeryDTO bakeryDTO = new BakeryDTO("파리바케트","일산2동",breadDTO);

        System.out.println(bakeryDTO.getInformation());


        bakeryDTO.setName("뚜레주르");
        bakeryDTO.setAddress("가양동");
        bakeryDTO.setBreadDTO(new BreadDTO("피자빵",2000));

        System.out.println(bakeryDTO.getInformation());

        /*
            2500원짜리 튀김소보로를 판매하는 성심당(대전시) 빵집
         */
        BakeryDTO bakeryDTO2 = new BakeryDTO("성심당","대전시",new BreadDTO("튀김소보로",4000));
        System.out.println(bakeryDTO2.getInformation());
        System.out.println(breadDTO.getbName());
        System.out.println(bakeryDTO2.getBreadDTO().getbName());

    }
}
