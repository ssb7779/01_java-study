package com.kyungbae.pracice1.run;

import com.kyungbae.pracice1.dto.Employee;
import com.kyungbae.pracice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 학생 정보
        Student[] st = new Student[3];
        st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (Student stu : st){
            System.out.println(stu.toString());
        }

        // 회사 정보
        Scanner sc = new Scanner(System.in);
        Employee[] em = new Employee[10];

        // 회사원 입력
        int count = 0;
        for (int i = 0; i < em.length; i++) {
            em[i] = new Employee();
            System.out.printf("\n사원 입력 (%d/10)\n",i+1);
            System.out.printf("사원%d의 이름: ", i+1);
            em[i].setName(sc.nextLine());
            System.out.printf("사원%d의 나이: ", i+1);
            em[i].setAge(sc.nextInt());
            sc.nextLine();
            System.out.printf("사원%d의 신장: ", i+1);
            em[i].setHeight(sc.nextDouble());
            sc.nextLine();
            System.out.printf("사원%d의 몸무게: ", i+1);
            em[i].setWeight(sc.nextDouble());
            sc.nextLine();
            System.out.printf("사원%d의 급여: ", i+1);
            em[i].setSalary(sc.nextInt());
            sc.nextLine();
            System.out.printf("사원%d의 부서: ", i+1);
            em[i].setDept(sc.nextLine());
            count++;

            System.out.print("\n계속 추가하시겠습니까? : ");
            boolean end = false;
            while (true) {
                char con = sc.nextLine().charAt(0);
                if (con == 'N'|| con == 'n'){
                    System.out.println("입력을 종료합니다.");
                    end = true;
                    break;
                } else if (con == 'Y' || con == 'y') {
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                }

            }
            if (end){
                break;
            }


        } // 사원입력 cycle

        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println(em[i].toString());
        }


    } // main end

} // class end
