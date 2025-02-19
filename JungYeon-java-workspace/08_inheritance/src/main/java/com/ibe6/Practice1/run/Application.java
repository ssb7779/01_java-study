package com.ibe6.Practice1.run;

import com.ibe6.Practice1.dto.Employee;
import com.ibe6.Practice1.dto.Person;
import com.ibe6.Practice1.dto.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        1. 3명의 학생 정보를 기록할 수 있도록 객체 배열을 할당하고
           아래의 사용 데이터를 참고하여 3명의 학생 객체 생성 후
           반복문을 통해 출력
        2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고
           반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현
           2명 정의 사원 정보를 입력 받아 저장하고
           현재까지 기록된 사원들의 정보 출력
         */
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
        Student[] student = new Student[3]; //위의 사용데이터 참고하여 3명의 학생 정보 초기화
        student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
        // 위의 학생 정보 모두 출력
        for (Student s : student) {
            System.out.println(s);
        }


        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])

        int i = 0;
        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = sc.nextInt();
            System.out.print("신장: ");
            double height = sc.nextDouble();
            System.out.print("몸무게: ");
            double weight = sc.nextDouble();
            System.out.print("급여: ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("부서: ");
            String major = sc.nextLine();

            if (i < employees.length) {
                employees[i] = new Employee(name, age, height, weight, grade, major);
                i++;
            }
            System.out.print("계속 추가하시겠습니까?(y,n): ");
            char answer = sc.nextLine().charAt(0);
            if (answer == 'y')
                continue;
            else if (answer == 'n')
                break;
        }
        for(Employee e : employees){
            if (e != null) {
                System.out.println("사원 정보: " + e);
            }
        }
        // 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해
        // 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
        // 한 명씩 추가 될 때마다 카운트함

        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // ‘n’일 경우 더 이상 그만 입력 받도록..

        // 배열에 담긴 사원들의 정보를 모두 출력
    }
}