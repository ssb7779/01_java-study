package com.jjanggu.practice;

public class PracApplication6 {
    public static void main(String[] args) {

        int korean = 60;
        int math = 39;
        int english = 81;

        int sum = korean + math + english;
        double average = sum / 3.0;  // 강사님 풀이
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
//        System.out.println("평균 : " + (double)sum/3); //내 풀이 => 데이터 손실이 나서 부정확한 값을 가지게 됨

        String result = (korean >= 40 && math >= 40 && english >= 40) && sum/3 >= 60 ? "합격" : "불합격";
        System.out.println(result);
    }
}
