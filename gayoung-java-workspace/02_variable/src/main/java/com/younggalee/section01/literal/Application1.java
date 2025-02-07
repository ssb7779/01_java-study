package com.younggalee.section01.literal;

public class Application1 {

    public static void main(String[] args){
        System.out.println(123 + 456);
        //가독성을 위해 연산자와 피연산자 간에 공백을 추가해주는 것이 좋다.
        System.out.println(1.23 - 0.12);  // 예측값:1.11, 실제값:1.1099999999999999 >>부동 소수점 오차
        //컴퓨터에서의 실수값 연산은 불완전해서 오차가 생길 수 있다.
        System.out.println('a' + 1);
        //아스키코드를 다 외우고 있을 수는 없겠지만 이정도는 기억하자. A:65, a: 97, '1': 49
        System.out.println("a" + 1);
        //문자열과 그외의 값을 연산하면 하나의 문자열로 이어지는 특징이 있다. (only + )
        System.out.println("안녕" + (1 + 2) + '!');
    }
}
