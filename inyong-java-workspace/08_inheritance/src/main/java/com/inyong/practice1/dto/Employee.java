package com.inyong.practice1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {}

    public Employee(int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "name='" + name + "', age=" + ", salary=" + salary + ", dept='" + dept + "'}";
    }
}

