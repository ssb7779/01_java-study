package com.jun.practice5.run;

import com.jun.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {

        Employee[] emp = new Employee[3];
        emp[0] = new Employee();
        emp[1] = new Employee();
        emp[2] = new Employee();


        }
        }

/*
public class Employee {
    private int id;
    private String name;
    private String department = "";
    private String position = "";
    private int age;
    private char gender;
    private int salary = 0;
    private double bonusPoint = 0.0;
    private String phone;
    private String address;

    // 기본 생성자
    public Employee() {}

    // 6개짜리 생성자
    public Employee(int id, String name, int age, char gender, String phone, String address) {
        this(id, name, "", "", age, gender, 0, 0.0, phone, address);
    }

    // 10개짜리 생성자
    public Employee(int id, String name, String department, String position, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    // Getter 및 Setter
    public void updateInfo(String department, String position, int salary, double bonusPoint) {
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
    }

    // 연봉 계산 메소드
    public int getAnnualSalary() {
        return (int) ((salary + (salary * bonusPoint)) * 12);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s",
                             id, name, department, position, age, gender, salary, bonusPoint, phone, address);
    }
}
 */


