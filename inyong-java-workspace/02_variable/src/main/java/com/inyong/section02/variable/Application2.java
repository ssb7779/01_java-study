package com.inyong.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("bool1의 값 " + b1);
        System.out.println("bool2의 값 " + b2);
        /*
        변수 선언 및 값 초기화

        변수 선언
        메모리상에 특정 값을 기록하기 위한 공간을 만드는 과정

        변수형
        자료형 : 어떤 종류의 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 대해 변수의 크기 및 모양을 정하는 부분

        기본 자료형

        참조 자료형

        # 기본 자료형 (primitive type)
        1 논리형 : boolean (1byte)
        2 정수형 : byte, short, int, long
        3 실수형 : float, double
        4 문자형 : char

        # 참조 자료형 (reference type) : 무한개
        1. 문자열
        2. 그 밖에 기본 자료형을 제외한 모든 type
         */

        byte b = 100; // 1byte -128 ~ 127
        short s = 32000; // 2byte -32xxx ~ 32xxx
        int i = 2100000000; // 4byte -21억 ~ 21억 //! 대표
        long l = 1000000000000L; // 8byte

        System.out.println("b " + b);
        System.out.println("s " + s);
        System.out.println("i " + i);
        System.out.println("l " + l);

        float f = 3.14122312321123f; //4byte
        double d = 3.141223123123211233; //8byte //! 대표 (더 정확한 값을 담을 수 있기 때문)
        System.out.println("f의 값 " + f); //소수점 아래 6자리
        System.out.println("d의 값 " + d); // 소수점아래 15자리

        char c = 'A';
        char c2 = '횧';

        System.out.println('c' + c);
        System.out.println("c2의값" + c2);

        String str = "abc";
        System.out.println('s' + str);

        int etc = 999_999;
        System.out.println("etc" + etc);
    }
}
