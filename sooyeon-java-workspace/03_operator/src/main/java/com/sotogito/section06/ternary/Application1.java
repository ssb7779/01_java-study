package com.sotogito.section06.ternary;

public class Application1 {
    public static void main(String[] args) {

        /**
         * ## 삼항연산자 - 피연산자 3개를 가지고 연산하는 연산자
         * 조건식 ? 반환값(true) : 반환값(false)
         */
        //특정 정수값이 양수인지 아닌지 판별 후 출력

        int num = 1;
        String result = num > 0 ? "양수이다" : "양수가 아니다";
        result = num < 0 ? "양수아니다" : "양수다";

        System.out.println(result);

        String result2 = num % 2 == 0 ? "짝" : "홀";
        System.out.println(result2);

    }
}
