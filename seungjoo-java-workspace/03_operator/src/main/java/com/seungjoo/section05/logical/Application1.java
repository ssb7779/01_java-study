package com.seungjoo.section05.logical;

public class Application1 {
    public static void main(String[] args) {



        /*
            #논리 연산자#
            1. 논리값(true/false)을 취급하는 연산자
            2. 결과값 또한 논리값으로 도출
            3. 종류
                1)논리 연결 연산자(이항 연산자)
                 - && (논리 AND) : 두 개의 논리값이 모두 true일 경우 최종 true 결과 반환, 둘 중 하나라도 false일 경우 최종 false 반환
                 - || (논리 OR) : 두 개의 논리값 중 하나라도 true일 경우 최종 true 반환, 둘 다 모두 false일 경우 최종 false 반환
                 2) 논리 부정 연산자 (단항 연산자)
                    - !(논리 not) : 한 개의 논리값을 반대로 바꿔 반환
         */

        System.out.println("&& 연산 =======");
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);

        System.out.println(!true);
        System.out.println(!false);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 : " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지:" + (a<b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지: " + (a>b && c > d ));


        System.out.println("a가 b보다 크거나 c가 d보다 작은지: " + (a > b || c < d));
        System.out.println("b가 a보다 크거나 c가 a보다 작은지: " + (b > a || c <a));
    }


}
