package com.jjanggu.secton01.conditional.controller;
import java.util.Scanner;

public class ConditionPractice {

    public void practice1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();

        switch(num){
            case 1 :
                System.out.println("입력 메뉴입니다.");
                break;
            case 2 :
                System.out.println("수정 메뉴입니다.");
                break;
            case 3 :
                System.out.println("조회 메뉴입니다.");
                break;
            case 4 :
                System.out.println("삭제 메뉴입니다.");
                break;
            case 5 :
                System.out.println("프로그램이 종료됩니다.");
                break;
        }

    }

    public void practice2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0){
            if(num % 2 == 0){
                System.out.println("짝수다");
            }else{
                System.out.println("홀수다");
            }
        }else{
            System.out.println("양수만 입력해주세요.");
        }

    }

    public void practice3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수 : ");
        int kscore = sc.nextInt();
        System.out.println("수학점수 : ");
        int mscore = sc.nextInt();
        System.out.println("영어점수 : ");
        int escore = sc.nextInt();

        int sum = kscore + mscore + escore;
        double average = sum/3;



        if(kscore >= 40 && mscore >= 40 && escore >=40) {
            if(average >=60) {
                System.out.println("국어점수 : " + kscore);
                System.out.println("수학점수 : " + mscore);
                System.out.println("영어점수 : " + escore);
                System.out.println("합계 : " + sum);
                System.out.println("평균 : " + average);
                System.out.println("축하합니다, 합격입니다!");
            }else{
                System.out.println("불합격입니다.");
            }
        }
    }

    public void practice4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt();

        switch(month) {
            case 1, 2, 12 :
                System.out.println("겨울");
                break;
            case 3, 4, 5 :
                System.out.println("봄");
                break;
            case 6, 7, 8 :
                System.out.println("여름");
                break;
            case 9, 10, 11 :
                System.out.println("가을");
                break;
            default :
                System.out.println("잘못 입력된 달");
        }

    }





    public void practice5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("===로그인===");
        System.out.println("아이디   : ");
        String id = sc.nextLine();

        System.out.println("비밀번호 : ");
        int password = sc.nextInt();

        // 컴퓨터에 저장된 아이디(..?),비밀번호(int) 만들기

        switch(id){
            case "jjanggu" :
                if(password == 123456){
                    System.out.println("로그인 성공");
                }else{
                    System.out.println("비밀번호가 틀렸습니다.");
                }
                break;

            default:
                System.out.println("아이디가 틀렸습니다.");
        }


    }


    public void practice6() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
    }

}
