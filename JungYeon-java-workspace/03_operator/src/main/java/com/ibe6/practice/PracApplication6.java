package com.ibe6.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        //세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하시오.
        int korScore = 60;
        int engScore = 80;
        int mathScore = 40;

        int sumScore = korScore + mathScore + engScore;
        int avgScore = sumScore / 3;

        String result = ( korScore >= 40 && engScore >= 40 && mathScore >= 40 && avgScore >= 60 ) ? "합격" : "불합격";

        System.out.println("합계 : " + sumScore);
        System.out.println("평균 : " + avgScore);
        System.out.println("결과 : " + result);
    }
}
