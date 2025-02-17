package com.john.section03.dto;

/*
    ## DTO (Data Transfer Object)
    1. 데이터들을 하나로 뭉치기 위한 객체 클래스
    2. 행위 중심이 아닌 데이터 중심으로 클래스 작성
    3. 객체의 정보들을 필드에 담아서 전달하고자 할 목적으로 작성
 */
public class Application {
    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("John");
        member.setAge(22);
        member.setGender('남');
        member.setHeight(180.5);
        member.setWeight(65.4);
        member.setActivated(true);

        System.out.println("회원번호: " + member.getNumber());
        System.out.println("이름: " + member.getName());
        System.out.println("나이: " + member.getAge());
        System.out.println("성별: " + member.getGender());
        System.out.println("키: " + member.getHeight());
        System.out.println("몸무게: " + member.getWeight());
        System.out.println("활성화여부: " + member.isActivated());
    }
}
