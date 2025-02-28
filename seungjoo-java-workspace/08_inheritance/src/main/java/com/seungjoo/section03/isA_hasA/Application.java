package com.seungjoo.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {

        Student student = new Student("홍길동", 20, 60,95,new Pen("제트 스트림", "초록색"));
        System.out.println(student.getInformation());


    }
}
