package com.jun.practice;

public class PracApplication5 {
    public static void main(String[] args) {

        double korScore = 80.5; // 국어점수
        double mathScore = 50.6; // 수학점수
        double engScore = 70.8; // 영어점수
        System.out.println("총점 : " + (int)(korScore + mathScore + engScore));
        System.out.println("평균 : " + ((int)(korScore + mathScore + engScore)) / 3);


        int sumScore = (int)(korScore + mathScore + engScore);
        System.out.println("총점 : " + sumScore);
        System.out.println("평균 : " + sumScore / 3);
    }
}
