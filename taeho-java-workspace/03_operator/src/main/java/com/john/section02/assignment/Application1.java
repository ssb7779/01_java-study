package com.john.section02.assignment;


/*
    ## 복합대입연산자
    1. 산술연산자 + 대입연산자
    2. 연산처리속도의증가로 사용권장
    - 종류 ( += , -=, *= , /=, %=)
 */
public class Application1 {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("num = " + num);

//        num = num + 3;
//        System.out.println("num = " + num);

        // 복합연산자 사용
        num += 3;
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 6;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 4;
        System.out.println("num = " + num);


        String str = "hello";;

        str += " world";
        System.out.println("str = " + str);
    }
}
