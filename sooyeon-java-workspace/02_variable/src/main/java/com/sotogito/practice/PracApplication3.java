package com.sotogito.practice;

public class PracApplication3 {
    public static void main(String[] args) {
        String name = "sukipi";
        int age = 26;
        char gender = '여';
        float height = 172.0f;

        System.out.printf("%d살 %c자 %s님 키가 %.1fcm 이시군요!",
                age, gender, name, height);
    }

}
