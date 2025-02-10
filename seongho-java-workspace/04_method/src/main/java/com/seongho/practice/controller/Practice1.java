package com.seongho.practice.controller;

import java.util.Scanner;

public class Practice1 {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String name = sc.nextLine();

        System.out.print("성별:");
        char sex = sc.next().charAt(1);

        System.out.print("나이:");
        int age = sc.nextInt();

        System.out.print("키:");
        double hig = sc.nextDouble();

        System.out.println("키 " +hig + age +"살" + sex + name+"님");
    }
}
