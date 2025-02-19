package com.kyungbae.section03.isA_hasA;

public class Application {

    public static void main(String[] args) {
        Student student1 = new Student("최준준", 25, 90, 95, new Pen("볼펜", "검정색"));
        System.out.println(student1.getInformation());
    }

}
