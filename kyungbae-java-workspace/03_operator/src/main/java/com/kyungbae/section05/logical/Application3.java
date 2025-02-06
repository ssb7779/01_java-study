package com.kyungbae.section05.logical;

public class Application3 { // class start

    public static void main(String[] args) { // main start
//        특정 문자 값이 영문 대문자인지 판별

        char ch = 'D';
        boolean result = (ch >= 'A') &&  (ch <= 'Z');
        System.out.println("문자 값이 영문 대문자 입니까 : " + result);


    } // main end

} // class end
