package com.seungjoo.section03.in_decrement;

public class Application1 {
    public static void main(String[] args) {

        /*
        ##증감 연산자
        1. 단항 연산자
        2. 종류
            1)++: 변수에 담긴 값을 1증가시켜주는 연산자

            2)-- : 변수에 담긴 값을 1 감소시켜주는 연산자
       3. 작성위치
        1)전위 연산: (증감연산자) 변수 -> "선증감" 후처리
        2)후위 연산: 변수(증감연산자) -> 선처리 "후증감"

         */

        int num1 = 10;
        System.out.println("최초 num1" + num1);
        System.out.println("1 증가 후 num1 " +  ++num1); //11출력
        System.out.println("2회 증가 후 num1" + ++num1); //12출력
        System.out.println("3회 증가 후 num1" + ++num1); //13출력
        System.out.println("최종 num1" + num1); //13출력

        //후위 연산
        int num2 = 10;
        System.out.println("최초 num2" + num2);
        System.out.println("1회 증가 후 num2:" + num2++);
        System.out.println("2회 증가 후 num2:" + num2++);
        System.out.println("3회 증가 후 num2:" + num2++);
        System.out.println("최종 num2: " + num2);


    }
}
