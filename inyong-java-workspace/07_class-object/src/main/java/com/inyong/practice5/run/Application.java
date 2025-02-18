package com.inyong.practice5.run;

import com.inyong.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[3];

        // 객체 배열 할당
        empArr[0] = new Employee();
        empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        // 초기 정보 출력
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("emp[" + i + "] : " + empArr[i].getInformation());
        }

        System.out.println("\n==================================================\n");

        // 값이 없는 필드 채우기
        empArr[0].setEmpNo(0);
        empArr[0].setEmpName("김말똥");
        empArr[0].setDept("영업부");
        empArr[0].setJob("팀장");
        empArr[0].setAge(30);
        empArr[0].setGender('M');
        empArr[0].setSalary(3000000);
        empArr[0].setBonusPoint(0.2);
        empArr[0].setPhone("01055559999");
        empArr[0].setAddress("전라도 광주");

        empArr[1].setDept("기획부");
        empArr[1].setJob("부장");
        empArr[1].setSalary(4000000);
        empArr[1].setBonusPoint(0.3);

        // 수정 후 정보 출력
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("emp[" + i + "] : " + empArr[i].getInformation());
        }

        System.out.println("\n==================================================\n");

        // 연봉 계산 및 출력
        int totalSalary = 0;
        for (int i = 0; i < empArr.length; i++) {
            int annualSalary = (int) ((empArr[i].getSalary() + (empArr[i].getSalary() * empArr[i].getBonusPoint())) * 12);
            totalSalary += annualSalary;
            System.out.println(empArr[i].getEmpName() + "의 연봉 : " + annualSalary + "원");
        }

        System.out.println("\n==================================================\n");

        // 평균 연봉 출력
        System.out.println("직원들의 연봉의 평균 : " + (totalSalary / empArr.length) + "원");
    }
}