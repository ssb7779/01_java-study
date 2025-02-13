package com.inyong.section03.dto;

public class Application {
    public static void main(String[] args) {
        /*
        Dto
        데이터를 하나로 뭉치기 위한 객체 클래스
        행위 중심이 아닌 데이터 중심으로 클래스 작성
        객체의 정보들을 필드에 담아서 통채로 전달하고자 할 목적
         */

        MemberDto mem = new MemberDto();

        mem.setNumber(1);
        mem.setName("dd");
        mem.setAge(21);
        mem.setGender('남');
        mem.setHeight(180.5);
        mem.setWeight(70.0);
        mem.setActivated(true);

        System.out.println(mem.getNumber());


        System.out.println("회원번호" + mem.getNumber());

    }
}
