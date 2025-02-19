package com.younggalee.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 20,  new Pen("형광펜", "노란색"), 95,  60);
        System.out.println(student.getInformation());
    }

}
