package com.seungjoo.practice4.view;

import com.seungjoo.practice4.run.Employee;

import java.util.Scanner;

public class EmpMenu {

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        Employee emp = null;

        while (true) {
            System.out.println("===== 사원 정보 관리 프로그램 =====");
            System.out.println("1. 새 사원 정보 입력");
            System.out.println("2. 사원 정보 수정");
            System.out.println("3. 사원 정보 삭제");
            System.out.println("4. 사원 정보 출력");
            System.out.println("0. 프로그램 종료");
            System.out.println("메뉴 번호 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                emp = inputEmployee();
            } else if (num == 2) {
                modifyEmployee(emp);
            }else if (num == 3) {
                emp = null;

            }else if (num == 4) {
                emp = new Employee();
                emp.getInformation();

            }else if (num == 0) {
                break;
            }
        }



    }

    public Employee inputEmployee() {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int num1 = sc.nextInt();
        sc.nextLine();
        char char1 = sc.nextLine().charAt(0);
        int num2 = sc.nextInt();
        sc.nextLine();
        double double1 = sc.nextDouble();
        sc.nextLine();
        String str4 = sc.nextLine();
        String str5 = sc.nextLine();
        Employee emp1 = new Employee(str1, str2, str3, num1, char1, num2,double1, str4, str5);
        return emp1;
    }

    public void modifyEmployee(Employee emp) {
        while (true) {
            System.out.println("=== 사원 정보 수정 메뉴 ====");
            System.out.println("1. 이름 변경");
            System.out.println("2. 급여 변경");
            System.out.println("3. 부서 변경");
            System.out.println("4. 직급 변경");
            System.out.println("0. 이전 메뉴로");

            int number1 = sc.nextInt();
            sc.nextLine();
            if (number1 == 1) {
                emp.setEmpName("이승주");
            } else if (number1 == 2) {
                emp.setSalary(1000000);

            } else if (number1 == 3) {
                emp.setDept("백엔드 개발");
            } else if (number1 == 4) {
                emp.setJob("팀장");

            } else if (number1 == 0) {
                return;
            }


        }
    }}
