package com.inyong.section02.variable;

public class Application4 {
    public static void main(String[] args) {

        /*
        ## System.out.printf()

        %d 정수
        %c 문자
        %s 문자열
        %f 실수
        %b 논리값

         */

        int i1 = 10;
        int i2 = 20;

        System.out.printf("%d %d%% %% \n", i1, i2);
        System.out.printf("%d\n", i1, i2);
//        System.out.printf("%d %d\n", i1); 에러 발생

        System.out.printf("%5d\n", i1);
        System.out.printf("%5d\n", 250);
        System.out.printf("%5d\n", i2);
        System.out.printf("%5d\n", 3000);
        System.out.printf("%5d\n", 12000);

        double d1 = 1.23456789;
        double d2 = 4.56;

        System.out.printf("%f %f\n", d1, d2); //6째 아래까지 표현
        System.out.printf("%.3f %.1f\n", d1, d2);  // 원하는 소수점 자리 반올림 진행

        char c1 = 'a';
        String str= "Hello";

        System.out.printf("%c %10s %s\n", c1, str, c1);
        System.out.printf("%C %10S %s\n", c1, str, c1);
    }
}
