package com.jun.section05.logical;

public class Application3 {
    public static void main(String[] args) {

        // 특정 문자값이 영문 대문자('A'~ 'Z')인지 판별
        char ch = '!';

        boolean result = (ch >= 'A' && ch <= 'Z');
//        boolean result2 = (ch >= 65 && ch <= 90);

        System.out.println("특정 문자값이 영문 대문자인지 : " + result);

    }
}
