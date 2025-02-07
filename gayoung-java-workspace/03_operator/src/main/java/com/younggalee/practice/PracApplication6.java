package com.younggalee.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int koreanScore = 40;
        int englishScore = 40;
        int mathScore = 42;

        int sum = koreanScore + englishScore + mathScore;
        double avg = sum / 3.0; // ********** p) int avg = sum / 3;
        //소수점 표현에 있어 데이터 손실발생 않도록 3.0으로 나누자

        String result = (koreanScore >= 40 && englishScore >=40 && mathScore >=40 && avg >= 60) ? "합격" : "불합격";

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println(result);

    }
}
