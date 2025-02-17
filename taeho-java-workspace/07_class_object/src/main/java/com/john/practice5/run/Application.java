package com.john.practice5.run;

import com.john.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {

        Employee[] emp = new Employee[3];
        emp[0] = new Employee();

        emp[1] = new Employee();
        emp[1].setEmpNo(1);
        emp[1].setEmpName("홍길동");
        emp[1].setAge(19);
        emp[1].setGender('M');
        emp[1].setPhone("01022223333");
        emp[1].setAddress("서울 잠실");

        emp[2] = new Employee();
        emp[2].setEmpNo(2);
        emp[2].setEmpName("강말순");
        emp[2].setDept("교육부");
        emp[2].setJob("강사");
        emp[2].setAge(20);
        emp[2].setGender('F');
        emp[2].setSalary(1000000);
        emp[2].setBonusPoint(0.01);
        emp[2].setPhone("01011112222");
        emp[2].setAddress("서울 마곡");

        for (Employee employee : emp) {
            System.out.println(employee.getInformation());
        }

        System.out.println("================================================");

        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");

        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);
        emp[1].setPhone("01022223333");

        System.out.println(emp[0].getInformation());
        System.out.println(emp[1].getInformation());

        System.out.println("================================================");

        for (Employee employee : emp) {
            System.out.println(employee.getSalary());
            System.out.println(employee.getSalary() * employee.getBonusPoint());
            System.out.println(employee.getSalary() + (employee.getSalary() * employee.getBonusPoint()));
            System.out.println((employee.getSalary() + (employee.getSalary() * employee.getBonusPoint())) * 12);
            double resultSalary = (employee.getSalary() + (employee.getSalary() * employee.getBonusPoint()) * 12);
            System.out.println(employee.getEmpName() + "의 연봉 : " + resultSalary + "원");
        }
    }
}
