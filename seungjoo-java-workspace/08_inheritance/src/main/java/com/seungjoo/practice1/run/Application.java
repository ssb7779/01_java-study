package com.seungjoo.practice1.run;

import com.seungjoo.practice1.dto.Employee;
import com.seungjoo.practice1.dto.Student;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보시스템공학과");

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int cnt = 0;


        while (true) {

            if (cnt == 10) {
                break;
            }
            System.out.print("이름을 입력하세요:");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("키를 입력하세요:");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("몸무게를 입력하세요:");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("급여를 입력하세요:");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서를 입력하세요:");
            String dept = sc.nextLine();
            employees[cnt] = new Employee(name, age, height, weight, salary, dept);
            cnt++;
            System.out.println("계속 추가하시겠습니까?");
            String answer = sc.nextLine();
            answer = answer.toUpperCase();
            char answer1 = answer.charAt(0);

            if (answer1 == 'N') {
                break;
            }
        }
        for(int i = 0; i < cnt; i++) {
            System.out.println(employees[i].toString());
        }

        }




    }

