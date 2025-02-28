package com.inyong.practice6.dto;

public class Student {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student() {
    }

    public Student(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getEng() {
        return eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath() {
        return math;
    }

    public String getInformation() {
        return grade + "학년 " + classroom + "반, 이름: " + name + ", 국어: " + kor +
                ", 영어: " + eng + ", 수학: " + math;
    }
}