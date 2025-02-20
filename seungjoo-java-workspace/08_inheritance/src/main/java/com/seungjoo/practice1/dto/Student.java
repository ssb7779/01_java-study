package com.seungjoo.practice1.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student() {}

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "name: " + super.name + " age: " + super.getAge()+ " height: " + super.getHeight()+ " weight: " + super.getWeight()
        + " grade : " + grade + " major: " + major;
    }
}

