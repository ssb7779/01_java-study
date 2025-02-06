package com.kyungbae.practice.controller;

import java.util.Scanner;

public class PracController {

    public void practice1() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "이름을 입력하세요 : "
        );
        String name = sc.nextLine();

        System.out.print(
                "나이를 입력하세요 : "
        );
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print(
                "성별을 입력하세요(남/여) : "
        );
        char gender = sc.nextLine().charAt(0);


        System.out.print(
                "키를 입력하세요(cm) : "
        );
        double height = sc.nextDouble();

        System.out.printf(
                "키 %.1f인 %d살 %c자 %s님 반갑습니다^^"
                , height, age, gender, name
        );


    } // p1 end

    public void practice2() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "문자열을 입력하세요 : "
        );
//        sc.nextLine();
        String name = sc.nextLine();

        System.out.println(
                "첫 번째 문자 : " + name.charAt(0)
        );

        System.out.println(
                "두 번째 문자 : " + name.charAt(1)
        );

        System.out.println(
                "세 번째 문자 : " + name.charAt(2)
        );


    } // p2 end

    public void practice3() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "이름 : "
        );
        String name = sc.nextLine();

        System.out.print(
                "학년(숫자만) : "
        );
        int grade = sc.nextInt();

        System.out.print(
                "반(숫자만) : "
        );
        int classroom = sc.nextInt();

        System.out.print(
                "번호(숫자만) : "
        );
        int num = sc.nextInt();

        sc.nextLine();

        System.out.print(
                "성별(M/F) : "
        );
        char gender =(
                 sc.nextLine().charAt(0)
        );
        char korGender = (
                gender == 'm' || gender == 'M' ? '남' : '여'
                );

        System.out.print(
                "성적(소수점 아래 둘째 자리까지) : "
        );
        double score = sc.nextDouble();

        System.out.printf(
                "%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다."
                , grade, classroom, num, name, korGender, score
        );


    } // p3 end

    public void practice4() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "주민번호를 입력하세요(-포함) : "
        );
        char gender = sc.nextLine().charAt(7);
        String korGender = (
                (gender == '1') || (gender =='3') ? "남" :
                        ((gender == '2') || (gender == '4') ? "여" : "오류")
        );

        System.out.println(korGender + '자');

    } // p4 end

    public void practice5() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "정수1 : "
        );
        int num1 = sc.nextInt();

        System.out.print(
                "정수2 : "
        );
        int num2 = sc.nextInt();

        System.out.print(
                "비교값 : "
        );
        int asd = sc.nextInt();
        boolean ert = asd <= num1 || asd > num2;
        System.out.println(ert);


    } // p5 end

    public void practice6() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "정수1 : "
        );
        int num1 = sc.nextInt();

        System.out.print(
                "정수2 : "
        );
        int num2 = sc.nextInt();

        System.out.print(
                "정수3 : "
        );
        int num3 = sc.nextInt();

        boolean result = (num1 == num2) == (num2 == num3) == (num1 ==num3);

        System.out.println(
                result
        );

    } // p6

    public void practice7() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "점수 : "
        );
        int score = sc.nextInt();
        String result = score >= 90 && score < 100 ? "축하합니다" : "분발하세요";
        System.out.println(result);

    } // p7 end


} // class end
