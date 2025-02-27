package com.kyungbae.practice4.controller;

import com.kyungbae.practice4.dto.Employee;

public class EmployeeManager {
    Employee emp = new Employee();
    public Boolean inputEmployee (String name, String dept, String job, String age, String gender, String salary, String bonusPoint, String phone, String address){
        emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
        return true;
    }

    public Boolean modifyName(String name){
        emp.setEmpName(name);
        return true;
    }

    public Boolean modifySalary (String salary){
        emp.setSalary(salary);
        return true;
    }

    public Boolean modifyDept (String dept){
        emp.setDept();
    }


}
