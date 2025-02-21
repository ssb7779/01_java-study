package com.seongho.section01.conditional.controller;

import java.util.Scanner;

public class Switch {



    /*
    ##switch
    1. 여러 케이스들 중 실행할 코드를 선택
     */
    public void testBSw(){
        /*
        정수받고 1일경울 빨간색 2파란 3 초록 123이아니면 잘못입력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("1~3입력");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("빨");
                break;
            case 2:
                System.out.println("파");
                break;
            case 3:
                System.out.println("초");
                break;
            default:
                System.out.println("잘못입력");
        }


    }
    public void testSEx1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("사이다,콜라,환타,박카스,핫식스 고르시오");
        String dr = sc.nextLine();

        int pri = 0; //음료가격
        switch (dr){
            case "사이다" :
                pri =500;
                break;
            case "콜라" :
                pri =600;
                break;

            case "환타" :
                pri =700;
                break;

            case "박카스" :
                pri =2000;
                break;

            case "핫식스" :
                pri =50000;
                break;
            default:
                System.out.println("잘못입력");

        }
        if (pri != 0) {
            System.out.println(pri + "원");
        }
    }
    public void testSEx2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f");
        char gen = sc.nextLine().charAt(0);

        String genstr ="";

        switch (gen){
            case 'm':
            case 'M': genstr="남";
                break;
            case 'f':
            case 'F': genstr="여";
                break;

            default:
                System.out.println("잘못입력");
        }
        if (!genstr.equals("")) {
            System.out.println(genstr);
        }
    }
    public void testSEx3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("월:");
        int mon = sc.nextInt();

        switch (mon){
            case 1,3,5,7,8,10,12: System.out.println("31");
            break;
            case 4,6,9,11: System.out.println("30");
            break;
            case 2:
                System.out.println("28 or 29");
                break;
            default :
                System.out.println("잘못입력");
        }


    }
}
