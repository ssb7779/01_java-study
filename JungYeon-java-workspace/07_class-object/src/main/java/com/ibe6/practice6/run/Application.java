package com.ibe6.practice6.run;

import com.ibe6.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
        최대 10명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고
        반복문을 사용하여 학생 정보를 입력 받도록 구현하시오.
        아래의 사용데이터를 참고하여 3명 정도의 학생 정보를 입력 받아,
        각 객체에 저장한 뒤 현재 기록된 학생들의 정보와 각 학생의 평균 점수를 출력하시오.



         */
        Scanner sc = new Scanner(System.in);
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        Student[] student = new Student[10];
        int count = 0;
        while (true) {
            // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임
            // while(true)을 사용하여 학생들의 정보를 계속 입력 받고
            // 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
            // 한 명씩 추가 되었기 때문에 count 1증가
            for (int i = 0; i < student.length; i++) {
                System.out.print("학년: ");
                int grade = sc.nextInt();
                System.out.print("반: ");
                int classRoom = sc.nextInt();
                sc.nextLine();
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("국어점수: ");
                int kor = sc.nextInt();
                System.out.print("영어점수: ");
                int eng = sc.nextInt();
                System.out.print("수학점수: ");
                int math = sc.nextInt();
                sc.nextLine();

                student[count] = new Student(grade, classRoom, name, kor, eng, math);
                System.out.println(student[count].getInformation());
                count++;
                if (i < student.length - 1) {
                    System.out.print("계속 추가하시겠습니까?(y/n): ");
                    char answer = sc.nextLine().charAt(0);
                    if (answer == 'n') {
                        break;
                    } else if (answer == 'y') {
                    }
                }
            }

            double totalSum = 0;
            for (int i = 0; i < count; i++) {
                int sum = student[i].getKor() + student[i].getEng() + student[i].getMath();
                double average = sum / 3.0;
                System.out.println(student[i].getName() + "의 평균 점수: " + average);
                totalSum += average;
                // 현재 배열에 담겨있는
                // 학생들의 정보를 모두 출력

            }

        }
    }
    }


