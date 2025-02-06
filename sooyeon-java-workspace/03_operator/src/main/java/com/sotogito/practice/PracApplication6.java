package com.sotogito.practice;

public class PracApplication6 {
    /**
     * 국 수 영
     * 총점, 평균
     * 합격여부 판단
     * 모든 과목 >= 40점
     * 평균 >= 60점
     */

    public static void main(String[] args) {
        int korean = 60;
        int english = 80;
        int math = 40;

        // int total = korean + english + math;
        int average = (korean + english + math) / 3;

        String result = (korean >= 40 && english >= 40 && math >= 40 &&
                average >= 60) ? "합격" : "불합격";

        System.out.println(result);
    }
}
