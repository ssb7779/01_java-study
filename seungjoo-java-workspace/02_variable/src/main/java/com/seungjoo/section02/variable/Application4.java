package com.seungjoo.section02.variable;

public class Application4 {
    public static void main(String[] args) {

        /*
         ##System.out.printf() %d같은 것을 쓰려면 printf를 사용해야함
         System.out.printf("출력하고자하는 형식", 값, 값, ..);
         -> 형식대로 값들이 출력되고 줄바꿈 발생x

         ## 포맷 키워드 ##
         1. %d : 정수
         2. %c : 문자
         3. %s : 문자열
         4. %f : 실수
         5. %b : 논리값
         */
        int i1 = 10;
        int i2 = 20;

        //10 20%
        System.out.println(i1 + " " + i2 + "%");
        System.out.printf("%d %d%%\n", i1, i2);

        System.out.printf("%5d\n", i1);
        System.out.printf("%5d\n", 250);
        System.out.printf("%5d\n", i2);
        System.out.printf("%5d\n", 2);
        System.out.printf("%5d\n",12000); //오른쪽 정렬해서 출력

        double d1 = 1.23456789;
        double d2 = 4.53;

        System.out.printf("%f %f\n", d1, d2); // 소수점 아래 6째짜리 까지 표현
        System.out.printf("%.3f %.1f\n", d1, d2); //반올림이 되서 출력됨.

        char ch = 'a';
        String str = "Hello";

        System.out.printf("%c %10s %s\n",ch, str, ch); //%s자리에 문자값 하나 들어가는 것은 문제가 안 생김
        System.out.printf("%c %10S %s\n",ch, str, ch); //format을 대문자로 할경우 해당하는 것도 대문자로 나옴
    }
}
