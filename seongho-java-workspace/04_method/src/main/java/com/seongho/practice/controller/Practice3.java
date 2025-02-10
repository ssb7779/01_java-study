package com.seongho.practice.controller;

import java.util.Scanner;

public class Practice3 {
    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String na = sc.nextLine();

        System.out.print("학년(숫자만):");
        int ag =sc.nextInt();
        System.out.print("반(숫자만):");
        int cl =sc.nextInt();
        System.out.print("번호(숫자만):");
        int nu =sc.nextInt();
        System.out.print("성별(M/F):");
        char se = sc.next().charAt(0);
        System.out.print("성적(소둘):");
        double gr = sc.nextDouble();

        System.out.print(ag+"학년 "+cl+"반"+ na+ se+"의 성적은 "+gr);


    }
}
