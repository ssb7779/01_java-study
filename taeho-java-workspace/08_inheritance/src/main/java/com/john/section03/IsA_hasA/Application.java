package com.john.section03.IsA_hasA;

// IS A 는 상속 / HAS A 는 필드로 구분해서 사용하기
public class Application {
    public static void main(String[] args) {
        // 소유관계인 Pen 객체를 매개변수로 사용할 수 있음
        Student student = new Student("이름", 20, 60, 80, new Pen("샤프","보라"));
        System.out.println(student.getInformation());
    }
}
