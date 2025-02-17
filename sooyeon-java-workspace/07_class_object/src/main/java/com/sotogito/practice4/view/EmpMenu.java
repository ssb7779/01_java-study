package com.sotogito.practice4.view;

import com.sotogito.practice4.dto.Employee;
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
            System.out.println("메뉴 번호 선택");
            int functionNum = sc.nextInt();

            switch (functionNum) {
                case 0:
                    return;
                case 1:
                    emp = inputEmployee();
                    break;
                case 2:
                    if (emp != null) {
                        modifyEmployee(emp);
                        break;
                    }
                    System.out.println("사원을 먼저 등록해주세요.");
                    break;
                case 3:
                    emp = null;
                    break;
                case 4:
                    if (emp != null) {
                        System.out.println(emp.getInformation());
                        break;
                    }
                    System.out.println("사원을 먼저 등록해주세요.");
                    break;
            }
        }
    }

    public Employee inputEmployee() {
        System.out.print("사원명 : ");
        sc.nextLine();
        String empName = sc.nextLine();

        System.out.print("부서명 : ");
        String dept = sc.nextLine();

        System.out.print("직급 : ");
        String job = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("급여 : ");
        int salary = sc.nextInt();

        System.out.print("보너스포인트 : ");
        double bonusPoint = sc.nextDouble();

        System.out.print("전화번호 : ");
        sc.nextLine();
        String phone = sc.nextLine();

        System.out.print("주소 : ");
        String address = sc.nextLine();

        return new Employee(
                empName, dept, job, age, gender, salary, bonusPoint, phone, address
        );
    }

    public void modifyEmployee(Employee emp) {
        while (true) {
            System.out.println("===== 사원 정보 수정 메뉴 =====");
            System.out.println("1. 이름 변경");
            System.out.println("2. 급여 변경");
            System.out.println("3. 부서 급여");
            System.out.println("4. 직급 변경");
            System.out.println("0. 이전 메뉴로");
            int functionNum = sc.nextInt();

            switch (functionNum) {
                case 0:
                    return;
                case 1:
                    System.out.println("변경 이름");
                    sc.nextLine();
                    emp.setEmpName(sc.nextLine());
                    break;
                case 2:
                    System.out.println("변경 급여");
                    emp.setSalary(sc.nextInt());
                    break;
                case 3:
                    System.out.println("변경 부서");
                    sc.nextLine();
                    emp.setDept(sc.nextLine());
                    break;
                case 4:
                    System.out.println("변경 직급");
                    sc.nextLine();
                    emp.setJob(sc.nextLine());
            }
        }
    }

}
