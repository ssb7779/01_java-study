package com.inyong.section05.logical;

public class Application3 {
    public static void main(String[] args) {

        // 특정 문자값이 영문 대문자인지 판별

        char ch = 'A';
        char ch2 = 'B';
        System.out.println(ch == ch2);
        System.out.println(ch >= 'A' && ch <= 'Z');


        String str = "hello";
        String str2 = "hello";
        System.out.println(str == str2);


    }
}