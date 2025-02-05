package com.younggalee.section04.casting;

public class Application1 {
    /*
        ## 컴퓨터에서 값 처리 규칙 ##
        1. 같은 자료형의 값만 대입가능
            즉, 대입연산자를 기준으로 왼쪽과 오른쪽은 동일한 타입이어야함.
        2. 같은 타입끼리만 연산 가능

        ## 형변환 ##
        값의 자료형을 바꾸는 것

        1. 자동형변환(묵시적 형변환) : 자동으로 자료형이 변경됨
        2. 강제형변환(명시적 형변환) : 형변환 연산자를 통해서 자료형을 직접 변경해야됨

     */
    public static void main(String[] args) {
        /*
            ## 자동 형변환 ##
            자료형이 다른 두 값 간의 연산시, 자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환되서 처리됨
            byte크기에 따라 다름
         */

        // int to double
        int i = 12;
        double d = i;   // 자동으로 double로 형변환됨
        double b = 3.3;
        System.out.println(i + b);  // 12.0 + 3.3 => 15.3

        //int to long 도 마찬가지
        //float to double 도 마찬가지
        //1.0f 이 f도 강제형변환 같은 것. 실수값은 기본적으로 double로 인식함

        // char <=> int
        int num = 'A';
        char ch = 65;

        ch = 53021;
        System.out.println("수정된 ch의 값 " + ch);

        // byte 또는 short 간의 연산
        byte b1 = 1;
        byte b2 = 10;
        byte b3 = (byte)(b1 + b2); // () 강제형변환
        System.out.println(b3);
        // + 연산을 하는 순간 int가 됨.
        // byte나 short 간의 연산시 무조건 int형으로 처리


    }

}
