package com.john.practice4.view;

import com.john.practice4.dto.Employee;

import java.util.Scanner;

public class EmpMenu {
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        // 메뉴 화면 출력 --> 반복 실행 처리
        /*
				===== 사원 정보 관리 프로그램 =====
				1. 새 사원 정보 입력		// inputEmployee() 실행 -> 반환 값으로 emp 초기화
				2. 사원 정보 수정		  // modifyEmployee() 실행
				3. 사원 정보 삭제  		// 가비지 컬렉터가 지워주게끔
				4. 사원 정보 출력		  // Employee의 getInformation() 사용
				0. 프로그램 종료		  // return 처리
				메뉴 번호 선택 : 		  >> 입력 받음
		*/

        Employee emp = null;

        while (true) {
            System.out.println("===== 사원 정보 관리 프로그램 =====");
            System.out.println("1. 새 사원 정보 입력");
            System.out.println("2. 사원 정보 수정");
            System.out.println("3. 사원 정보 삭제");
            System.out.println("4. 사원 정보 출력");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    emp = inputEmployee();
                    break;
                case 2:
                    if (emp != null) {
                        modifyEmployee(emp);
                    } else {
                        System.out.println("아직 등록한 사원이 없습니다. 사원을 먼저 등록하세요");
                        System.out.println();
                    }
                    break;
                case 3:
                    emp = null;
                    break;
                case 4:
                    if (emp != null) {
                        emp.getInformation();
                    } else {
                        System.out.println("아직 등록한 사원이 없습니다. 사원을 먼저 등록하세요");
                        System.out.println();
                    }
                    break;
                case 0:
                    return;
            }
        }
    }

    public Employee inputEmployee() {
        // 키보드를 통해 사원 정보를 입력받고
        // 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
        // 생성된 객체 반환
        System.out.print("사원명을 입력 하세요: ");
        String name = sc.nextLine();
        System.out.print("부서명을 입력 하세요: ");
        String dept = sc.nextLine();
        System.out.print("직급을 입력 하세요: ");
        String job = sc.nextLine();
        System.out.print("나이를 입력 하세요: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력 하세요: ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("급여를 입력 하세요: ");
        int salary = sc.nextInt();
        System.out.print("보너스포인트를 입력 하세요: ");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.print("전화번호를 입력 하세요: ");
        String phone = sc.nextLine();
        System.out.print("주소를 입력 하세요: ");
        String address = sc.nextLine();
        Employee emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
        return emp;
    }

    public void modifyEmployee(Employee emp) {
        // 서브 메뉴 화면 출력 --> 반복 실행 처리
				/*
					==== 사원 정보 수정 메뉴 ====
					1. 이름 변경
					2. 급여 변경
					3. 부서 변경
					4. 직급 변경
					0. 이전 메뉴로
				*/
        // 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여
        // 전달받은 emp 객체 정보 수정되도록 작업
        while (true) {
            System.out.println("==== 사원 정보 수정 메뉴 ====");
            System.out.println("1. 이름 변경");
            System.out.println("2. 급여 변경");
            System.out.println("3. 부서 변경");
            System.out.println("4. 직급 변경");
            System.out.println("0. 이전 메뉴로");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("변경할 이름을 입력하세요: ");
                    String name = sc.nextLine();
                    emp.setEmpName(name);
                    break;
                case 2:
                    System.out.print("변경할 급여를 입력하세요: ");
                    int salary = sc.nextInt();
                    emp.setSalary(salary);
                    break;
                case 3:
                    System.out.print("변경할 부서를 입력하세요: ");
                    String dept = sc.nextLine();
                    emp.setDept(dept);
                    break;
                case 4:
                    System.out.print("변경할 직급을 입력하세요: ");
                    String job = sc.nextLine();
                    emp.setJob(job);
                    break;
                case 0:
                    return;
            }
        }
    }
}