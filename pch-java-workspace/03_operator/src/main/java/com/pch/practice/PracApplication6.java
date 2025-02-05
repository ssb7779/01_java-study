package com.pch.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int korean = 60;
        int math = 40;
        int english = 80;
        
        int sum = korean + math + english;
        double avg = (double) sum / 3;

        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.1f\n", avg);
        
        if(avg>=60 && math>=40&&korean>=40 && english>=40) {
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
    }
}
