package com.seungjoo.practice1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {}

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age,height,weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "name : " + name + " age: "+ super.getAge() + " height: "+ super.getHeight()
                + " salary: " + salary + " dept: " + dept;
    }
}
