package com.john.practice1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {}

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        /*
            super.name = name; 도 동일한 표현
            부모클래스의 필드임을 명확하게 명시
            만약 자식클래스에도 같은 필드가 있다면 이경우는 확실하게 super로 표시
             this. = 현재 인스턴스 // super. = 부모 클래스
             확실하게 흐름이 파악되지 않을 때는 super. 를 사용하자
         */
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
