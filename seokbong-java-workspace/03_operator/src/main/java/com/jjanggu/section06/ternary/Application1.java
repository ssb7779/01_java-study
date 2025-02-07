package com.jjanggu.section06.ternary;

public class Application1 {
    public static void main(String[] args) {

        /*
            ## 삼항 연산자 (피연산자 3개를 가지고 연산) ##
            [표현법]
            조건식 ? 조건식이 true일 경우 반환값 : 조건식이 false일 경우 반환값
         */


        // 특정 정수값이 양수인지 아닌지 판별 후 출력
        // 정수값이 양수일 경우 "양수이다", 아닐 경우 "양수가 아니다"

        int num = 0;

//        String result = num > 0 ? "양수이다" : "양수가 아니다";
        String result = (num < 0) ? "양수가 아니다" : "양수이다";

        System.out.println(result);

    }
}
