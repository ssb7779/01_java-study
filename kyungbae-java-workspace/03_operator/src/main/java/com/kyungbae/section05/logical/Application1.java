package com.kyungbae.section05.logical;

public class Application1 { // class start

    public static void main(String[] args) { // main start
        /*
           # 논리 연산자
           1. 논리값을 취급하는 연산자
           2. 결과값 또한 논리값으로 도출
           3. 종류
            1) 논리 연결 연산자 (이항 연산자)
                - && (논리 AND)   : 두 개의 논리값이 모두 true 일 경우 ture 결과
                - || (논리 OR)    : 두 개의 논리값 중 하나다로 true 일 경우 ture 결과
            2) 논리 부정 연산자 (단항 연산자)
                - ! (논리 NOT)    : 한 개의 논리값을 반대로 바꿔서 반환 => ture -> false

         */

        System.out.println("=== && 연산 ==="); // AND
        System.out.println("t && t : " + (true && true));
        System.out.println("t && f : " + (true && false));
        System.out.println("f && t : " + (false && true));
        System.out.println("f && f : " + (false && false));

        System.out.println("=== || 연산 ==="); // OR
        System.out.println("t || t : " + (true || true));
        System.out.println("t || f : " + (true || false));
        System.out.println("f || t : " + (false || true));
        System.out.println("f || f : " + (false || false));

        System.out.println("=== ! 연산 ===");
        System.out.println("!ture : " + (!true));
        System.out.println("!false : " + (!false));

        System.out.println("----------------");

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 : " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 : " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 : " + (a < b && c > d));

        System.out.println("a가 b보다 크거나 c가 d보다 작은지 : " + (a > b || c < d));
        System.out.println("b가 a보다 크거나 c가 a보다 작은지 : " + (a < b || c < a));



    } // main end


} // class end
