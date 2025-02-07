package com.jmk.section02.variable;

public class Application2 {
    /*
        ##변수 선언 및 값 초기화##
        1. 변수 선언
            메모리상에 특정 값을 기록하기 위한 공간을 만드는 과정
            [표현법] 자료형 변수명;

        2. 변수에 값 대입
            선언해둔 변수에 값을 담는 과정
            [표현법] 변수명 = 값;
        3. 변수 선언과 동시에 초기화(값 대입)
            [표현법] 자료형 변수명 = 값;

            >> 자료향 : 어떤 종류의 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 대해
                        변수의 크기 및 모양을 정하는 부분

            ## 기본자료형 (primitive type) 8개 ##
            1. 논리형:  boolean(1byte)
            2. 정수형:  byte(1byte) ,int(4byte), short(2byte), long(8byte)
            3. 실수형:  float(4byte), double(8byte)
            4. 문자형:  char(2byte)

            ## 참조 자료형 (reference type) 무한개 ##
            1. 문자열 : String(4byte)
            2. 그 밖에 기본 자료형을 제외한 모든 type
     */

    public static void main(String[] args) {
        //1. 논리형
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        //2. 정수형
        byte b = 100;               //1byte: -128 ~ 127
        short s = 32000;            //2byte: -32xxx~ 32xxx
        int i = 2100000000;         //4byte: -21억xxx ~ 21억xxx
        long l = 1000000000000L;    //8byte: 엄청큼
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        //3. 실수형
        float f = 4.12345678913231f; //4byte
        double d = 8.12344531314148; //8byte (더 큰 값을 보관할 수  있는게 아니라 더 정확한 값을 표현할 수 있음)

        System.out.println("f의 값: " + f);
        System.out.println("d의 값: " + d);

        //4. 문자형
        char c1 = 'A'; //2byte: 0 ~ 64XXX
        char c2 = '횡';

        System.out.println("c1의 값:" + c1);
        System.out.println("c2의 값:" + c2);

        //5. 문자열 (참조자료형)
        String str = "ABC";
        System.out.println("Str의 값:" + str);

        //번외
        int etc = 999_999_999; //가독성을 위해 _ 사용가능 (실제로는 숫자만 저장)
        System.out.println(etc);




    }

}
