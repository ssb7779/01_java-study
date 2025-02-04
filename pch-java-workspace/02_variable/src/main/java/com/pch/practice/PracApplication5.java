package com.pch.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        /*
         * 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하시오.
         */

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        System.out.printf("총점 : %.0f\n",(korean+math+english));
        System.out.printf("평균 : %.0f" , (korean + math + english)/3);
    }
}
