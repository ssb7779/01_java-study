package com.sotogito.practice6.run;

import com.sotogito.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int macCount = 10;
        Student[] students = new Student[macCount];

        int count = 0;
        while (true){
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            System.out.println("이름 : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("국어점수 : ");
            int korean = sc.nextInt();
            System.out.println("영어점수 : ");
            int english = sc.nextInt();
            System.out.println("수학점수 : ");
            int math = sc.nextInt();

            students[count] = new Student(grade,classroom,name,korean,english,math);
            count++;

            if(count == macCount) { //최대 인원을 다 채웠으면 더이상 입력받지 않음
                break;
            }

            System.out.println("학생을 추가하시겠습니까?");
            sc.nextLine();
            int continueAnswer = sc.nextLine().charAt(0);

            if(continueAnswer == 'n'){
                break;
            }
        }

        for(Student student : students){
            if(student != null){
                System.out.println(student.getInformation());
            }
        }
    }

}
