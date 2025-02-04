package com.inyong.section04.casting;

public class Application2 {
    public static void main(String[] args) {
        /*
        강제형 변환
        큰 범위의 자료형을 작은 범위의 자료형으로 변경하고자 할 때 직접 진행
         */

        // double 8 -> float 4

        double d1 = 4.0;
        float f1 = (float) d1;

        // double 8 => int 4
        int iNum = 10;
        double dNum = 5.89;

        //1.
        int iSum = (int)(iNum + dNum);
        System.out.println("iSum : " + iSum);

        //2.
        int iSum2 = iNum + (int)dNum;
        System.out.println("iSum2 : " + iSum2);
        // 실수값을 정수형으로 강제형변환시 => 소수점 아래 부분은 버림 (데이터 손실 발생)

        // 3.
        // 연산결과를 double 변수에 대입
        double dSum = iNum + dNum;
        System.out.println("dSum : " + dSum);
    }
}
