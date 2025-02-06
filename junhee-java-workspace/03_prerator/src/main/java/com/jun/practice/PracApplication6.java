package com.jun.practice;

public class PracApplication6 {
    public static void main(String[] args) {

        int kor = 80;
        int math = 70;
        int eng = 50;

        int sum = kor + math + eng;
        double avg = sum / 3.0;

        System.out.println("합계 :  " + sum);
        System.out.println("합계 :  " + avg);
        System.out.println((kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) ? "합격" : "불합격");

        
    }
}
