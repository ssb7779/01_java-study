package com.kyungbae.section04.constructor;

public class Application {
    public static void main(String[] args) {

        // 1. 기본생성자 호출하며 객체 생성
        User user1 = new User();
        System.out.println(user1.getInformation());
        System.out.println();
//        아이디 null, 비밀번호 null, 이름 null

        // 2. 아이디와 비번 값을 전달하며 매개변수 생성자 호출
        User user2 = new User("user01", "pass01");
        System.out.println(user2.getInformation());
//        아이디 user01, 비밀번호 pass01, 이름 null

        // 3. 아이디와 비번, 이름 값을 전달하며 매개변수 생성자 호출
        User user3 = new User("user02", "pass02", "홍길동");
        System.out.println(user3.getInformation());


    } // main end

} // class end
