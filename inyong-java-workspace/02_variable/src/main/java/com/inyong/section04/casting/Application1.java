package com.inyong.section04.casting;

public class Application1 {

    /*
    ## 컴퓨터에서의 값 처리 규칙
    1. 같은 자료형의 값만 대입가능 즉, 대입 연산자를 기준으로 왼쪽 오른쪽 동일한 타입
    자료형 변수명 = (자료형)값;
    2. 같은 type끼리만 연산 가능하다 (연산 결과도 같은 type으로 나옴)

    ## 형 변환 ##
    값의 자료형을 바꾸는것

    1. 자동형변환(묵시적 형변환) : 자동으로 변경
    2. 강제형변환(명시적 형변환) : 형 변환 연산자를 통해서 자료형 직접 변경

     */
    public static void main(String[] args) {
       /* byte(1) short (2) int (4) long(8) -> float(4) -> double(8)

       자료형이 다른 두 값 간의 연산 (대입 또는 계산) 자동으로 작은 자료형이 큰 자료형으로 변환 되어 처리


        */

         // 4int -> 8double byte
       int i1 = 12;
       double d1 = i1;
        System.out.println(d1);

        int i2 = 12;
        double d2 =  3.3;
        System.out.println(i2 + d2);

       // int4 => long8
        int i3 = 1000;
        long l3 = /*(long)*/i3;
        System.out.println(l3);

        // float 4 -> double 8
        float f4 = 1.0f;
        double d4 = /*(double)*/f4;
        System.out.println(d4);

        // long8 => float4
        long l5 =1000;
        float f5 = /*float*/l5;
        System.out.println(f5);

        // char(2byte) <=> int(4byte) 아스키 코드
        int num = 'A';
        System.out.println(num);

        char ch = 65;
        System.out.println(ch);

        ch = 53021;
        System.out.println(ch);


        // byte , short 간의 연산은 int 처리
        
        byte b1 = 1;
        byte b2 = 10;
        int b3 = b1 + b2;
        byte b4 = (byte)(b1 + b2); // 강제형변환
        
    }
}
