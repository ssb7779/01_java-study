package com.john.section04.casting;

public class Application2 {
    public static void main(String[] args) {
        double d1 = 4.0;
        float f1 = (float) d1;

        int iNum = 10;
        double dNum = 5.89;
        
        // 형변환 방법 1. 연산 결과를 변환
        int iSum1 = (int)(iNum + dNum);
        System.out.println("iSum1 = " + iSum1);
        
        // 형변환 방법 2. double 형 값만 int로 변환
        int iSum2 = iNum + (int) dNum;
        System.out.println("iSum2 = " + iSum2);

        // 형변환 방법 3. 연산 결과를 double형 변수에 대입 
        double dSum = iNum + dNum;
        System.out.println("dSum = " + dSum);

    }
}
