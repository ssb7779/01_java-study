package com.jjanggu.practice6.dto;

public class Student {

    private int grade;
    private int classrooom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student () {}

    public Student(int grade, int classrooom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classrooom = classrooom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassrooom() {
        return classrooom;
    }

    public void setClassrooom(int classrooom) {
        this.classrooom = classrooom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getInformation(){
        return "학년 : " + grade + ", 반 : " + classrooom + ", 이름 : " + name
                + ", 국어점수 : " + kor + ", 영어점수 : " + eng + ", 수학점수 : " + math;
    }
}
