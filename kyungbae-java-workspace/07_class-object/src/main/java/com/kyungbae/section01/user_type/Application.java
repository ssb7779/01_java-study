package com.kyungbae.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        //회원 정보
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("hobby : " + Arrays.toString(hobby));

        System.out.println("=======================");

        // 클래스 객체 생성 == heap 메모리 상에 필드 확보
        Member member = new Member();
        // # 객체의 멤버에 접근하는 방법
        // 1. 객체명.멤버 방식으로 접근 / '.' = 참조 연산자

        System.out.println("==생성직후 필드 초기값==");
        System.out.println("id : " + member.id);
        System.out.println("pwd : " + member.pwd);
        System.out.println("name : " + member.name);
        System.out.println("age : " + member.age);
        System.out.println("gender : " + member.gender);
        System.out.println("hobbt : " + member.hobby);

        // 필드에 값 대입
        member.id = "user01"; // 필드에 직접 접근 중..
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"}; // 선언과 동시에 생성이 아니여서 new String[] 추가해줘야함

        System.out.println("=======대입이후========");

        System.out.println("id : " + member.id);
        System.out.println("pwd : " + member.pwd);
        System.out.println("name : " + member.name);
        System.out.println("age : " + member.age);
        System.out.println("gender : " + member.gender);
        System.out.println("hobbt : " + Arrays.toString(member.hobby));

    }


}
