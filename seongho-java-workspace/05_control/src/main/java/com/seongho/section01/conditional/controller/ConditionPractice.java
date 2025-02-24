package com.seongho.section01.conditional.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1(){
        System.out.println("1.입력 2. 수정 3.조회 4.삭제 5.종료");
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴번호입력:");
        int num =sc.nextInt();

        switch (num) {
            case  1 :
                System.out.println("입력메뉴");
                break;
            case  2 :
                System.out.println("수정메뉴");
                break;
            case  3 :
                System.out.println("조회메뉴");
                break;
            case  4 :
                System.out.println("삭제메뉴");
                break;
            case  5 :
                System.out.println("종료메뉴");
                break;
            default:
                System.out.println("바보");
        }
    }
    public void practice2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력:");
        int num = sc.nextInt();

        if (num%2==0 && num>0) {
            System.out.println("짝수요");
        }else if (num%2==1 && num>0){
            System.out.println("홀수");
        }else {
            System.out.println("양수만");
        }
    }
    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수:");
        int ko = sc.nextInt();
        System.out.println("수학점수:");
        int ma = sc.nextInt();
        System.out.println("영어점수:");
        int en = sc.nextInt();

        int gkq = ko+ma+en;
        double vud = gkq /3;

        if (ko>=40&&ma>=40&&en>=40&& vud>=60){
            System.out.println("국: "+ko);
            System.out.println("수: "+ma);
            System.out.println("영: "+en);
            System.out.println("합: "+gkq);
            System.out.println("평: "+vud);

            System.out.println("축");
        }else {
            System.out.println("불");
        }





    }
    public void practice4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12정수입력");
        int num = sc.nextInt();
        String season = "";
        switch (num){
            case 1,2,12 :
                season = "겨울";
                break;
            case 3,4,5 :
                season = "봄";
                break;
            case 6,7,8 :
                season = "여름";
                break;
            case 9,10,11 :
                season = "가을";
                break;
            default: season="잘못입력";

            }
            if (!season.equals("")){
                System.out.print(num+"월은 "+season);
        }else {
                System.out.println(num+"월은 "+season);
            }

    }
    public void practice5(){
        Scanner sc= new Scanner(System.in);
        System.out.print("아이디:");
        String id = sc.nextLine();

        System.out.print("비밀번호:");
        int ps = sc.nextInt();

        if (id.equals("seongho")){


        }
    }
}
