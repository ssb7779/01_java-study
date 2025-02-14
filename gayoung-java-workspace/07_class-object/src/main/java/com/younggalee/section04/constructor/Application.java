package com.younggalee.section04.constructor;

import jdk.swing.interop.SwingInterOpUtils;

public class Application {
    public static void main(String[] args){
        // 클래스명 레퍼런스변수 = new 클래스명();  //객체 생성 구문 이었음
        // 클래스명 레퍼런스변수 = new 생성자();
        User user1 = new User(); // 생성자 작성 없이도 생성이 진행되긴 함.
        // ㄴ기본 생성자 호출하며 객체 생성
//        System.out.println(user1.getInformation());
        System.out.println();

        //id와 pwd값을 전달하며 매개변수 생성자 호출
        User user2 = new User("User01", "pass01");
        System.out.println(user2.getInformation());

        User user3 = new User("User01", "pass01", "이가영");
    }
}
