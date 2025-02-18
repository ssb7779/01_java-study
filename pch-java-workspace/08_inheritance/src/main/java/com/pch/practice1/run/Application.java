package com.pch.practice1.run;

import com.pch.practice1.dto.Employee;
import com.pch.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student []students = new Student[3];
        students[0] = new Student("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥",21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순",23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student student : students) {
            System.out.println(student);
        }

        Employee []employees = new Employee[10];
        System.out.println("사원 정보 입력창");
        Scanner sc = new Scanner(System.in);
        int employeeCnt = 0;
        while(true){
            System.out.println("사원 이름");
            String name = sc.nextLine();
            System.out.println("사원 나이");
            int age = sc.nextInt();
            System.out.println("사원 신장");
            double height = sc.nextDouble();
            System.out.println("사원 몸무게");
            double weight = sc.nextDouble();
            System.out.println("사원 급여");
            int salary = sc.nextInt();
            System.out.println("사원 부서");
            sc.nextLine();
            String dept = sc.nextLine();

            employees[employeeCnt++] = new Employee(name, age, height, weight, salary, dept);

            System.out.println("더 추가할래? (y/n)");
            String answer = sc.nextLine();
            if(answer.equals("n")){
                break;
            }
        }

        for(int i = 0; i<employeeCnt; i++){
            System.out.println(employees[i].toString());
        }
    }
}
