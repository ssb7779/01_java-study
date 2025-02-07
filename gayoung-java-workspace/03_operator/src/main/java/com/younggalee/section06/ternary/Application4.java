package com.younggalee.section06.ternary;

public class Application4 {
    public static void main(String[] args) {
        char ch = 'ㄹ';
        String result = (ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z') ? "영문자이다" : "영문자 아니다";
        System.out.println(result);
        // 엔드 연산자가 OR연산자보다 우선순위를 가지고 있다. *******
    }
}
