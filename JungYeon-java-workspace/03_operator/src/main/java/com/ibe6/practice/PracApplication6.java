package com.ibe6.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        //세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하시오.
        int korScore = 60;
        int engScore = 80;
        int mathScore = 40;

        int sumScore

        String result = ( &&  == 'Y') ? "합격" : "불합격";
        System.out.println(result);

        int sumScore = (int)(korScore + mathScore + engScore);
        System.out.println("합계 : " + sumScore);
        System.out.println("평균 : " + sumScore / 3);
    }
}
