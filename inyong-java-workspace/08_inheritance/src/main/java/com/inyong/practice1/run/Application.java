package com.inyong.practice1.run;

import com.inyong.practice1.dto.Employee;
import com.inyong.practice1.dto.Student;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있는 객체 배열 할당
        Student[] students = new Student[3];
        students[0] = new Student(20, 170.5, 60.0, 3, "Computer Science");
        students[0].setName("홍길동");
        students[1] = new Student(20, 170.5, 60.0, 3, "Computer Science");
        students[1].setName("김말똥");
        students[2] = new Student(20, 170.5, 60.0, 3, "Computer Science");
        students[2].setName("강개순");

        // 학생 정보 출력
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // 최대 10명의 사원 정보를 기록할 수 있는 객체 배열 할당
        Employee[] employees = new Employee[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            if (count >= 10) {
                System.out.println("더 이상 사원을 추가할 수 없습니다.");
                break;
            }

            System.out.print("나이: ");
            int age = scanner.nextInt();
            System.out.print("키: ");
            double height = scanner.nextDouble();
            System.out.print("몸무게: ");
            double weight = scanner.nextDouble();
            System.out.print("급여: ");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.print("부서: ");
            String dept = scanner.nextLine();
            System.out.print("이름: ");
            String name = scanner.nextLine();

            employees[count] = new Employee(age, height, weight, salary, dept);
            employees[count].setName(name);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();

        // 사원 정보 출력
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}
