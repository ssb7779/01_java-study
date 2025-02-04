package com.sotogito.seciont02.variable;

public class Application2 {
    /**
     * ## 변수 선언 및 값 초기화
     * 1. 변수 선언
     * 메모리 상에 특정 값을 기록하기 위한 공간을 만듦
     * 자료형 + 변수명
     * <p>
     * 2. 변수에 값 대입
     * 선언한 변수에 값 담음
     * 변수 = 값;
     * 3. 선언과 초기화 동시에
     * <p>
     * 자료형 : 변수의 크기 및 TYPE을 정하는 부분
     * <p>
     * ## 기본 자료형 primitive
     * - 8개
     * - 논리형 - boolean(1byte)
     * - 정수형 - byte, short, int, long(1,2,3,8byte순)
     * - 실수형 - float, double(4,8byte)
     * - 문자형 - char(2byte)
     * <p>
     * ## 참조 자료형 reference
     * - 무한
     * - 문자열 : String
     * - 그 외 자료형
     */
    public static void main(String[] args) {
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;
        System.out.println("1" + bool1);
        System.out.println("2" + bool2);


        //정수형
        Byte b = 100; //-128 ~ 127
        short s = 32000; //-32@@@ ~ 32@@@
        int i = 2100000000; //-21억~21억
        long l = 1000000000000L; //큼
        System.out.println("b" + b);
        System.out.println("s" + s);
        System.out.println("i" + i);
        System.out.println("l" + l);

        //실수형
        float f = 4.123456789123456789f; //소수점아래 6자리
        double d = 8.123456789123456789d; //소수점 아래 15자리, 좀 더 포괄
        System.out.println("f" + f); //f4.123457
        System.out.println("d" + d); //d8.123456789123457

        //문자형
        char c1 = 'a';
        char c2 = '휗';
        System.out.println("c1" + c1);
        System.out.println("c2" + c2);

        //문자열
        String str1 = "abc";
        System.out.println("str1" + str1);

        //번외
        int etc = 999_999_999;

    }
}
