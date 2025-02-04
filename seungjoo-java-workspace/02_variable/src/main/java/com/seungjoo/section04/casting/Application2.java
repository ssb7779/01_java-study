package com.seungjoo.section04.casting;

public class Application2 {
    /*
       ##강제 형변환
       큰 범위의 자료형을 작은 범위의 자료형으로 변경하고자 할 떄 직접 진행
     */
    public static void main(String[] args) {


        //double(8) -> float(4)
        double d1 = 4.0;
        float f1 = (float) d1;

        //double(8) ->int(4)
        int iNum = 10;
        double dNum = 5.8;

        //int iSum = iNum + dNum; //15.89(double)
        //해결방법1. 연산 결과를 int형으로 강제 형변환
        int iSum = (int) (iNum + dNum); //15(데이터 손실 발생)

        //해결 방법2.
        int iSum2 = iNum + (int) dNum;
        System.out.println(iSum2);

        //실수 값을 정수형을 강제형변환시 => 소수점 아래 부분은 버림(데이터 손실 발생 가능)
        
        //해결방법3. 연산 결과를 double 변수에 대입
        double dSum = iNum +  dNum;
        System.out.println("dSum = " + dSum);

    }
}
