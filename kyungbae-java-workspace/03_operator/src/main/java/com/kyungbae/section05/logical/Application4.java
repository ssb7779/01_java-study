package com.kyungbae.section05.logical;

public class Application4 { // class start

    public static void main(String[] args) { // main start
//        특정 성별값(m/M/f/F) 을 가지고 남자인지 판별
        char gender = 'M';
        boolean result = (gender == 'm') || (gender == 'M');

        System.out.println("남자입니까? " + result);


    } // main end

} // class end
