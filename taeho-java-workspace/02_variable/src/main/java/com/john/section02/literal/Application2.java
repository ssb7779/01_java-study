package com.john.section02.literal;

/*
    ## 변수 선언 및 값 초기화
    1. 변수 선언 ( [type] [name];)
    2. 값 대입( [name] = val;)
    3. 선언과 동시에 초기화 ( [type] [name] = val;)
    => 자료형: 어떤 종류의 값을 저장할건지, 어떤 크기의 값을 저장할건지에 대해 정하는 부분

    기본 자료형(primitive type) : 8개
    1. 논리형 : boolean(1byte)
    2. 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
    3. 실수형 : float(4byte), double(8byte)
    4. 문자형 : char(2byte)
    
    참조 자료형(reference type) : 무한
    1. 문자열 : String
*/
public class Application2 {
    public static void main(String[] args) {
        // 1. 논리형
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);

        // 2. 정수형
        byte b = 100;
        short s = 32000;
        int i = 210000000;
        long l = 1000000000L;

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);

        // 3. 실수형
        float f = 4.123456789123456789f;
        double d = 8.123456789123456789;

        System.out.println("f = " + f);
        System.out.println("d = " + d);
        
        // 4. 문자형
        char c1 = 'A';
        char c2 = '오';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // 5. 문자얄
        String str = "ABC";
        System.out.println("str = " + str);

        // 가동성 향상을 _ 사용
        int etc = 100_100_100_1;

    }
}
