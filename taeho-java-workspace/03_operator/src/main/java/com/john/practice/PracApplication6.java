package com.john.practice;

public class PracApplication6 {
    public static void main(String[] args) {
        int korean = 60;
        int english = 20;
        int math = 40;
        int sum = korean + english + math;
        double average = sum / 3.0;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        System.out.println((korean >= 40 &&
                english >= 40 &&
                math >= 40 &&
                average >= 60) ? "합격" : "불합격");
    }
}
