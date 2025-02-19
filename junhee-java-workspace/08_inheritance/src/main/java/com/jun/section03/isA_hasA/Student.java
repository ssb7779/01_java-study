package com.jun.section03.isA_hasA;

public class Student extends Person{//  student is a Person

   // 상속 구조로 대체
   // private String name;
   // private int age;

    private int korScore;
    private int mathScore;

   // 특정 인스턴스를 가질 수 있는 필드로 대체
   //    private String kind;
   //    private String color;
    private Pen pen; //Student has a Pen

    public Student(){}

    public  Student(String name, int age, int korScore, int mathScore, Pen pen){
        super(name,age);
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
    @Override
    public String getInformation(){
        return "Student[" + super.getInformation() + ", korScore=" + korScore +
                ", mathScore=" + mathScore + ", Pen=" + pen.getInformation() + "]";
    }

}


