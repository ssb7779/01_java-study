package com.podoseee.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        // 특정 정수값이 1부터 100사이의 값인지 판별
        int num = 200;

        //boolean result = 1 <=  num <= 100;
        // boolean result = (1 <= num) && (num <= 100);
        boolean result = (num >= 1) && (num <= 100); // num이 1이상이고 num이 100이하인지 //비교대상을 왼쪽에

        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);
    }
}
