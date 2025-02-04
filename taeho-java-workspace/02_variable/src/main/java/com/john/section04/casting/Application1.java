package com.john.section04.casting;

/*
    ## 컴퓨터의 값 처리
    1. 같은 자료형의 값만 대입가능
       - 대입연산자를 기준으로 왼쪽과 오른쪽이 같은 타입이여야 함
       - 다른 경우, 대입연산자의 앞에 (type)을 사용하여 맞출 수 있음
    
    2. 같은 type 끼리만 연산 가능
    
    ## 형변환
    1. 자동형변환(묵시적 형변환) - 자동으로 타입이 변경됨.
        - byte -> short -> int -> long -> float -> double
        - 작은 자료형이 큰 자료형으로 자동 변환
    2. 강제형변환(명시적 형변환) - 형변환 연산자를 통해 직접 변경 (int)
*/

public class Application1 {
    public static void main(String[] args) {
        float x = 1;
        long y = 2;
        System.out.println(x + y);

        int i1 = 12;
//        short b1 = i1;
        short i2 = (short) 12;
        System.out.println("i2 = " + i2);
        double i3 = i2;
        System.out.println("i3 = " + i3);

        int a1 = 12;
        double b1 = 3.3;
        System.out.println("a1 + b1 = " + (a1 + b1));

        float c1 = 1.0f;
        double d1 = c1;

        int num = 'A';
        System.out.println("num = " + num);

        char ch = 65;
        System.out.println("ch = " + ch);

        ch = 34534;
        System.out.println("ch = " + ch);

        byte x1 = 1;
        byte x2 = 10;
//        byte x3 = x1 + x2;
        byte x3 = (byte)(x1 + x2);
        System.out.println("x3 = " + x3);
    }

}
