package com.podoseee.practice6.run;

import com.podoseee.practice6.dto.Student;

import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        Student[] students = new Student[10];
        int count = 0;	// 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임

        // while(true)을 사용하여 학생들의 정보를 계속 입력 받고
        while (count < 10) {
            System.out.println("학생 정보를 입력하세요.");
            System.out.print("학년: ");
            int grade = scanner.nextInt();
            System.out.print("반: ");
            int classroom = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("국어 점수: ");
            int koreanScore = scanner.nextInt();
            System.out.print("영어 점수: ");
            int englishScore = scanner.nextInt();
            System.out.print("수학 점수: ");
            int mathScore = scanner.nextInt();
        // 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
            students[count] = new Student(grade, classroom, name, koreanScore, englishScore, mathScore);

        // 한 명씩 추가 되었기 때문에 count 1증가
            count++;
        // 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
            System.out.print("계속 입력하시겠습니까? (y/n): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
        // 현재 배열에 담겨있는
        System.out.println("\n현재 기록된 학생들의 정보:");
        // 학생들의 정보를 모두 출력
        for (int i = 0; i < count; i++) {
            students[i].printInfo();
        }
    }
}
