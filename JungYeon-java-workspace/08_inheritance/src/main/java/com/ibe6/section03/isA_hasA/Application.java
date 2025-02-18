package com.ibe6.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {
        Student stu = new Student("홍길동", 20, 60, 95, new Pen("형광펜", "노란색"));

        System.out.println(stu.getInformation());

    }
}
