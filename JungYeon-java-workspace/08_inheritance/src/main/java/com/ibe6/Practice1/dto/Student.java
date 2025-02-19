package com.ibe6.Practice1.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student(){}

    public Student(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
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

    @Override
    public String toString() {
        return "name= " + name + ", age= " + super.getAge() + ", height= " + super.getHeight() +
                ", weight= " + getWeight() + ", grade= " + grade +
                ", major= " + major;
    }
}
