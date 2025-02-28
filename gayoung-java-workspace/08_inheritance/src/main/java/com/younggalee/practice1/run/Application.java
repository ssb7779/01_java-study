package com.younggalee.practice1.run;

import com.younggalee.practice1.dto.Employee;
import com.younggalee.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student[] studentArr = new Student[3];
        studentArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1 ,"정보시스템공학과");
        studentArr[1] = new Student("김말똥", 21,187.3, 80.0, 2, "경영학과");
        studentArr[2] = new Student( "강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(int i=0; i<studentArr.length; i++){
            System.out.println(studentArr[i].toString());
        }

        Employee[] emp = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {


            System.out.println("===== 직원 정보 입력 =====");
            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("나이: ");
            int age = sc.nextInt();


            System.out.print("키: ");
            double height = sc.nextDouble();


            System.out.print("몸무게: ");
            double weight = sc.nextDouble();


            System.out.print("급여: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("부서: ");
            String dept = sc.nextLine();

            emp[count] = new Employee(name, age, height, weight, salary, dept);
            ++count;

            System.out.println("직원 정보가 저장되었습니다! (현재 등록된 직원 수: " + count + ")");

            System.out.print("계속 입력하시겠습니까? (y/n): ");
            char yn = sc.nextLine().charAt(0);

            if (yn == 'n') {
                System.out.println("직원 입력을 종료합니다.");
                break;
            }

            if (count >= emp.length) {
                System.out.println("더 이상 직원을 추가할 수 없습니다! (최대 10명)");
                break;
            }
        }

        System.out.println("\n===== 등록된 직원 정보 출력 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].toString());
        }
    }
}
