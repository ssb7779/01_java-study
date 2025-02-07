package com.test.pratice;

public class PracApplication3 {
    public static void main(String[] args) {
        String name = "대태호";
        int age = 30;
//        String sex = "남";
        char sex = '남';
        double height = 177.5;

        System.out.printf("%d살 %c %s님 키가 %.1fcm 이시군요", age, sex, name, height);
    }
}
