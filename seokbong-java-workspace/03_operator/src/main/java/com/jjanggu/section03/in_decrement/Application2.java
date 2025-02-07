package com.jjanggu.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // a=11, b=11

        System.out.printf("a : %d, b : %d\n", a, b); // a : 11, b : 11

        int c = 10;
        int d = c++; // d=10 , c=11

        System.out.printf("c : %d, d : %d\n", c, d); // c : 11, d : 10

        System.out.println("=====================");

        int num1 = 20;
        int result1 = ++num1 * 3; //num1 = 21, result1 = 63

        System.out.println("result1 : " + result1);

        int num2 = 20;
        int result2 = num2++ * 3; // result2 = 60, num2 = 21
        //후위연산의 경우 모든 연산을 진행 후 마지막에 증가

        System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
    }
}
