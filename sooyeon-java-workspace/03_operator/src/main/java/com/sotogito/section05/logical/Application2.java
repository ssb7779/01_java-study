package com.sotogito.section05.logical;

public class Application2 {

    public static void main(String[] args) {
        //특정 정수값애ㅣ 1~100사이의 값인지 확인
        int num = 0;

        boolean result = 1 <= num && num <= 100;
        boolean resultux = num >= 1 && num <= 100; // todo 비교 대상을 왼쪽에 쓴다.

        System.out.println("정수값이 1~100 사이의 숫자인가"+resultux);

    }
}
