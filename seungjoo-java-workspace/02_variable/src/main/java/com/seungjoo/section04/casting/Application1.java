package com.seungjoo.section04.casting;

public class Application1 {
    public static void main(String[] args) {

        /*
        ##컴퓨터에서의 값 처리 규칙
        1. 같은 자료형의 값만 대입가능
            즉, 대입연산자를 기준으로 왼쪽과 오른쪽은 동일한 type이어야함
            [표현법] 자료형 변수명 = (자료형) 값;

        2. 같은 타입끼리만 연산 가능 (연산 결과도 같은 타입으로 나옴)
            [표현법] 값 + (자료형)값


        ## 형변환
        값의 자료형을 바꾸는 것

        1.자동형변환(묵시적 형변환) : 자동으로 자료형이 변경됨
        2.강제형변환(명시적 형변환) : 형변환 연산자를 통해서 자료형을 직접 변경해야됨

         byte->short->int->long->float->double
         ## 자동 형변환
         자료형이 다른 두 값 간의 연산(대입 또는 계산등) 시 자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환되서 처리됨
*/
         //1. int(4byte) -> double(8바이트)
         int i1 = 12;
         double d2 = 3.3;

        System.out.println(i1+d2); //i1에서 알게모르게 (double) 형변환이 일어남.

        //2. int(4byte) -> long(8byte)
        int i3 = 1000;
        long l3 = i3;
        System.out.println("l3 = " + l3);

        //3. float(4바이트) -> double(8바이트)
        float f4 = 1.0f; //실수는 기본적으로 double로 인지하기 때문에 강제 형변환처럼 4바이트에 담음
        double d4 = f4;

        //4.long(8바이트) => float(4바이트)
        long l5 = 1000;
        float f5 = l5;
        
        //5.char(2바이트) <=> int(4바이트), 양방향으로 형변환됨
        int num = 'A';
        System.out.println("num = " + num);
        
        char ch = 65;
        System.out.println("ch = " + ch);

        ch = 53021;
        System.out.println("수정된 ch의 값 = " + ch);

        //byte 또는 short 간의 연산
        byte b1 = 1;
        byte b2 = 10;
        //byte b3 = b1 + b2; //에러발생 -> byte나 short 간 연산시 무조건 int형으로 처리
        byte b3 = (byte)(b1+b2); //"강제형변환" 하면 가능!
        System.out.println("b3 = " + b3);
    }
}
