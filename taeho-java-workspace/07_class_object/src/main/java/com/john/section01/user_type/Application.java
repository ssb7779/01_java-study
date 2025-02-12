package com.john.section01.user_type;

import java.util.Arrays;

/*
    ## 변수만을 가지고 프로그래밍 시 단점
    1. 변수를 일일히 관리해야 하는 번거로움
    2. 특정 메서드 호출 시, 해당 변수들을 전부 인자값으로 전달
    3. 객체의 멤버에 접근하는 방법
        3.1. 객체명.멤버 방식으로 접근
        3.2. '.'은 참조연산자(레퍼런스 변수가 참조하고 있는 주소지로 접근한다는 걸 의미)

 */

public class Application {
    public static void main(String[] args) {
        String id = "user01";
        String pwd = "123456";
        String name = "John";
        int age = 18;
        char gender = 'M';
        String[] hobby = {"독서", "공부"};

        System.out.println("id: " + id);
        System.out.println("pwd: " + pwd);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("hobby: " + Arrays.toString(hobby));

        System.out.println("================");

        Member member = new Member(); // 객체 생성시, 필드가 Heap 메모리에 할당

        System.out.println("id: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.println("hobby: " + Arrays.toString(hobby));

        System.out.println("================");

        member.id = "user01";
        member.pwd = "123456";
        member.name = "John";
        member.age = 18;
        member.gender = 'M';
        member.hobby = new String[]{"축구, 볼링"};

        System.out.println("id: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.println("hobby: " + Arrays.toString(hobby));
    }
}
