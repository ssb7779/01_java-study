package com.kyungbae.section05.logical;

public class Application2 { // class start

    public static void main(String[] args) { // main start

//        특정 정수값이 1부터 100사이의 값인지 판별
        int num = -30;

//        boolean result = 1 <= num <= 100;
//        boolean result = ((1 <= num) && (num <= 100));
        boolean result = ((num >= 1) && (num <= 100)); // num 이 1 이상 이고(AND) num 이 100 이하인지

        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);

    } // main end

} // class end
