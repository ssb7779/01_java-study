package com.john.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        int num;

        num = 50;
//        boolean result = (1 <= num) && (num <= 100);
        // 비교 대상을 좌측에 두는 걸 권장
        boolean result = (num >= 1) && (num <= 100);

        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);

    }
}
