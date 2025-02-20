package com.sh.practice.practice6.run;

import com.sh.practice.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("학년입력");
            int grade = sc.nextInt();
            System.out.println("반입력");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.println("이름");
            String newStu = sc.nextLine();
            System.out.println("국어");
            int kor = sc.nextInt();
            System.out.println("영어");
            int eng = sc.nextInt();
            System.out.println("math");
            int math    = sc.nextInt();
            sc.nextLine();
            stu[count] = new Student(grade, classroom, newStu,kor,eng,math);


            System.out.print("더?");
            String more = sc.nextLine();
            count++;
            if (more.equals("n")) {
                break;
            }
        }

        for(int i = 0; i<count; i++){
            System.out.println(stu[i].getInformation());
        }
    }
}