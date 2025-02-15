package com.kyungbae.section04.dto;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {

        // parameter constructor 이용
        /*
            장점
              - 메소드를 여러번 호출할 필요 없이 생성 구문만으로 field값을 초기화 할 수 있음
            단점
              - 전달값이 어떤 field에 대입되는지 명확하게 확인하기 어려움
              - 정해져있는 parameter에 맞는 값만을 전달해야됨
                따라서 선택적으로 원하는 field에만 값을 담고자 할 경우
                경우의 수 별로 parameter constructor 를 만들어줘야함
         */
        UserDTO user1 = new UserDTO("user1", "pass1", "길동홍");
        System.out.println(user1.getInformation());

        // default constructor 이용
        /*
            장점
              - 어떤 field에 어떤 값이 대입될 지 명확하게 볼 수 있음
              - 선택적으로 원하는 field에만 값을 담을 수 있음
            단점
              - 메소드를 여러번 호출해야 돼서 불편함
         */
        UserDTO user2 = new UserDTO();
        user2.setId("user2");
        user2.setPwd("pass2");
        user2.setName("둘리");
        System.out.println(user2.getInformation());

        /*
            parameter constructor 사용하더라도
            setter / getter 를 생성해야 하는 이유
        */

//                 ex) 비밀번호 요청이 들어왔을 시에
        user1.setPwd("1234"); // setter 사용

//                 ex) 아이디 찾기 요청
        System.out.println(user1.getId()); // getter 사용
        System.out.println(user1.getInformation());


        System.out.println("======================================");

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
        CosmeticDTO pd1 = new CosmeticDTO();
        pd1.setProduct("젠틀토닝로션");
        pd1.setPrice(23000);
        pd1.setBrand("아벤느");
        pd1.setCategory("스킨케어");
        pd1.setDiscount(false);
        System.out.println(pd1.getInformation());

        System.out.println("---------------------");

        CosmeticDTO pd2 = new CosmeticDTO("펜라이너", 15000, "클리오", "아이메이크업", true);
        System.out.println(pd2.getInformation());

    } // main end

} // class end
