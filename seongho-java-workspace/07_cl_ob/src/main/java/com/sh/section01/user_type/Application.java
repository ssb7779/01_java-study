package com.sh.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        //회원정보 (아이디 ,비번 ,이름 ,나이, 성별, 취미) 관리

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gen = '남';
        String[] hobby = {"축구", "볼링","테니스"};
        System.out.println("id:"+id );
        System.out.println("pw:"+pwd );
        System.out.println("name:"+name );
        System.out.println("age:"+age );
        System.out.println("gen:"+gen );
        System.out.println("hobby:"+ Arrays.toString(hobby));


        System.out.println("=================================");

        //사용자정의자료형(Member) 클래스를 가지고 필드에 정보를 담기 위해
        //클래스를 가지고 객체 생성
        Member member = new Member(); //객체 생성시 필드가 heap메모리할당

        /*
        ## 객체의 멤버(필드 ,메소드)에 접근하는 방법##
        1.객체명.멤버 방식
        2. '.'은 참조연산자, 래퍼런스변수가 참조하고 있는 주소지로 접근한다는걸 의미
        3. 예)
            필드 접근
                레퍼런스.필드명
            메소드 접근
                레퍼런스.메소드명()
         */
        System.out.println("초기값");
        System.out.println("id" +member.id);
        System.out.println("pw" +member.pw);
        System.out.println("name" +member.name);
        System.out.println("age" +member.age);
        System.out.println("gen" +member.gen);
        System.out.println("hobby" +member.hobby);

        //해당 객체의 각 필드에 값 대입
        member.id ="user";
        member.pw    ="pw1";
        member.name ="ghdrlfehd";
        member.age =5;
        member.gen ='M';
        member.hobby =new String[]{"축구","볼링","테니스"};
    }

}
