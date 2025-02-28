package com.john.practice1.run;

import com.john.practice1.dto.Employee;
import com.john.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
            최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
			사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해
			입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			한 명씩 추가 될 때마다 카운트함

			계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			‘n’일 경우 더 이상 그만 입력 받도록..

			배열에 담긴 사원들의 정보를 모두 출력
         */

        // 사원수를 확인하는 변수
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        Employee[] employees = new Employee[10];

        // 학생 객체 생성
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 학생 정보 출력
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        int count = 0;
        
        while (true) {
            if (count == students.length) {
                System.out.println("더이상 추가할 수 없습니다. 프로그램을 종료합니다.");
                break;
            }
            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            System.out.print("신장을 입력하세요: ");
            double height = sc.nextDouble();
            System.out.print("체중을 입력하세요: ");
            double weight = sc.nextDouble();
            System.out.print("급여를 입력하세요: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서를 입력하세요: ");
            String dept = sc.nextLine();
            
            // 입력받은 값을 기준으로 객체 생성
            employees[count] = new Employee(name, age, height, weight, salary, dept);

            System.out.print("사원을 더 추가하시겠습니까? (y/n): ");
            char ch = sc.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                // 카운트 추가
                count++;
            } else if (ch == 'n' || ch == 'N') {
                break;
            } else{
                System.out.println("비정상적인 입력값으로 프로그램을 종료합니다. ");
                break;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
