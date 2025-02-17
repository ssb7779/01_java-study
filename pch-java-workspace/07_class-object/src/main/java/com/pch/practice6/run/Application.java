package com.pch.practice6.run;

import com.pch.practice6.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        int studentSum = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("학년을 입력하세요 : ");
            int grade = sc.nextInt();
            System.out.print("반을 입력하세요 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("국어 점수를 입력하세요 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수를 입력하세요 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수를 입력하세요 : ");
            int math = sc.nextInt();

            students.add(new Student(grade, classroom, name, kor, eng, math));

            sc.nextLine();
            System.out.print("학생을 더 추가하시겠습니까?(y/n): ");
            String answer = sc.nextLine();
            if(answer.equals("n")) {break;}
        }

        for(Student s : students) {
            System.out.println(s.getInformation());
        }
    }
}
