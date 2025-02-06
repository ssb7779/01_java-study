package com.jjanggu.section5.logical;

public class Application3 {
    public static void main(String[] args) {
        // 특정 문자값이 영문 대문자('A(65)' ~ 'Z(90)')인지 판별
        char ch = 'C';
        boolean result = (ch >= 'A') && (ch <= 'Z');

        System.out.println("문자값이 영문 대문자 입니까 : " + result);



    }
}
