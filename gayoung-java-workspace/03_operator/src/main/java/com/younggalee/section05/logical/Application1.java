package com.younggalee.section05.logical;

import static java.lang.Boolean.FALSE;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## 논리 연산자 ##
            논리값을 취급하는 연산자로 결과값 또한 논리값으로 도출
            - 종류
               : 논리 연결 연산자 (이항 연산자)
                 ㄴ &&(AND: 둘다 맞아야 T)   ||(OR: 둘다 틀려야 F)
               : 논리 부정 연산자 (단항 연산자)
         */
        System.out.println(true && true);
        System.out.println(FALSE || false);
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a < b && c < d);
        System.out.println(a < b && c > d);
        System.out.println(a > b && c > d);
        System.out.println(a > b || c < d);
        System.out.println(a < b || c < a);
    }
}
