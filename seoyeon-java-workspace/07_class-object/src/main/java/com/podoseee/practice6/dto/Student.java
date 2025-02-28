package com.podoseee.practice6.dto;


public class Student {
    private int grade;
    private int classroom;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(int grade, int classroom, String name, int koreanScore, int englishScore, int mathScore) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public double getAverage() {
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    public void printInfo() {
        System.out.printf("학년: %d, 반: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d, 평균: %.2f%n",
                grade, classroom, name, koreanScore, englishScore, mathScore, getAverage());
    }
}
