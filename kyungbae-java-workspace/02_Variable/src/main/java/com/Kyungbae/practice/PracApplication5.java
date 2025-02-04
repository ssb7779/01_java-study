package com.Kyungbae.practice;

public class PracApplication5 { // class start

    public static void main(String[] args) { // static main start

        double koreanScore;    // 국어점수
        koreanScore = 80.5;

        double mathScore;      // 수학점수
        mathScore = 50.6;

        double englishScore;   // 영어점수
        englishScore = 70.8;

        int sum = (int) (englishScore + koreanScore + mathScore);   // 총점

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (sum / 3));

//        System.out.println("총점 : " + (int) (koreanScore + mathScore + englishScore));
//        System.out.println("평균 : " + (int) (koreanScore + mathScore + englishScore) / 3);

    } // static main end

} // class end
