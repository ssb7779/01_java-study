package com.jjanggu.practice4.view;

import com.jjanggu.practice4.dto.Employee;

import java.util.Scanner;

public class EmpMenu{
    Scanner sc = new Scanner(System.in);

    public void mainMenu {
        Employee emp  = null;

        while(true) {
            System.out.println("\n ==== 사원 정보 관리 프로그램 ====");
            System.out.println("1. 새 사원 정보 입력");
            System.out.println("2, 사원 정도 수정");
            System.out.println("3. 사원 정보 삭제");
            System.out.println("4. 사원 정보 출력");
            System.out.println("0. 프로그램 종료" );
            System.out.println("메뉴 번호 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if((menu == 2 || menu == 4) && emp == null){
                System.out.println("사원정보를 먼저 입력해야됩니다.");
                continue;
            }

            switch (menu){
                case
            }

        }

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
    }
    /*
    public Employee inputEmployee() {
        // 키보드를 통해 사원 정보를 입력받고
        // 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
        // 생성된 객체 반환
    }

     */

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
    }



}