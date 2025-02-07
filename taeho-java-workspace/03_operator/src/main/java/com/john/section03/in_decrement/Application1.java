package com.john.section03.in_decrement;

/*
    ## 증감연산자
    1. 단항연산자
    2. 종류 (++ : 변수에 담긴 값을 증가, -- : 변수에 담긴 값을 감소)
    3. 변수의 앞(전위), 혹은 뒤에 추가됨 (후위)
    3.1. 전위의 경우 선증가 후처리
    3.2. 후위의 경우 선처리 후증가
    
 */
public class Application1 {
    public static void main(String[] args) {

        // 전위
        int num1 = 10;
        System.out.println("전위 연산자 초기 num: " + num1);
        System.out.println("1회 증가: " + ++num1);
        System.out.println("2회 증가: " + ++num1);
        System.out.println("3회 증가: " + ++num1);
        System.out.println("최종 num: " + num1);

        System.out.println();

        // 후위
        int num2 = 10;
        System.out.println("후위 연산자 초기 num: " + num2);
        System.out.println("1회 증가: " + num2++);
        System.out.println("2회 증가: " + num2++);
        System.out.println("3회 증가: " + num2++);
        System.out.println("최종 num: " + num2);
    }
}
