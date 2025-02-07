package com.podoseee.section06.ternary;

public class Application6 {
    public static void main(String[] args) {
        /*
            두 정수값과 하나의 연산기호(+,-)를 통해서 연산 결과 출력할거임

            연산기호가 '+'일 경우 => 두 정수값의 덧셈결과 출력
            연산기호가 '-'일 경우 => 두 정수값의 뺄셈결과 출력
            연산기호가 잘못되어있을 경우 => "잘못된 연산기호입니다." 출력
         */
        int num1 = 5;
        int num2 = 3;
        char op = '+';

        //내가쓴오류코드
        //String result = (op == '+') ? (num1+num2)
        //                                    : ((op == '-') ? (num1-num2) : "잘못된 연산기호입니다");

        // String 쓴 경우 : + "" => int를 String으로 바꿔줘야함
        /*
        String result = (op == '+') ? (num1+num2 + "")
                                    : ((op == '-') ? (num1-num2 + "") : "잘못된 연산기호입니다");
        System.out.println(result);
        */

        System.out.println((op == '+') ? (num1+num2)
                : ((op == '-') ? (num1-num2) : "잘못된 연산기호입니다")); //이건 String으로 바꿀 필요가 없음

        //선생님풀이
        String result = (op == '+') ? (num1+num2 + "")
                : ((op == '-') ? (num1-num2 + "") : "잘못된 연산기호입니다");
        System.out.printf("%d %c %d = %s\n", num1, op, num2, result);
    }
}
