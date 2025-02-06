package com.jjanggu.section03.in_decrement;


public class Application1 {
    public static void main(String[] args) {


        /* 증감연산자##
        1.단항 연산자
        2. 종류
           1) ++ : 변수에 담긴 값을 1도 증시켜주는 연산자
                ++ {표현법} ++, 변수9
           2) -- : 변수에 담긴 값을 1 감소시켜주는 연산자
                [표현법] -- 변수 --
     */
        //전위연산
        int num1 = 10;
        System.out.println("최초 num1 : " + num1);
        System.out.println("1회 증가 후 num1 : " + ++num1); // num1 = 11 출력
        System.out.println("2회 증가 후 num1 : " + ++num1); // num1 = 12 출력
        System.out.println("3회 증가 후 num1 : " + ++num1); // num1 = 13 출력
        System.out.println("최종 num1 : " + num1); // 13출력

        System.out.println("===============");

        //후위연산
        int num2 = 10;
        System.out.println("최초 num2 : "+ num2);
        System.out.println("1회 증가 후 num2 : " + num2++); // 10출력 후 => num2 = 11 증가
        System.out.println("2회 증가 후 num2 : " + num2++); // 11출력 후 => num2 = 12 증가
        System.out.println("3회 증가 후 num2 : " + num2++); // 12출력 후 => num2 = 13 증가
        System.out.println("최종 num2 : " + num2); // 13 출력
    }
}
