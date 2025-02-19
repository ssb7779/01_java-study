package com.younggalee.section03.isA_hasA;

public class Student extends Person{  // Student 'is a' Person
    // Studend is a Pen(X) >> cant use extends

    //상속구조로 대체
    //private String name;
    //private int age;


    // 특정 인스턴스를 가질 수 있는 필드로 대체
    private Pen pen;  // Student 'has a' Pen
    // private String kind;
    // private String color;

    private int korScore;
    private int mathScore;

    public Student(String name, int age, Pen pen, int korScore, int mathScore) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.pen = pen;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public String getInformation(){
        return "Student[" + super.getInformation() + "국어점수 : " + korScore
                + "수학점수 : " + mathScore + "pen = " + pen.getInformation() + "]";
    }



    //    Pen pen = new Pen();  // 객체 조립
//    Person person = new Person();

}
