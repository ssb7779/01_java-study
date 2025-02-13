package com.kyungbae.section03.dto;

public class Application {

    public static void main(String[] args) {
        MemberDTO mem = new MemberDTO();

        mem.setNumber(1);
        mem.setName("홍길동");
        mem.setAge(20);
        mem.setGender('남');
        mem.setHeight(180.5);
        mem.setWeight(70.2);
        mem.setActivated(true);

        System.out.println("회원번호 : " + mem.getNumber());
        System.out.println("이름 : " + mem.getName());
        System.out.println("나이 : " + mem.getAge());
        System.out.println("성별 : " + mem.getGender());
        System.out.println("키 : " + mem.getHeight());
        System.out.println("몸무게 : " + mem.getWeight());
        System.out.println("활성화상태 : " + mem.isActivated());


    } // main end

} // class end
