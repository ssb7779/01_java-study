package com.sotogito.section4.dto;

public class Application {
    public static void main(String[] args) {
//        /**
//         * 객체 생성시 필드에 값을 초기화하는 방법
//         *
//         * 1. 기본생성자로 생성한 후 setter로 필드값 변경
//         *
//         */
//
//        UserDTO user1 = new UserDTO();
//        user1.setId("user01");
//        user1.setPwd("pass01");
//        user1.setName("홍길동");
//        System.out.println(user1.getInfo());
//
//
//        UserDTO user2 = new UserDTO("user2","pass2","asefjo");
//        System.out.println(user2.getInfo() );
//
//        /**
//         * 매개변수
//         * - 장점 : 여러번 호출할 필요 없이 생성 구문으로 필드값 생성
//         * - 단점 :어떤 필드에 대입되는지 확인 어려움,
//         *          선택적인 원하는 필드에 값 부여하지 못함
//         */
//
//
//        System.out.println("============================================================");
//        /**
//         * CosmeticDTO
//         * 이름
//         * 가격
//         * 브랜드
//         * 카테고리
//         * 할인여부
//         */

        // 1. 기본생성자
        CosmeticDTO cosmeticDTO1 = new CosmeticDTO();
        cosmeticDTO1.setName("젠틀토닝로션");
        cosmeticDTO1.setPrice(23000);
        cosmeticDTO1.setBrand("아벤느");
        cosmeticDTO1.setCategory("스킨케어");
        cosmeticDTO1.setPromotion(false);


        //2. 매개변수생성자
        CosmeticDTO cosmeticDTO2 = new CosmeticDTO(
                "펜라이너",
                15000,
                "클리오",
                "아이메이크업",
                true
        );

        System.out.println(cosmeticDTO1.getInfo());
        System.out.println(cosmeticDTO2.getInfo());

    }
}
