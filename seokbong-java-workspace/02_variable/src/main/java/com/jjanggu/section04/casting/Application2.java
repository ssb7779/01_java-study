package com.jjanggu.section04.casting;

public class Application2 {
    public static void main(String[] args){

        /*
            ## 강제형변환 ## 큰 범위 자료형 -> 작은 범위 자료형
            큰 범위의 자료형을 작은 범위의 자료형으로 변경하고자 할 때 직접 진행
         */

        // double(8byte) => float(4byte)
        double d1 = 4.0;
        float f1 = (float)d1;

        // double(8byte) => int(4byte)
        int iNum = 10;
        double dNum = 5.89;
        //int iSum = iNum + dNum; //  10.0 + 5.89 => 15.89(double)

        // 해결방법1. 연산 결과를 int형으로 강제형변환
        int iSum1 = (int)(iNum + dNum); // (int)15.89 => 15
        System.out.println("iSum1 : " + iSum1);

        // 해결방법2. double형 값만을 int형으로 강제형변환
        int iSum2 = iNum + (int)dNum; //  10 + 5.89 => 10 + 5
        System.out.println("iSum2 : " + iSum2);

        // 실수값을 정수형으로 강제형변환 => 소수점 아래 부분은 버림 (*데이터 손실 발생 가능)
        // 소수점을 버리지 않고 올림으로 정수변환 하고 싶을 땐 math 연산자 사용 (추후 학습 예정)

        // 해결방법3. 연산 결과를 double형 변수에 대입
        double dSum = iNum + dNum;
        System.out.println("dSum : " + dSum);

    }
}
