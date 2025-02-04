package com.jmk.section04.casting;

public class Application1 {
    /*
        ## 컴퓨터에서의 값 처리 규칙 ##
        1. 같은 자료형의 값만 대입가능
            즉, 대입연산자를 기준으로 왼쪽과 오른쪽은 동일한 type이여야 한다.
            [표현법]끼리만 연산 가능 (연산 결과도 같은 type으로 나옴)
            
        2. 같은 type끼리만 연산가능(연산 결과도 같은 type으로 나옴)
            [표현법] 값 + (자료형) 값
            
        ## 형 변환 ##
        값의 자료형을 바꾸는 것
        1. 자동형변환(묵시적 변환) : 자동으로 자료형이 변경됨.
        2. 강제형변환(명시적 변환) : 형 변환 연산자를 통해서 자료형을 직접 변경해야함
     */
    public static void main(String[] args) {
        /*
            byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte) -> float(4byte) -> double(8byte)
            
            ## 자동 형 변환 ##
            자료형이 다른 두값 간의 연산(대입 또는 계산 등) 시
            자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환되서 처리됨
         */
        // 1. int(4byte) -> double(8byte)
        int i1 = 12;
        double d1 = /* (double) */i1;
        System.out.println("d1의 값:" + d1);

        int i2 = 12;
        double d2 = 3.3;
        System.out.println(i2 + d2);

        //2. int(4byte) => long(8byte)
        int i3 = 1000;
        long l3 = /*(long) */i3;
        System.out.println("l3의 값:" + l3);

        //3. float(4byte) => double(8byte)
        float f4 = 12.0f;

        //4. long(8byte) => float(4byte)
        long l5 = 1000;
        float f5 = /* (float) */l5;

        //5. char(2byte) <=> int(4byte)
        int num = /* (int) */ 'A';
        System.out.println("num의 값:" + num);

        char ch = /* (char) */ 65;
        System.out.println("ch 값:" + ch);

        ch = 52321;
        System.out.println("수정된 ch 값:" + ch);

        //6. byte 또는 short 간의 연산
        byte b1 = 1;
        byte b2 = 10;
//        byte b3 = b1 + b2; //에러발생 => byte나 short 간 연산시 무조건 int형으로 처리

        byte b3 = (byte) (b1 + b2); //강제형변환하면 가능
        System.out.println("b3의 값:" + b3);

        short s1 = 1;
        short s2 = 10;
        short s3 = (short) (s1 + s2); //강제형변환하면 가능
        System.out.println("s3의 값:" + s3);


    }
}
