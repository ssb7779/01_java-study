package com.inyong.section04.constructor;

public class Application {
    public static void main(String[] args) {


        //1. 기본생성자 호출하며 객체생성
        User user1 = new User();
        System.out.println(user1.getInformation());

        User user2 = new User("user01", "pass01");
        System.out.println(user2.getInformation());

        User user3 = new User("user01", "pass01", "mir");
        System.out.println(user3.getInformation());


    }
}
