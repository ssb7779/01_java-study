package com.jjanggu.section06.ternary;

public class Application6 {
    public static void main(String[] args) {

        /*
            두 정수값과 하나의 연산기호(+,-)를 통해서 연산 결과 출력할꺼임

            연산기호가 '+' 일 경우 => 두 정수값의 덧셈결과 출력
            연산기호가 '-' 일 경우 => 두 정수값의 뺄셈결과 출력
            연산기호가 잘못되어있을 경우 => "잘못된 연산기호입니다." 출력
        */

        int num1 = 5;
        int num2 = 3;
        char op = '*';

        int sum = num1 + num2;
        int diff = num1 - num2;

        String result = (op == '+') ? num1 + num2 + ""  //
                      : (op == '-') ? num1 - num2 + "" : "잘못된 연산기호입니다.";

        System.out.printf("%d %c %d = %s\n", num1, op, num2, result);
    }
}
