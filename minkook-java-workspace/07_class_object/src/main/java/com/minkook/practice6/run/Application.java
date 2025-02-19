package com.minkook.practice6.run;

import com.minkook.practice6.dto.Student;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.



        Student [] students = new Student[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;	// 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임

        // while(true)을 사용하여 학생들의 정보를 계속 입력 받고
        // 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
        // 한 명씩 추가 되었기 때문에 count 1증가
        // 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
        // 현재 배열에 담겨있는
        // 학생들의 정보를 모두 출력

        while(true) {
            if(count == 10){
                System.out.println("더이상 추가할수 없습니다.");
                break;
            }
            System.out.print("학년: ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반: ");
            int cla = sc.nextInt();
            sc.nextLine();
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("국어점수: ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어점수: ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수: ");
            int math = sc.nextInt();
            sc.nextLine();
            students[count] = new Student(grade, cla, name, kor, eng, math);
            count++;

            System.out.print("계속추가하시겠습니까?(y/n)");
            char c = sc.nextLine().charAt(0);
            int mathSum = 0;
            int korSum = 0;
            int engSum = 0;
            switch(c){
                case 'n':
                    for (int i = 0; i < count; i++) {
                        System.out.println("학년  반  이름  국어  영어  수학");
                        System.out.println(students[i].getInformation());
                        korSum += students[i].getKor();
                        engSum += students[i].getEng();
                        mathSum += students[i].getMath();
                    }
                    System.out.println("총 학생 국어평균: " + (double)(korSum/count));
                    System.out.println("총 학생 영어평균: " + (double)(engSum/count));
                    System.out.println("총 학생 수학평균: " + (double)(mathSum/count));
                    return;
                default:
                    break;
            }
        }
    }
}
