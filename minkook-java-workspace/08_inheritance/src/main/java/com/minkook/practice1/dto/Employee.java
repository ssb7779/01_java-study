package com.minkook.practice1.dto;



public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }




    public Employee(String  name, int age, double height, double weight,int salary, String dept) {
        super.setName(name);
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(int age, double height, double weight, int salary, String dept, Person name) {
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary + " " + dept + " " + name;
    }
}
