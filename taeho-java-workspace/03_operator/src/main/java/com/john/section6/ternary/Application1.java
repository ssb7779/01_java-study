package com.john.section6.ternary;

/*
    ## 삼항연산자
    1. 조건을 비교한 이후 결과에 따른 값 출력
    2. 표현식 ( [condition] ? val1 : val2)
                              true : false
 */
public class Application1 {
    public static void main(String[] args) {

        int num = 0;
        System.out.println((num > 0) ? "양수이다" : "양수가 아니다");
        String result = ((num > 0) ? "양수이다" : "양수가 아니다");
    }
}
