package com.minkook.section03.isA_hasA;

public class Student extends Person { //student is a Person\
    //상속구조로 대체
//    private String name;
//    private int age;


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

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    private int korScore;
    private int mathScore;

    private Pen pen; //Student has a pen

    public Student(){

    }

    public Student(String name, int age, int korScore, int mathScore){
        //super(name,age);
        this.korScore = korScore;
        this.mathScore = mathScore;
    }

    @Override
    public String getInformation() {
        return "Student{" + super.getInformation()+
                ", korScore=" + korScore +
                ", mathScore=" + mathScore +
                ", pen=" + pen +
                '}';
    }
}
