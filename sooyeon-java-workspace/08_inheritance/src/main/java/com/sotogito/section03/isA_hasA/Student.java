package com.sotogito.section03.isA_hasA;

public class Student extends Person {

    private int korScore;
    private int mathScore;

    private Pen pen;

    public Student() {
    }


    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        super(name, age);
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "korScore=" + korScore +
                ", mathScore=" + mathScore +
                ", pen=" + pen.toString() +
                '}';
    }
}
