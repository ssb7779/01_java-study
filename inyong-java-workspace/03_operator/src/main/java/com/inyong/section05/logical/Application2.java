package com.inyong.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        int num = 30;

        boolean result = (1 <= num) && (num <= 100);
        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);
    }
}
