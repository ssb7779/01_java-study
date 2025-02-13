package com.inyong.section04.dto;

public class Application {
    public static void main(String[] args) {

        //객체 생성시 필드에 값을 초기화 하는방법

    /*
    1. 기본생성자로 생성한 후 setter를 이용해서 필드값 변경
     */

        UserDTO user1 = new UserDTO();
        user1.setId("userId");
        user1.setPwd("asdf");
        user1.setName("주황버섯");

        System.out.println(user1.getInformation());


        UserDTO user2 = new UserDTO("user02", "pass02", "주황버섯");

        System.out.println(user2.getInformation());

        user2.setPwd("1234");

    }

}

