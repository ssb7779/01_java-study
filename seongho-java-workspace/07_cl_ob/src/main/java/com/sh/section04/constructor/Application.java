package com.sh.section04.constructor;

public class Application {
    public static void main(String[] args) {
        //클래스명 레퍼런스변수 = new 클래스명();
        //클래스명 레퍼런스변수 = new 생성자();

        //1. 기본생성자 호출하며 객체 생성
        User user1 = new User();
        System.out.println(user1.getIF());
        System.out.println();
        //2.아이디와비번 전달 매개변수 생성자 호출
        User user2 = new User("user","pw");
        System.out.println(user2.getIF());
        System.out.println();
        //3. 아이디와 비번 , 이름 값을 전달하며 매개변수 생성자 호출
        User user3 = new User("user02","pw2","ksh");
        System.out.println(user3.getIF());
    }
}
