package com.sotogito.section3.dto;

public class Application {
    public static void main(String[] args) {
        /**
         * ## DTO
         * 특정 데이터를 하나로 뭉치기 위한 객체의 클래스
         * 행위 중심이 아닌 데이터 중심으로 클래스 작성
         * 묶어서 전달하고 싶을때
         */

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setName("fe");
        memberDTO.setNumber(1);
        memberDTO.setAge(20);
        memberDTO.setGender('F');
        memberDTO.setHeight(123.2);
        memberDTO.setWeight(13.2);
        memberDTO.setActivated(true);
    }
}
