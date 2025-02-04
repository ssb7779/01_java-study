package com.seungjoo.section02.variable;

import java.sql.SQLOutput;

public class Application2 {
    /*
    변수 선언 및 값 초기화
    1. 변수 선언
        메모리상에 특정 값을 기록하기 위한 공간을 만드는 과정
        [표현법] 자료형 변수명
    2. 변수에 값 대입
        선언해둔 변수에 값을 담는 과정
        [표현법] 변수명  = 값;
    3. 변수 선언과 동시에 초기화(대입)
        [표현법] 자료형 변수명 = 값;

        --> 자료형 : 어떤 종류의 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 대해
                      변수의 크기 및 모양을 정하는 부분

        ## 기본 자료형(primitive type): 8개
        1. 논리형 : boolean(1)
        2. 정수형 : byte(1바이트), short(2), int(4), long(8)
        3. 실수형 : float(4), double(8)
        4. 문자형 : char(2)



        # 참조 자료형(reference type) : 무한, 개수정해져있지 x, 기본 자료형을 제외한 나머지를 다 참조 자료형

        1. 문자열 : String


     */
    public static void main(String[] args) {


        //1. 논리형
        boolean bool1;
        bool1 = true;
        boolean bool2 = false; //변수 선언과 동시에 초기화
        System.out.println("bool2 = " + bool2);
        System.out.println("bool1 = " + bool1);

        //2. 정수형
        byte b = 100; //-128 ~127
        short s = 32000; //-32xxx ~ 32xxx
        int i = 210000000;
        long l = 1000000000L; // 8바이트 엄청큼, 라지L을 사용하는 것을 권장

        System.out.println("l = " + l);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);


        //3.실수형
        float f = 4.123456789123456789f;
        double d = 8.123456789123456789d; //더 큰값을 보관할 수 있는게 아니라 더 정확 값을 표현할 수 있음.
        System.out.println("d = " + d); //소수점 아래 6자리
        System.out.println("f = " + f);// 소수점 아래 15자리, 실수형의 대표는 double형임

        //4.문자형
        char c1 = 'A';
        char c2 = '힣';

        //5.문자열 (참조 자료형)
        String str = "abc";
        System.out.println("str의 값 = " + str);

        //번외
        int etc = 999_999_999;
        System.out.println("etc = " + etc);
    }
}
