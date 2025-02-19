package com.seungjoo.section03.isA_hasA;

public class Student extends Person { //Student is a Person

//    private String name;
//    private int age;
//    private Person person; //Student has a Person --> 말이 안됨. 이런 경우는 is a관계이므로 상속구조로 표현

    private int korScore;
    private int mathScore;

//    private String kind;
//

    private Pen pen; //Student has a Pen

    public Student() {}

    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.pen = pen;
    }
    @Override
    public String getInformation(){
        return "Student[" + super.getInformation() + "korScore=" + korScore + ", mathScore=" + mathScore + ", pen=" + pen.getInformation() + "]";
    }
}
