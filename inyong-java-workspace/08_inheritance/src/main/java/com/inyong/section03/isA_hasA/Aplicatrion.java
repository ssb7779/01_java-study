package com.inyong.section03.isA_hasA;

public class Aplicatrion {

    public static void main(String[] args) {
        Student stu = new Student("홍길동", 20, 60, 95, new Pen("형광펜", "노란팬"));
        System.out.println(stu.getInformation());
    }

//  구분	“Is a” 관계 (상속)	                 “Has a” 관계 (구성)
//  의미	특정 클래스가 다른 클래스의 특수한 형태	    특정 클래스가 다른 클래스를 포함
//  구현 방식	extends / inheritance 사용	    멤버 변수로 포함 (Composition)
//  예시	Dog is an Animal	                Car has an Engine
//  특징	부모 클래스의 기능을 확장(Override 가능)	독립적인 객체 간의 관계
//
}
