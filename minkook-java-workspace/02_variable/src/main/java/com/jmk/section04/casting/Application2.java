package com.jmk.section04.casting;

public class Application2 {
    public static void main(String[] args) {
        /*
            ## 강제형 변환 ##
            큰 범위의 자료형을 작은 범위의 자료형으로 변경하고자 할 때 직접 실행
         */

        // double(8byte) => float(4byte)

        double d1 = 4.0;
        float f1 = (float) d1;

        // double(8byte) => int(4byte)
        int iNum = 10;
        double dNum = 5.89;

        //int isum =  iNum + dNum; 10.0 + 5.89(double)
        //해결방법1. 연산 결과 int형으로 강제변환
        int iSum1 = (int)(iNum + dNum); //(int)15.89 -> 15 소수점이하 데이터 손실
        System.out.println("iSum1:" + iSum1);

        //해결방법2. double형값을 int형으로 강제변환
        int iSum2 = iNum + (int)dNum;   //(int)5.89-> 5 소수점이하 데이터 손실
        System.out.println("iSum2:" + iSum2);

        //해결방법3. 연산결과를 double변수에 대입
        double dSum = iNum + dNum;
        System.out.println("dSum:" + dSum);


    }
}
