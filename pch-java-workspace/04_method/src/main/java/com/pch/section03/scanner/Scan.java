package com.pch.section03.scanner;

import java.util.Scanner;

public class Scan {
    public void testWariningCase1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주소 입력 : ");
        String address = sc.next();

        System.out.print("나이 입력");
        int age = sc.nextInt();

        System.out.println(address);
        System.out.println(age);
    }
}
