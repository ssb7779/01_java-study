package com.Kyungbae.practice;

public class PracApplication3 { // class start

    public static void main(String[] args) { // static main start

        String name;     // 이름
        name = "고경배";

        int age;         // 나이 (숫자만 입력)
        age = 32;

        char gender;     // 성별
        gender = '남';

        double height;   // 키 (숫자만 입력)
        height = 175.3;

        System.out.printf("%d살 %c자 %s님 키가 %.1fcm 이시군요!", age, gender, name, height);


    } // static main end

} // class end
