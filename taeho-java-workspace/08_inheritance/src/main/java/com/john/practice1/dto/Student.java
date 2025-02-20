package com.john.practice1.dto;

public class Student extends Person {
    private int grade;
    private String major;


    public Student() {}

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
