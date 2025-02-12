package com.ibe6.practice;

public class PracApplication5 {
    public static void main(String[] args) {
    double korScore = 80.5;
    double mathScore = 50.6;
    double engScore = 70.8;

    /*
    System.out.println("총점 : " + (int)(korScore + mathScore + engScore));
    System.out.println("평균 : " + (int)(korScore + mathScore + engScore) / 3);
     */

     int sumScore = (int)(korScore + mathScore + engScore);
     System.out.println("총점 : " + sumScore);
     System.out.println("평균 : " + sumScore / 3);;



    }
}
