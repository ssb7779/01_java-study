package com.john.section04.constructor;

public class Application {
    public static void main(String[] args) {

        User user1 = new User();

        User user2 = new User("user01", "pass1234");
        System.out.println(user2.getInfo());

        User user3 = new User("user02", "pass1234", "도우너");
        System.out.println(user3.getInfo());
    }
}
