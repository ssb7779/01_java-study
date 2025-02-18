package com.seungjoo.practice6.run;

import com.seungjoo.practice6.dto.Student;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Application {
    public static void main(String[] args) {


        int count = 0;

        Student[] students = new Student[10];
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.println("학년 : ");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("반 :");
            int num2 = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : ");
            String str1 = sc.nextLine();
            System.out.println("국어 점수 : ");
            int num3 = sc.nextInt();
            sc.nextLine();
            System.out.println("영어 점수 : ");
            int num4 = sc.nextInt();
            sc.nextLine();
            System.out.println("수학 점수 : ");
            int num5 = sc.nextInt();
            sc.nextLine();
            students[count] = new Student(num1, num2, str1, num3, num4, num5);
            count++;
            if(count == students.length) {
                break;
            }
            System.out.println("계속 추가할건가요?");
            char answer = sc.nextLine().charAt(0);
            if (answer == 'n') {
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getInformation());

        }
    }

}
