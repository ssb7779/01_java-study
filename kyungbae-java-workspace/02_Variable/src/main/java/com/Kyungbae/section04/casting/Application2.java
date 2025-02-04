package com.Kyungbae.section04.casting;

public class Application2 { // class start

    public static void main(String[] args) { // static main start
        /*
            # 강제 형변환
            큰 범위의 자료형을 작은 범위의 자료형으로 변경할 때 사용

         */

        /*

        // case1. double => float
        double d1 = 4.123;
        float f1 = (float)d1;
        System.out.println(d1);

        //case2. double => int
        int iNum = 10;
        double dNum =5.89;

        // 해결방법1. 연산 결과를 int 형으로 변환
        int iSum1 = (int) (iNum + dNum); // (int)15.88 => 15
        System.out.println("iSum1의 값 " + iSum1);

        // 해결방법2. double형 실수값를 int형으로 강제 변환
        int iSum2 = iNum + (int)dNum; // 10 + (int)5.88 => 10 + 5 => 15
        System.out.println("iSum2의 값 " + iSum2);

        //실수값을 정수형으로 강제형변환시 소수점 아래부분 버림 (*데이터 손실 발생 가능)

        // 해결방법3. 연산 결과를 double 변수에 대입
        double dSum = iNum + dNum;
        System.out.println("dSum의 값 " + dSum);


         */

        int i1 = 1000;
        long l1 = i1;
        int i2 = (int)l1;
        double d1 = i2;
        float f1 = (float)d1;
        System.out.println(f1);


    } // static main end

} // class end
