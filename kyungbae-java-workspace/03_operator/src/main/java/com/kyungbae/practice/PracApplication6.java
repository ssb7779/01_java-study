package com.kyungbae.practice;

public class PracApplication6 { // class start
    /*
    임의의 국어점수, 수학점수, 영어점수를 선언 및 초기화 하고
    세 과목에 대한 총점, 평균을 구하시오.
    각 과목 점수와 평균을 가지고 합격 여부를 판별하여 출력하시오.
    세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
    아니라면 불합격을 출력하시오.
        ex) 국어 60점 영어 80점 수학 40일 경우
            합계 : 180
            평균 : 60.0
            합격
     */

    public static void main(String[] args) { // main start

        int korScore = 40;
        int engScore = 40;
        int mathScore = 100;

        boolean min = korScore >= 40 || engScore >= 40 || mathScore >= 40;  // 최소 점수컷
        int sum = korScore + engScore + mathScore;  // 합계
        double avg = sum / 3;   // 평균
        boolean avgMin = avg >= 60.0;   // 최소 평균컷
        String result = min && avgMin ? "합격" : "불합격";

        System.out.printf("합계 : %d\n평균 : %.1f\n%s", sum, avg, result);




    } // main end


} // class end
