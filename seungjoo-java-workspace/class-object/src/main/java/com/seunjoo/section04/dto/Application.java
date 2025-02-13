package com.seunjoo.section04.dto;

import com.seunjoo.section04.constructor.User;

public class Application {
    public static void main(String[] args) {

//        UserDTO user1 = new UserDTO();
//        user1.setId("user01");
//        user1.setPwd("pwd01");
//        user1.setName("홍길동");
//        System.out.println(user1.getInformation());
//
//
//        //2
//        UserDTO user2 = new UserDTO("user02", "pass02", "김말똥");
//        System.out.println(user2.getInformation());
//
//
//        //ex) 비밀번호 변경 요청
//        user2.setPwd("pwd02");
//
//        //ex) 아이디 찾기 요청
//        System.out.println(user2.getId());
//
//        System.out.println(user2.getInformation());
//
//        System.out.println("================");
//




        /* 실습
            화장품과 관련된 데이터를 보관할 CosemeticClass 작성해보시오.
            이름,가격,브랜드, 카테고리, 할인 여부를 속성으로 가져야 된다.
         */


        Cosmetic cos = new Cosmetic();
        cos.setName("젠틀토닝로션");
        cos.setPrice(23000);
        cos.setBrand("아벤느");
        cos.setCategory("스킨케어");
        cos.setisAccount("할인안함");

        Cosmetic cos1 = new Cosmetic("펜라이너", 15000, "클리오", "아이메이크업", "할인함");

        System.out.println(cos.info());
        System.out.println(cos1.info());




















    }




}
