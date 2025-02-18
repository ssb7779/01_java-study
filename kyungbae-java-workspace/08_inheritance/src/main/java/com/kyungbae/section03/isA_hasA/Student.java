package com.kyungbae.section03.isA_hasA;

public class Student extends Person { // Student is a Person

    // Person에 있는 중복요소
    // 상속구조로 대체
//    private String name;
//    private String age;

    private int korScore;
    private int mathScore;

    // Pen에 있는 중복요소
    // 특정 인스턴스를 가질 수 있는 필드로 대체
//    private String kind;
//    private String color;

    // Student has a Pen
    private Pen pen; // has a 관계


    public Student() {
    }

    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
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

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public String getInformation() {
        return "Sudent[" + super.getInformaiton() + ", korScore=" + korScore + ", mathScore=" + mathScore
                + " " + pen.getInformation() + ']';
    }
}
