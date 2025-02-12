package com.john.section01.user_type;

import java.util.Arrays;

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

    }
}
