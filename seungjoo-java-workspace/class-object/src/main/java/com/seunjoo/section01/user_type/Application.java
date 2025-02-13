package com.seunjoo.section01.user_type;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        //회원 정보(아이디, 비번, 이름, 나이, 성별, 취미 관리)

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = {"축구", "볼링", "테니스"};


        System.out.println(id);
        System.out.println(pwd);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(Arrays.toString(hobby));


        System.out.println("==============");
        // 사용자 정의 자료형(Member) 클래스를 가지고 필드에 정보를 담기 위해서 클래스를 가지고객체 생성해야됨.
        Member member = new Member();  //객체 생성시 -> 필드가 heap메모리에 할당

        /*
         #객체의 멤버(필드, 메소드)에 접근하는 방법
         1.객체명.멤버 방식으로 접근
         2. '.'은 참조연산자, 레퍼런스 변수가 참조하고 있는 주소지로 접근한다는 걸 의미
         3. 예시
            1)필드 접근
                레퍼런스.필드면
            2)메소드 접근
                레퍼런스.메소드명()
         */
        System.out.println("== 생성 직후 각 필드 초기값 ==");
        System.out.println("id: " + member.id);
        System.out.println("name: " + member.name);
        System.out.println("age:" + member.age);
        System.out.println("gender:" + member.gender);
        System.out.println("hobby: " + member.hobby);


        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};
        System.out.println("id: " + member.id);
        System.out.println("name: " + member.name);
        System.out.println("age:" + member.age);
        System.out.println("gender:" + member.gender);
        System.out.println("hobby: " + Arrays.toString(member.hobby));
    }














































































}
