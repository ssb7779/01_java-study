package com.inyong.section06.ternary;

public class Application6 {
    public static void main(String[] args) {

        /*
        두 정수값과 하나의 연산기호(+,-)를 통해서 연산 결과 출력할꺼임

        연산기호가 '+' 일경우 두 정수값의 덧셈 결과, '-'일 경우는 뺄셈
        둘다 아니면 "잘못된 연산기호입니다 출력

         */

        int num1 = 1;
        int num2 = 2;
        char op = '-' ;

        String result = (op == '+') ? "결과: " + (num1 + num2)
                : (op == '-') ? "결과: " + (num1 - num2)
                : "잘못된 연산기호입니다.";

        System.out.println(result);
    }
}
