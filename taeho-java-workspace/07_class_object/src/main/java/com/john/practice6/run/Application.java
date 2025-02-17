package com.john.practice6.run;

import com.john.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대 10명
        Student[] students = new Student[10];
        int count = 0;

        while(true) {
            System.out.print("Enter a grade: ");
            int grade = sc.nextInt();

            System.out.print("Enter a classroom: ");
            int classroom = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter a name: ");
            String name = sc.nextLine();

            System.out.print("Enter a Korean Score: ");
            int korean = sc.nextInt();

            System.out.print("Enter a English Score: ");
            int english = sc.nextInt();

            System.out.print("Enter an Math Score: ");
            int math = sc.nextInt();
            sc.nextLine();

            students[count] = new Student(grade, classroom, name, korean, english, math);

            count++;

            System.out.print("학생을 더 추가하시겠습니까? (Y/N): ");
            char ch = sc.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                if (count == 10){
                    System.out.println("이미 학생을 최대로 받았습니다. 강제로 종료합니다.");
                    break;
                }
            }
            else if(ch == 'n' || ch == 'N') {
                break;
            }
            else {
                System.out.println("잘못된 입력입니다. 강제로 종료합니다");
                break;
            }
        }

        for (Student student : students) {
            if (student != null) {
                double avg = (double) (student.getKor() + student.getEng() + student.getMath()) / 3;
                System.out.println(student.getInformation());
                System.out.printf("학생의 평균 점수 : %.1f점\n",avg);
                System.out.println("======================");
            }
        }
    }
}
