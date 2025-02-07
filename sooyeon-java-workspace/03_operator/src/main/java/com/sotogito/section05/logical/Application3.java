package com.sotogito.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        //특정 문자가 영문 대문자인지 확인
        char ch = 'A';

        boolean result = (ch >= 'A' && ch <= 'Z');
        result = ch >= 65 && ch <= 90;

        System.out.println(result);
    }
}
