package com.younggalee.section04.conparison;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## 비교 연산자 ##
            1. 이항 연산자
            2. 연산 결과값은 참 거짓을 반환
            3. 종류
                1) 대소비교 : <  >  <=  >=
                2) 동등비교 : ==  !=
         */
        int a = 10;
        int b = 20;
        boolean result = a > b;
        System.out.println(a * 2 > b / 5);

        System.out.println("a는 짝수인가 " + (a % 2 == 0));

        //논리값 간의 비교는 동등비교만 가능 (대소비교 불가능)

        // 문자값 간의 비교 연산
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println(ch1 > ch2);

        // 문자열값 간의 비교 연산
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        // 대소비교 불가능 System.out.println(str1 > str2);
    }
}
