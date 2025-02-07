package com.seungjoo.section05.logical;

public class Application5 {
    public static void main(String[] args) {
        /*
         ##short circuit
         1.&& : 두 논리값 모두 true여야 최종 결과가 true
         ->앞쪽 연산의 결과가 이미 false로 나와버리면 뒤의 연산은 할 필요가 없음.

         2.|| : 두 논리값 중 하나라도 true면 최종 결과가 true
         */

        int num1 = 10;
        boolean result = (num1 < 5) && (++num1 > 0);
        System.out.println(num1);

        int num2 = 10;
        boolean result2 = (num2 < 20) || (++num2 < 0);
        System.out.println(num2);


    }
}
