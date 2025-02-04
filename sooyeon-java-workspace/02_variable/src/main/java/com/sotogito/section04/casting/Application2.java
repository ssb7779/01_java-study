package com.sotogito.section04.casting;

public class Application2 {
    public static void main(String[] args) {
        /**
         * 강제형변환
         */

        // double -> float
        double d1 = 4.0;
        float f1 = (float) d1;

        //double -> int
        int iNum = 10;
        double dNum = 5.89;

        //실수 정수로 강제변환 후 연산 = 손실 가능
        int sumResult = (int) (f1 + dNum);
        int sumResult2 = iNum + (int) dNum;

    }
}
