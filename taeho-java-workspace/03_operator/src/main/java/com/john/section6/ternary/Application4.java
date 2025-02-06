package com.john.section6.ternary;

public class Application4 {
    public static void main(String[] args) {


        char ch;
        ch = 'y';
        System.out.println((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? "영문자이다" : "아니다");
        System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "영문자이다" : "아니다");
    }
}
