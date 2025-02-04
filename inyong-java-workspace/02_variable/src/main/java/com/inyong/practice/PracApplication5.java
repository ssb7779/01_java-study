package com.inyong.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        double 국어 = 80.5;
        double 수학 = 50.6;
        double 영어 = 70.8;

        int 총점 = (int) (국어 + 수학 + 영어) ;
        int 평균 =  총점 / 3;
        System.out.println("총점 : " + 총점);
        System.out.println("평균 : " + 평균);

    }
}
