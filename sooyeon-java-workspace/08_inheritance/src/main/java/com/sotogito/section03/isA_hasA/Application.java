package com.sotogito.section03.isA_hasA;

public class Application {
    public static void main(String[] args) {
        /**
         * 학생 IS A 사람
         * 학생 HAS A 펜
         */
        Student s1 = new Student("kim",5,100,100,new Pen("볼","검"));
        System.out.println(s1);
    }
}
