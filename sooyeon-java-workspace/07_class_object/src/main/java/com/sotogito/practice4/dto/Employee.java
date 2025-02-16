package com.sotogito.practice4.dto;

public class Employee {
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    public Employee() {
    }

    public Employee(String empName, String dept, String job,
                    int age, char gender, int salary,
                    double bonusPoint, String phone, String address) {
        this.address = address;
        this.age = age;
        this.bonusPoint = bonusPoint;
        this.dept = dept;
        this.empName = empName;
        this.gender = gender;
        this.job = job;
        this.phone = phone;
        this.salary = salary;
    }


    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public String getDept() {
        return dept;
    }

    public String getEmpName() {
        return empName;
    }

    public char getGender() {
        return gender;
    }

    public String getJob() {
        return job;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInformation() {
        String infoPrintout =
                "사원명 : %s\n" +
                        "부서명 : %s\n" +
                        "직급 : %s\n" +
                        "나이 : %d\n" +
                        "성별 : %c\n" +
                        "급여 : %d\n" +
                        "보너스포인트 : %.1f\n" +
                        "전화번호 : %s\n" +
                        "주소 : %s\n";
        return String.format(infoPrintout,
                empName, dept, job, age, gender, salary, bonusPoint, phone, address);
    }

}
