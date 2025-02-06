package com.kyungbae.section04.comparison;

public class Application1 { // class start

    public static void main(String[] args) {
        /*
            # 비교 연산자
            1. 이항 연산자
            2. true, false 출력
            3. 종류
                1) 대소비교 : < , > , <= , >=
                2) 동등비교 : == , !=

         */

        int a = 10;
        int b = 25;

        System.out.println("a == b : " + (a == b)); // 괄호로 먼저 묶어주어야 한다 * 연산 서순
        // 괄호 없을 시 => ("a == b: " + a) == b 이 순서로 연산하여 오류 발생
        System.out.println("a != b : " + (a != b));

        boolean result = a > b;
        System.out.println("a > b : " + result);

        System.out.println((a * 2) > (b / 5));

        System.out.println("a가 짝수인가 : " + ((a % 2) == 0));
        // 2로 나눴을때 나머지 몫이 0 이면 짝수
        System.out.println("a가 홀수인가 : " + ((a % 2) == 1));
        // 2로 나눴을때 나머지 몫이 1 이면 홀수
        System.out.println("a가 홀수인가 : " + ((a % 2) != 0));
        // 2로 나눴을때 나머지 몫이 0 이 아니면 홀수




    }

} // class end
