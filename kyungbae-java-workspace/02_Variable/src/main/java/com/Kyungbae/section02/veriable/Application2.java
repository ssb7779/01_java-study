package com.Kyungbae.section02.veriable;

public class Application2 { // class start

    public static void main(String[] args) { // static main start

        /*
            ## Primitive type ##
            8가지
            1. 논리형 : boolean (1byte) => true, false
            2. 정수형 : byte    (1byte) => -127 ~ 128
                        short   (2byte) => -+ 3만정도
                        int     (4byte) => -+ 20억정도
                        long    (8byte) => 큰 수
            3. 실수형 : float   (4byte)
                        double  (8byte) => 더 정확한 소수점 표현
            4. 문자형 : char    (2byte)

            ## reference type ##
            primitive 를 제외한 모든
            1. 문자열 : String
            2. 그 외
         */

        // 논리형
        boolean sample1;    // 변수 선언
        sample1 = true;     // 값 대입

        boolean sample2 = false;    // 변수 선언과 동시에 초기화

        System.out.println("sample1 : " + sample1);
        System.out.println("sample2 : " + sample2);

        // 정수형
        byte stock = 99;
        short reviews = 32767;
        int price = 2147483647;
        long distance = 214748364702940L; // *숫자 끝에 "L" 문자 사용

        System.out.println("stock : " + stock);
        System.out.println("reviews : " + reviews);
        System.out.println("price : " + price + 'W');
        System.out.println("distance : " + distance + 'M');

        // 실수형
        float f = 3.141592546472935732f;
        double d = 12.141592546472935732; // 더 정확한 값을 표현할 수 있다.

        System.out.println("f : " + f);
        System.out.println("d : " + d);

        // 문자형
        char c1 = 'A';
        char c2 = 33;

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);

        // 문자열 (reference type)
        String str1 = "abc";
        System.out.println("str1 : " + str1);


        // 번외
        int etc = 1_000_000; // 가독성을 위해 언더바 사용 가능
        System.out.println("etc : " + etc);
        // 출력결과 = 1000000

    } // static main end

} // class end
