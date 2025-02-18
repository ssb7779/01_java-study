package com.inyong.section03.isA_hasA;

public class Student extends Person { // Student is a Person
//    상속구조로 대체
//    private String name;
//    private int age;

    private int korScore;
    private int mathScore;

    // 특정 인스턴스를 가질 수 있는 필드로 대체
//    private String kind;
//    private String color;


    private Pen pen; //student has a pen

    public Student() {

    }

    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.pen = pen;
    }

    public String getInformation(){
        return super.getInformation() +" 국어 : " +  korScore + " 수학 : " + mathScore + pen.getInformation();
    }
}
