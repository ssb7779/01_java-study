package com.inyong.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // 회원정보(아이디, 비번, 이름, 나이, 성별, 취미)

//        String id = "user01";
//        String pwd = "pass01";
//        String name = "홍길동";
//        int age = 20;
//        char gender = '남';
//        String[] hobby = {"축구", "볼링", "게임"};
//
//        System.out.println("id: " + id);
//        System.out.println("pwd: " + pwd);
//        System.out.println("name: " + name);
//
//        System.out.println("age: " + age);
//        System.out.println("gender: " + gender);
//        System.out.println("hobby: " + Arrays.toString(hobby));
//

        Member member = new Member();

        /*
        ##객체의 맴버(필드, 메소드)에 접근하는 방법
        1. 객체명, 맴버 방식으로 접근
        2. '.'은 참조연산자, 래퍼런스변수가 참조하고있는 주소지로 접근한다는걸 의미
         */

        System.out.println("초기값 id : " + member.id);
        member.id = "user_id";
        System.out.println("대입값 id : " + member.id);

        System.out.println("초기값 hobby : " + member.hobby);
        member.hobby = new String[]{"축구", "볼링", "게임"};
        System.out.println("대입값 hobby : " + Arrays.toString(member.hobby));



    }
}

