package com.seungjoo.section03.dto;

public class Application {
    public static void main(String[] args) {

        MemberDto mem = new MemberDto();

        mem.setNumber(1);
        mem.setName("홍길동");
        mem.setAge(20);
        mem.setGender('남');
        mem.setHeight(180.5);
        mem.setWeight(654.3);
        mem.setActivated(true);

        System.out.println(mem.getAge());
        System.out.println(mem.getGender());
        System.out.println(mem.getHeight());
        System.out.println(mem.getWeight());
        System.out.println(mem.isActivated());
        System.out.println(mem.getNumber());
        System.out.println(mem.getName());


    }



}
