package com.seongho.practice.controller;

import java.util.Scanner;

public class Practice2 {
    public void practice2(){
        Scanner sc = new Scanner(System.in);
            System.out.print("문자열입력:");
            String str = sc.nextLine();

            char f = str.charAt(0);
            char c = str.charAt(1);
            char t = str.charAt(2);
            System.out.println("첫:" + f);
            System.out.println("둘:" + c);
            System.out.println("셋:" + t);


    }

}
