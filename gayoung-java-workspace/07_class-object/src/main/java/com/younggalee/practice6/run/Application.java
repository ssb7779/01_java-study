package com.younggalee.practice6.run;

import com.younggalee.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);
        while(count <= 10){
            System.out.print("학년 입력: ");
            int grade = sc.nextInt();
            sc.nextLine();

            System.out.print("반 입력: ");
            int classNum = sc.nextInt();
            sc.nextLine();

            System.out.print("이름 입력: ");
            String name = sc.nextLine();

            System.out.print("국어 점수 입력: ");
            int korScore = sc.nextInt();
            sc.nextLine();

            System.out.print("영어 점수 입력: ");
            int engScore = sc.nextInt();
            sc.nextLine();

            System.out.print("수학 점수 입력: ");
            int mathScore = sc.nextInt();
            sc.nextLine();

            students[count] = new Student(grade, classNum, name, korScore, engScore, mathScore);

            ++count;

            System.out.println("계속 추가하시겠습니까? (y or n)");
            char yn = sc.nextLine().charAt(0);

            if(yn == 'n') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }


        for(int i=0; i<count;i++){
            int avg = 0;
            avg = (int)((students[i].getKor() + students[i].getEng() + students[i].getMath())/3.0);
            System.out.println(students[i].getInformation() + "    평균점수: " + avg);
        }
    }
}
