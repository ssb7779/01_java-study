package com.kyungbae.section06.ternary;

public class Application2 { // class start

    public static void main(String[] args) { // main start
//        특정 정수값이 짝수인지 홀수인지 판별 후 출력
//        짝수일 경우 "짝수이다" 그게 아니면 "홀수이다"

        int num = 1522;

//        String result = ((num % 2) == 0) ? "짝수이다" : "홀수이다";
//        String result = ((num % 2 == 1) ? "홀수이다" : "짝수이다");
//        String result = ((num % 2 != 0) ? "홀수이다" : "짝수이다");
        String result = ((num % 2 != 1) ? "짝수이다" : "홀수이다");

        System.out.println("num 은 " + result);



    } // main end

} // class end
