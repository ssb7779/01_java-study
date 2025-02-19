package com.inyong.practice1.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student() {}

    public Student(int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{"+ super.toString() + "name='" + name + ", grade=" + grade + ", major='" + major + "'}";
    }
}