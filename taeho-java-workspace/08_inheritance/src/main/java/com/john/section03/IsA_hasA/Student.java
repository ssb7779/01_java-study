package com.john.section03.IsA_hasA;

// IS A 는 상속 / HAS A 는 필드로 구분해서 사용하기
public class Student extends Person {
    // Student 'Has A' Person (X)
    // Student 'Is A' Person(O)
    // 상속구조로 대체
    // private String name;
    // private int age;

    private int korScore;
    private int mathScore;

    // private String kind;
    // private String color;
    // 특정 인스턴스를 가질 수 있는 필드로 대체
    // Student 'Is A' Pen (X)
    // Student 'Has A' Pen (O)
    private Pen pen;

    public Student() {
    }

    // 소유관계 has a로 pen 객체를 전달 받을 수 있음
    // name, age => 상속받고 있는 상위클래스의 필드값
    public Student(String name, int age, int korScore, int mathScore, Pen pen) {
        /*
            super.setAge(age);
            super.setName(name);
            or
            super(name, age);
         */
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

    @Override
    public String getInformation() {
        return "Student[ " + super.getInformation()
                + ", korScore=" + korScore
                + ", mathScore=" + mathScore
                + ", pen=" + pen.getInformation() + "]";
    }
}
