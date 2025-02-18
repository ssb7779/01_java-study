package com.minkook.practice1.dto;


public class Student extends Person {
    private int grade;
    private String major;


    public Student() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super.setName(name);
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);
        this.grade = grade;
        this.major = major;
        this.name = super.getName();
    }

    @Override
    public String toString() {
        return  super.toString() + " " + grade + " " + major;
    }
}
