package com.younggalee.section05.logical;

public class Application5 {
    public static void main(String[] args) {
        /*
            ## short circuit ##
            1. && : 두 논리값 모두 true여야 최종 결과가 true
                false && false >> 앞이 false 면 오른쪽 연산은 수행하지도 않음 그냥 false 출력
            2. || 도 마찬가지 (앞쪽 결과가 true면 오른쪽 연산 수행하지 x)
         */
        int num1 = 10;
        boolean result1 = (num1 < 5) && (++num1 > 0);
        System.out.println(num1);

        int num2 = 10;
        boolean result2 = (num2 < 20) && (++num2 > 0);
        System.out.println(num2);
    }
}
