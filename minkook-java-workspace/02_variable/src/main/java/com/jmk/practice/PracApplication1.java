package com.jmk.practice;

public class PracApplication1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("더하기 결과:" + add);
        System.out.println("빼기 결과:" + sub);
        System.out.println("곱하기 결과:" + mul);
        System.out.println("나누기 결과:" + div);
        System.out.println("나머지 결과:" + mod);
    }
}
