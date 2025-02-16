package com.younggalee.Section03.dto;

public class Application {
    public static void main(String[] args){

        /*
        ## DTO ##
        1. Data Transfer Object
        2. 데이터들을 하나로 뭉치기 위한 객체의 클래스
        3. 행위 중심이(메소드) 아닌 데이터 중심(only)으로 클래스 작성 (데이터 담는 용도)
        4. 객체의 정보들을 필드에 담아서 통채로 전달하고자 할 목적으로 작성

         */

        MemberDTO dto = new MemberDTO();
//        dto.number = 1; // 데이터 조회 입력 불가능 (외부x)
        dto.setNumber(1);
        dto.setName("홍길동");
        dto.setAge(20);
        dto.setGender('남');
        dto.setHeight(180.5);
        dto.setWeight(70.5);
        dto.setActivated(true);

        System.out.println(dto.getNumber());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getHeight());
        System.out.println(dto.getWeight());
    }
}
