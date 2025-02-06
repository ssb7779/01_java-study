package com.john.practice;

public class Quiz {
    static void stepOne(int a, int b, int c, int d) {
        a = 11;
        b = -5;
        c = a++ - b--;
        d = ++c + a--;

        /* 순서
            System.out.println("set int a");
            // a = 11
            System.out.println("set int b");
            // b = -5
            System.out.println("set int c");
            // a = 11, b = -5, c = 16
            System.out.println("after set int c");
            // a = 12, b = -6, c = 16
            System.out.println("set int d");
            // a = 12, b = -6, c = 17, d = 29
            System.out.println("after set int d");
            // a = 11, b = -6, c = 17, d = 29
        */
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println("Step1 ==================");
    }

    static void stepTwo(char a, int b, int c) {
        a = 'Z';
        System.out.println(!(a >= 'A' && a <= 'Z'));
        /*
            1.( ) 결과는 True
            2. 부정 연산자에 의해 false
         */
        b = 3;
        c = 10;
        System.out.println(c >= 5 || b < 0 && b > 2);
        /*
            c >= 5가 true 로 true 출력 (short circuit)
         */

        System.out.println("Step2 ==================");
    }

    static void stepThree(int a, int b, int c, int d, int e, int result1, boolean result2, int result3) {
        a = 2;
        b = 4;
        c = 2;
        d = 3;
        e = 6;

        result1 = 5 > 4 ? 50 : 40;
        System.out.println("result1: " + result1);
        /*
            5 > 4 가 true로 50
         */
        result2 = a == b ? a <= c : b > c;
        System.out.println("result2: " + result2);
        /*
            1. a == b 가 false, b > c 확인
            2. b > c 가 true로 true출력
         */

        result3 = true && false ? d * 2 + e : d - e;
        System.out.println("result3: " + result3);
        /*
            1. true && false 가 false, d - e 확인
            2. 3 - 6 = -3
         */

        System.out.println("Step3 ==================");
    }

    static void stepFour(int x, int y, char c){
        x = 2;
        y = 5;
        c = 'A';

        System.out.println(y >= 5 || x < 0 && x > 2);
        /*
            y >= 5 가 true 로 true 출력
         */

        System.out.println(y += 10 - x++);
        /*
            y += 10 => 15
            x++ => 2
            result: 13
            후위연산자로 x 값 증가 2 -> 3
         */

        // x = 3, y = 5
        System.out.println(x += 2);
        /*
            x += 2 => 5
         */
        System.out.println( !('A' <= c && c <='Z') );
        /*
            ('A' <= c && c <='Z') 조건이 true
            부정연산자에 의해 false 출력
         */
        System.out.println('C' - c);
        /*
            ASCII 코드값 A = 65 , c = 67
            67 - 65 = 2
         */
        System.out.println('5' - '0');
        /*
            ASCII 코드값 계산이지만 차가 5므로 5
         */
        System.out.println(c + 1);
        /*
            ASCII 코드값 계산 'A' = 65
            65 + 1 = 66
         */
        System.out.println(++c);
        /*
            전위연산자로 +1 된 값이 출력 'A' => 'B'
         */
        System.out.println(c++);
        /*
            후위연산자로 전과 동일한 값이 출력 'B' => 'B'
            이후 값 +1
         */
        System.out.println(c);
        /*
            이전에 +1된 값이 반영, 'B' => 'C'
         */
        System.out.println("Step4 ==================");
    }

    public static void main(String[] args) {
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;
        stepOne(a1, b1, c1, d1);

        char a2 = ' ';
        int b2 = 0;
        int c2 = 0;
        stepTwo(a2, b2, c2);

        int a3 = 0;
        int b3 = 0;
        int c3 = 0;
        int d3 = 0;
        int e3 = 0;
        int result1 = 0;
        boolean result2 = true;
        int result3 = 0;
        stepThree(a3, b3, c3, d3, e3, result1, result2, result3);

        int x4 = 0;
        int y4 = 0;
        char c4 = ' ';
        stepFour(x4, y4, c4);
    }
}
