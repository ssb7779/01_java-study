package com.seungjoo.practice;

public class PracApplication1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        System.out.printf("더하기 결과 : %d\n",num1+num2);
//        System.out.println("더하기 결과 : " + (num1+num2));
        System.out.printf("빼기 결과 : %d\n",num1-num2);
        System.out.printf("곱하기 결과 : %d\n",num1*num2);
        System.out.printf("나누기 결과 : %d\n",num1/num2);  //곱셈,나눗셈, 나머지연산은 println을 할 때 우선순위가 더 높아서 괄호를 안 해도 됨.
        System.out.printf("나머지 결과 : %d\n",num1%num2);
    }
}
