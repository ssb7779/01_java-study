package com.kyungbae.section06.ternary;

public class Application6 { // class start

    public static void main(String[] args) { // main start
        /*
            두 정수값과 하나의 연산기호(+,-)를 통해서 연산 결과 출력
            연산기호가 + 일 경우 덧셈결과 출력
            연산기호가 - 일 경우 뺄셈결과 출력
            연산기호가 잘못되어 있을 경우 "잘못된 연산기호 입니다." 출력

         */

        int num1 = 5;
        int num2 = 2;
        char op = '/'; // 연산기호

        int sum = num1 + num2;
        int minus = num1 - num2;

        String result = op == '+'
                        ? sum + ""
//                 숫자는 int 하지만 연산은 String +""을 통해 int 를 String 으로 변환
                        : op == '-' ? minus + "" : "잘못된 연산기호입니다.";

        System.out.printf("%d %c %d = %s\n", num1, op, num2, result);



    } // main end

} // class end
