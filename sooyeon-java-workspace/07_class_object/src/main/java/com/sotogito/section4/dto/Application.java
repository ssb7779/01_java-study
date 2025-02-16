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

        /**
         * DTO의 경우는 getter , setter를 둬야함 -  record?????????????????????????????????????????????????????
         */

        /**
         * ## Java Bean //todo
         * 1. JSP에서 표준액션태그로 접근할 수 있는 자바 클래스
         * 2. 작성 규칙
         * - 특정 패키지에 속해야됨 (default 패키지 사용 금지)
         * - 멤버변수 접근제어자는 private
         * - 기본생성자가 명시적으로 작성되어있어야함
         * - 모든 멤버변수에 접근 가능한 setter getter이 public 으로 작성
         * - 직렬화 Serializable이 되어있어야함
         */

//        // 1. 기본생성자
//        CosmeticDTO cosmeticDTO1 = new CosmeticDTO();
//        cosmeticDTO1.setName("젠틀토닝로션");
//        cosmeticDTO1.setPrice(23000);
//        cosmeticDTO1.setBrand("아벤느");
//        cosmeticDTO1.setCategory("스킨케어");
//        cosmeticDTO1.setPromotion(false);
//
//
//        //2. 매개변수생성자
//        CosmeticDTO cosmeticDTO2 = new CosmeticDTO(
//                "펜라이너",
//                15000,
//                "클리오",
//                "아이메이크업",
//                true
//        );
//
//        System.out.println(cosmeticDTO1.getInfo());
//        System.out.println(cosmeticDTO2.getInfo());
//
//

        BreadDTO br1 = new BreadDTO();
        br1.setName("asdf");
        br1.setPrice(123);

//        System.out.println(br1.getInfo());

        BreadDTO br2 = new BreadDTO("ert",456);
//        System.out.println(br2.getInfo());

        BakeryDTO bk1 = new BakeryDTO();
        bk1.setName("ㄴ어너");
        bk1.setAddress("한국");
       // bk1.setBread(br1);
        bk1.setBread(null); //.NullPointerException

        System.out.println(bk1.getInfo());

        BakeryDTO bk2 = new BakeryDTO("wef","ew",br2);
        System.out.println(bk2.getInfo());

        BakeryDTO bk3 = new BakeryDTO("wef","ew",new BreadDTO("Aew",12));
        System.out.println(bk3.getInfo());

        BakeryDTO bk4 = new BakeryDTO("성심당","대전",
                new BreadDTO("튀김소보로",2500));

        System.out.println(bk4.getBread().getInfo());



    }
}
