package com.inyong.practice6.run;

import com.inyong.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10]; // 최대 10명의 학생 정보를 저장할 배열
        int count = 0; // 학생 수

        while (true) {
            if (count >= 10) {
                System.out.println("더 이상 학생을 추가할 수 없습니다.");
                break;
            }

            System.out.println("\n학생 정보를 입력하세요.");
            System.out.print("학년: ");
            int grade = sc.nextInt();
            System.out.print("반: ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("국어 점수: ");
            int kor = sc.nextInt();
            System.out.print("영어 점수: ");
            int eng = sc.nextInt();
            System.out.print("수학 점수: ");
            int math = sc.nextInt();


            students[count] = new Student(grade, classroom, name, kor, eng, math);
            count++;


            System.out.print("계속 추가하시겠습니까? (y/n): ");
            char answer = sc.next().charAt(0);
            if (answer == 'n' || answer == 'N') {
                break;
            }
        }

        sc.close();

        System.out.println("\n등록된 학생 목록:");
        for (int i = 0; i < count; i++) {
            System.out.print(students[i].getInformation());
            System.out.println(" 평균 점수" + (students[i].getEng()+students[i].getKor()+students[i].getMath()) / 3);
        }
    }
}