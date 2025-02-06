package com.younggalee.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int koreanScore = 40;
        int englishScore = 40;
        int mathScore = 40;

        int sum = koreanScore + englishScore + mathScore;
        int avg = sum / 3;

        String result = (koreanScore >= 40 && englishScore >=40 && mathScore >=40)&&(avg >= 60) ? "합격" : "불합격";
        System.out.println(result);

    }
}
