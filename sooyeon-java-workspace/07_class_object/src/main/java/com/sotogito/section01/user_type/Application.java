package com.sotogito.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        String id = "12qw";
        String pw = "fEQW";
        String name = "raltndus";
        int age = 20;
        char gender = '남';
        String[] hobby  = {"축","볼","테"};

        System.out.println(id);
        System.out.println(pw);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(Arrays.toString(hobby));


        System.out.println("=================================================================================");
        //사용자를 정의자료형 클래스로 객체를 생성해야함
        Member member = new Member(); //객체 생성 : Heap메모리에 할당

        /**
         * 레퍼런스.필드명
         * 레퍼런스.메서드명()
         */

        //대입
        member.id = "user01";
        member.pwd = "12345";
        member.name = "홍홍홍";
        member.age = 1;
        member.gender = '남';
        member.hobby = new String[] {"축구","야구","농구"}; //fixme new로 선언해줘야함

        //출력
        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(Arrays.toString(member.hobby));

    }
}
