package com.kyungbae.section06.ternary;

public class Application4 { // class start

    public static void main(String[] args) { // main start

//        특정 문자값이 영문자인지 아닌지 판별 후 출력
//        영문자일 경우 "영문자이다", 아닐 경우 "영문자가 아니다"

        char ch = 'a';

//        &&(AND) 연산자가 ||(OR) 연산자보다 연산 우선순위가 높다
        String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
//                          서순에 따라 괄호 없이도 작동한다
                            ? "영문자이다"
                            : "영문자가 아니다";

        System.out.println(result);


    } // main end

} // class end
