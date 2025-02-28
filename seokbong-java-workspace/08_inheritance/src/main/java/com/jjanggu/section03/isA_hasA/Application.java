package com.jjanggu.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 20, 60, 95, new Pen("형광팬", "노란색"));

        System.out.println(student.getInformation());
    }
}
