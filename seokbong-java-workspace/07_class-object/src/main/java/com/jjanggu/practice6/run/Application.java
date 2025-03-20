package com.jjanggu.practice6.run;

import com.jjanggu.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student stu[] = new Student[10];
        int count = 0;

        while(true) {

            System.out.print(" 학년 : ");
            int grade = sc.nextInt();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            stu[count++] = new Student(grade, classroom, name, kor, eng, math);

            System.out.println("계속 추가하시겠습니까?(y/n)");
            String str = sc.nextLine().toUpperCase();

            if (str.equals("N")) {
                break;
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println(stu[i].getInformation());
        }



    }
}
