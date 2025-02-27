package com.kyungbae.practice5.run;

import com.kyungbae.practice5.controller.Function;
import com.kyungbae.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee();
        emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 마곡");
        emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for (int i = 0; i < emp.length; i++) {
            System.out.printf("emp[%d] : %s\n", i, emp[i].getInformation());
        }

        System.out.println("=================================================================");
        Function f = new Function();
        Employee[] empCopy = f.deepDeepCopy(emp); // 최종

//        Employee[] empCopy = emp.clone();
//
//        Employee[] empCopy = new Employee[emp.length];
//        for (int i = 0; i < emp.length; i++) {
////            empCopy[i] = Arrays.copyOf(emp[i], emp[i].length);
//            empCopy[i] = emp[i];
//        }
//        for (int i = 0; i < emp.length; i++) {
//            for (int j = 0; j < emp.length; j++) {
//                emp[i] = empCopy[i];
//            }
//        }

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

        for (int i = 0; i < emp.length; i++) {
//            if (!((empCopy[i].getInformation()).equals(emp[i].getInformation()))) {
            if (!(empCopy[i].getInformation().equals(emp[i].getInformation()))) {
                System.out.printf("emp[%d] : %s\n", i, emp[i].getInformation());
            }
        }
        empCopy = null;

        System.out.println("=================================================================");
        int[] income = new int[emp.length];
        for (int i = 0; i < emp.length; i++) {
            income[i] = (int)((emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12);
            System.out.printf("%s의 연봉 : %d원\n", emp[i].getEmpName(), income[i]);
        }

        System.out.println("=================================================================");

        int sumIncome = 0;
        for (int i = 0; i < emp.length; i++) {
            sumIncome += income[i];
        }
        System.out.println("직원들의 연봉의 평균 : " + (sumIncome / emp.length) + '원');


    }
}
