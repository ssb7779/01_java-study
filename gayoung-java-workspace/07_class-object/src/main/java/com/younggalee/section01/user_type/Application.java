package com.younggalee.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        //회원정보(아이디, 비번, 이름, 나이, 성별, 취미) 관리
//         String id = "user01";
//         String pwd = "pass01";
//         String name = "홍길동";
//         int age = 20;
//         char gender = '남';
//         String[] hobby = {"축구", "볼링", "테니스", "사과게임"};
//         System.out.println("id : " + id);
//        System.out.println("pwd : " + pwd);
//        System.out.println("name : " + name);
//        System.out.println("age : " + age);
//        System.out.println("gender : " + gender);
//        System.out.println("hobby: " + Arrays.toString(hobby));

        /*
        ## 변수만을 가지고 프로그래밍할 때 단점 ##
        1. 변수들을 일일이 다 관리해야하는 어려움
        2. 특정 메소드 호출시 회원정보 값을 전달할 경우
           많은 인자값들 전달로 가독성이 떨어짐
        3. 특정 메소드에서 해당 회원정보를 반환해야될 경우
           반환은 1개만 가능하기 때문에 반환이 어려움
         */
         // 사용자 정의 자료형  >> Class

        Member mem = new Member(); // 객체 생성시 필드가 heap메모리에 할당됨 by Jvm
        /*
        ## 객체의 멤버에 접근하는 방법 ##
        1. 객체명.멤버 방식으로 접근( . : 참조연산자, 레퍼런스변수가 참조하고 있는 주소지로 접근한다는 의미)
        참조연산자 :   .  /  ::  /  new
        1) 필드 접근 : 레퍼런스.필드명
        2) 메소드 접근 : 래퍼런스.메소드명()
        *** 레퍼런스 : 주소값을 저장하는 변수 (객체 가리키는)
         */
        System.out.println(mem.name + mem.id + mem.gender + Arrays.toString(mem.hobby));
        System.out.println(mem.gender);


        // 직접 접근한 모습(캡슐화 전) *************
        mem.id = "user01";
        mem.pwd = "pass01";
        mem.name = "이가영";
        mem.age = 20;
        mem.gender = '남';
        mem.hobby = new String[]{"축구","사과"};

        System.out.println(mem.name + mem.id + mem.gender + Arrays.toString(mem.hobby));
    }
}
