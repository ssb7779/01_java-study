package com.sotogito.section01.control.controller;

import java.util.Scanner;

public class If {
    public void testBasicIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        }
    }

    /**
     * ## else문 - if문이나 마지막에 추가 -모든 조건에 해당되지 않을경우 처리됨
     */

    public void testBasicElse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("미통과");
        }
    }

    public void testBasicElseIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수");
        int score = sc.nextInt();

        //80 이상 : 합격
        // 60 이상 : 재평가
        //60 미만 : 불합격
        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }

    public void testIFExamole1() {
        /**
         * 1. 나이 입력받기
         * - 13세 이하 : 어린이
         * - 13세 초과 : 청소년
         * - 19세 초과 : 성인
         */

        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("나이 : ");
        int age = sc.nextInt();

        if (age > 19) {
            result = "성인";
        } else if (age > 13) {
            result = "청소년";
        } else {
            result = "어린이";
        }

        System.out.println(result);
    }

    public void testIfExample2() {
        /**
         * 1. 이름, F/M 성별 입력받기
         * 2. xxx님은 x학생입니다. 출력
         *
         */

        Scanner sc = new Scanner(System.in);
        String printout = "%s님은 %c학생입니다.";

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("성별(F/M) : ");
        char gender = sc.next().toUpperCase().charAt(0); //fixme toUpperCase();

        if (gender == 'M') {
            gender = '남';
        } else if (gender == 'F') {
            gender = '여';
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
        }

        System.out.printf(printout, name, gender);
    }

    public void testIfExample3() {
        /**
         * 참조자료형 - 비교대상1.equals(비교대상2);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.nextLine();

        if (name.equals("홍길동")) {
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요");
        }

    }

    public void testNestedIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수(양수) 입력 : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("아님");
        } else {
            if (num % 3 == 0) {
                System.out.println("3의 배수입니다.");
            } else {
                System.out.println("3의 배수가 아닙니다.");
            }
        }
    }

    public void testNestedIfExample1() {
        /**
         * 1. 학년을 입력받는다.
         * 2. 1~3 : 60점이상 ? 합격 : 불합격
         * 2. 4~6 : 70점 이상 ? :합격 : 불합격
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("학년 입력 : ");
        int grade = sc.nextInt();

        System.out.println("점수 입력 : ");
        int score = sc.nextInt();

        int passScore = 0;
        if (grade >= 1 && grade <= 3) {
            passScore = 60;
//            if (score >= passScore) {
//                System.out.println("합격");
//            } else {
//                System.out.println("불합격");
//            }
        } else if (grade >= 4 && grade <= 6) {
            passScore = 70;
//            if (score >= passScore) {
//                System.out.println("합격");
//            } else {
//                System.out.println("불합격");
//            }
        } else {
            System.out.println("존재하지 않는 학년입니다.");
        }

        if (score >= passScore) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }

    public void testNestedIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호 : ");
        String rrn = sc.nextLine();

        if(rrn.length() == 14){
            char genderNumber = rrn.charAt(7);
            if(genderNumber == '1' || genderNumber == '3'){
                System.out.println("남");
            } else if (genderNumber == '2' || genderNumber == '4') {
                System.out.println("여");
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }


}
