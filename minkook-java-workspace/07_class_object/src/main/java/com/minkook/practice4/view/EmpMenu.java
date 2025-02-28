package com.minkook.practice4.view;

import com.minkook.practice4.dto.Employee;

import java.util.Scanner;

public class EmpMenu{
    Employee emp  = new Employee();
    Scanner sc = new Scanner(System.in);
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
    public void mainMenu() {

        while(true){
            System.out.println("===== 사원 정보 관리 프로그램 =====");
            System.out.println("1. 새 사원 정보 입력");
            System.out.println("2. 사원 정보 수정");
            System.out.println("3. 사원 정보 삭제");
            System.out.println("4. 사원 정보 출력");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 번호 선택: ");
            int menuNum = sc.nextInt();
            sc.nextLine();
            if(menuNum == 0) {
                return;
            }

            switch (menuNum){
                case 1:
                    inputEmployee();
                    break;
                case 2:
                    modifyEmployee(emp);
                    break;
                case 3:
                     System.gc();
                     emp =  new Employee();
                     break;
                case 4:
                    System.out.println(emp.getInformation());
                    break;
                default:
                    System.out.println("없는 메뉴번호입니다 다시 입력해주세요");
                    return;
            }

        }

    }

    public Employee inputEmployee() {
        // 키보드를 통해 사원 정보를 입력받고
        // 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
        // 생성된 객체 반환
        Scanner sc = new Scanner(System.in);

        System.out.print("사원이름: ");
        emp.setEmpName(sc.nextLine());

        System.out.print("사원부서: ");
        emp.setDept(sc.nextLine());

        System.out.print("사원직급: ");
        emp.setJob(sc.nextLine());

        System.out.print("사원나이: ");
        emp.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("사원성별: ");
        emp.setGender(sc.nextLine().charAt(0));

        System.out.print("사원연봉: ");
        emp.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.print("사원보너스: ");
        emp.setBonusPoint(sc.nextDouble());
        sc.nextLine();

        System.out.print("사원전화번호: ");
        emp.setPhone(sc.nextLine());

        System.out.print("사원주소: ");
        emp.setAddress(sc.nextLine());

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
        while(true){
            System.out.println("==== 사원 정보 수정 메뉴 ====");
            System.out.println("1. 이름 변경");
            System.out.println("2. 급여 변경");
            System.out.println("3. 부서 변경");
            System.out.println("4. 직급 변경");
            System.out.println("0. 이전 메뉴로");
            System.out.print("메뉴 번호 선택: ");
            int menuUpdateNum = sc.nextInt();
            sc.nextLine();

            switch (menuUpdateNum){
                case 1:
                    System.out.print("수정할이름: ");
                    emp.setEmpName(sc.nextLine());
                    break;
                case 2:
                    System.out.print("급여 변경: ");
                    emp.setSalary(sc.nextInt());
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("부서 변경: ");
                    emp.setDept(sc.nextLine());
                    break;
                case 4:
                    System.out.print("직급 변경: ");
                    emp.setJob(sc.nextLine());
                    break;
                case 0:
                   return;
            }


        }

    }
}