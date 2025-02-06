package com.younggalee.section06.ternary;

public class Application2 {
    public static void main(String[] args) {
        int num = 4;

        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }
}
