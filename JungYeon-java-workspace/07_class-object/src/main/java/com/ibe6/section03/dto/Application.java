package com.ibe6.section03.dto;

public class Application {
    public static void main(String[] args) {
        /*
            ## DTO ##
            1. Data Transfer Object
            2. 데이터들을 하나로 뭉치기 위한 객체의 클래스
            3. 행위 중심이 아닌 데이터 중심으로 클래스 작성
            4. 객체의 정보들을 필드에 담아서 통채로 전달하고자 할 목적으로 작성
         */

        MemberDTO mem = new MemberDTO();

        mem.setNumber(1);
        mem.setName("홍길동");
        mem.setAge(20);
        mem.setGender('남');
        mem.setHeight(180.5);
        mem.setWeight(65.3);
        mem.setActivated(true);

        System.out.println("회원번호: " + mem.getNumber());
        System.out.println("이름: " + mem.getName());
        System.out.println("나이: " + mem.getAge());
        System.out.println("성별: " + mem.getGender());
        System.out.println("키: " + mem.getHeight());
        System.out.println("몸무게: " + mem.getWeight());
        System.out.println("활성화상태: " + mem.isActivated());

    }
}
