package com.younggalee.section02.variable;

public class Application2 {

    public static void main(String[] args){
        /*
            ## 변수 선언 및 초기화 ##
            1. 변수 선언
               메모리상에 특정 값을 기록하기 위한 공간을 만드는 과정
            2. 변수에 값 대입
               선언해둔 변수에 값을 담는 과정 (=)
            3. 변수 선언과 동시에 초기화(값 대입)
               ## 기본 자료형 (primitive type) ##
               1. 논리형: boolean (1byte)
               2. 정수형: byte(1), short(2), int(4), long(8)
               3. 실수형: float(4), double(8)
               4. 문자형: char(2)

               (1byte = 8bits = 2^8 = 256)
               실질적 의미: ASCII 문자 하나를 나타낼 수 있다

               ## 참조 자료형 (reference type) ##
               1. 문자열: String
               2. 그 밖에 기본 자료형을 제외한 모든 type
         */
        boolean bool1 = true;
        boolean bool2 = false;
        byte b = 100;
        short s = 32000;
        int i = 21000000;
        long l = 1000000000000000L;

        System.out.println("bool1의 값 : " + bool1);
        System.out.println("bool2의 값 : " + bool2);
        System.out.println("b의 값 : " + b);
        System.out.println("s의 값 : " + s);
        System.out.println("i의 값 : " + i);
        System.out.println("l의 값 : " + l);

        float f = 4.123456789f; // 실제 출력값(6) : 4.123457
        double d = 8.123456789123456789123456789; // (15)
        //더 큰 값 보관 X, 정확한 값 표현 O

        System.out.println("f의 값 : " + f);
        System.out.println("d의 값 : " + d);

        char c1 = 'A';
        char c2 = '헿';

        System.out.println("c1의 값: " + c1);
        System.out.println("c2의 값: " + c2);

        // 참조 자료형
        String str = "ABC";
        System.out.println("str의 값: " + str);

        // Tip
        int etc = 9_999_999; //가독성 위해서 _ 사용가능
        System.out.println(etc);
    }
}
