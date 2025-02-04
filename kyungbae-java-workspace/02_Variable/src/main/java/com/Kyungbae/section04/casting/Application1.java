package com.Kyungbae.section04.casting;

public class Application1 { // class start

    /*
        # 컴퓨터에서의 값 처리 규칙
        1. 같은 자료형의 값만 대입가능
            대입연산자를 기준으로 양쪽이 동일한 type 이여야 됨
            [표현법] 자료형 변수명 = (자료형)값;

        2. 같은 type 끼리만 연간 가능 (연산 결과도 같은 type)
            [표현법] 값 + (자료형)값

        # 형변환
        값의 자료형을 바꾸는 것
        1. 자동 형변환 (묵시적 형변환)
            - 자동으로 자료형이 변경됨
        2. 강제 형변환 (명시적 형변환)
            - 형변환 연산자를 통해서 자료형 직접 변경

     */

    public static void main(String[] args) { // static main start

        /*
            값의 범위
            byte < short < int < long < float < double

            # 자동 형변환
            자료형이 다른 두 값의 연산 시
            자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환됨

         */

        // 자동 형변환
        // case1. int => double

        int i1 = 10;
        double d1 = i1;
        // double d1 = (double)i1;

        System.out.println("d1의 값 : " + d1);

        int i2 = 12;
        double d2 = 3.3;

        System.out.println(i2 + d2);
        // System.out.println((double)i2 + d2);

        // case2. int => long

        int i3 = 1000;
        long l3 = /*(long)*/i3;
        System.out.println("L3의 값 : " + l3);

        // case3. float => double

        float f4 = 1.0f;
        double d4 = /*(double)*/f4;

        // case4. long => float

        long l5 = 1000L;
        float f5 = l5;
        System.out.println("f5의 값 " + f5);

        // cast5. char <=> int
        int num = 'A';
        char ch = 65;
        System.out.println("ch의 값 " + ch);

        ch = 64005;
        System.out.println("수정된 ch의 값 " + ch);

        // case6. byte 또는 short 간의 연산

        byte b1 = 1;
        byte b2 = 10;
//        byte b3 = b1 + b2;
        // => byte나 short 간 연산시 무조건 int형으로 처리함
        byte b3 = (byte)(b1 + b2); // 강제형변환으로 해결 가능
        System.out.println("b3의 값 " + b3);


    } // static main end

} // class end
