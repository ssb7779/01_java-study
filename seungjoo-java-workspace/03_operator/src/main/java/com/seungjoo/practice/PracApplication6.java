package com.seungjoo.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int kor = 40;
        int math = 50;
        int eng = 60;

        int sum = kor + math + eng;
        double avg = sum / 3.0;

        String result = (kor >=40 && math >=40 && eng >=40 &&avg >=60) ? "합격": "불합격";

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println(result);
    }
}
