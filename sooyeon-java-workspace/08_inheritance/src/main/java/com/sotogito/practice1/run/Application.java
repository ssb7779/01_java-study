package com.sotogito.practice1.run;

import com.sotogito.practice1.dto.Employee;
import com.sotogito.practice1.dto.Person;
import com.sotogito.practice1.dto.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] students = new Student[3];

        students[0] = new Student(20, 178.2, 70, 1, "정보시스템공학과");
        students[0].setName("홍길동");
        students[1] = new Student(21, 187.3, 80.0, 2, "경영학과");
        students[1].setName("김말똥");
        students[2] = new Student(23, 167.0, 45.0, 4, "정보통신공학과");
        students[2].setName("강개순");

        for (Person student : students) {
            System.out.println(student);
        }


        Person[] employees = new Employee[3];
        int count = 0;
        while (true) {
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("신장 : ");
            double height = sc.nextDouble();
            System.out.println("몸무게");
            double weight = sc.nextDouble();
            System.out.println("급여 : ");
            int salary = sc.nextInt();
            System.out.println("부서 : ");
            sc.nextLine();
            String dept = sc.nextLine();

            Employee newEmployee = new Employee(age, height, weight, salary, dept);
            newEmployee.setName(name);
            employees[count] = newEmployee;
            count++;

            if (count == employees.length) {
                System.out.println("모든 인원을 추가하였습니다.");
                break;
            }

            System.out.println("더 추가하겠습니까?");
            char continueAnswer = sc.nextLine().charAt(0);
            if (continueAnswer == 'y') {
                continue;
            } else if (continueAnswer == 'n') {
                break;
            }
            System.out.println("계속 진행합니다.");
        }

        for (Person employee : Arrays.copyOf(employees, count)) {
            System.out.println(employee);
        }
    }

}
