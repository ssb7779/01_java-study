package com.jjanggu.practice;

public class PracApplication6 {
    public static void main(String[] args) {

        int korean = 60;
        int math = 40;
        int english = 80;

        int sum = korean + math + english;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double)sum/3);

        String result = (korean >= 40 && math >= 40 && english >= 40) && sum/3 >= 60 ? "합격" : "불합격";
        System.out.println(result);
    }
}
