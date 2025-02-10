package com.jun.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    public void practice1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요: ");
        int num = sc.nextInt();

        if(num >= 1) {
        for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
            System.out.println();
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice2(){


    }


}
