package com.minkook.practice.controller;

import java.util.Scanner;

public class ArrayPractice {
    public void practice1(){
        int [] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = arr[i] + (i+1);
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2(){
        int [] arr = new int[10];

        for(int i = 9; i >=0; i--){
            arr[i] = arr[i] + (i+1);
        }

        for(int i = 9; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("양의정수: ");
        int num = sc.nextInt();

        int [] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + (i+1);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4(){
        String [] arr = new String[5];
        arr  = new String[]{"사과","귤","포도","복숭아","참외"};

        System.out.println(arr[1]);

    }

    public void practice5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String str = sc.nextLine();

        System.out.print("문자: ");
        char ch = sc.nextLine().charAt(0);
        char[] arr = new char[str.length()];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }

        for(int i = 0; i < arr.length; i++){
            if(ch == arr[i]){
                count++;
            }
        }
        System.out.print(ch + "개수: " + count);

    }

    public void practice6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("0 ~ 6 사이 숫자 입력 :");
        int num = sc.nextInt();

        if(num > 6 || num < 0){
            System.out.println("잘못 입력하셨습니다.");

        }else {
            String [] week = new String[]{"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
            for(int i = 0; i < week.length; i++){
                if(num == i){
                    System.out.println(week[i]);
                }
            }
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int temp = num;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + (temp - 1);
            temp--;

        }

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 1){
                System.out.print("-" + arr[i]);
            }else if(i % 2 == 0){
                System.out.print(arr[i]);
            }
            System.out.print(" ");
        }


    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("다시 입력하세요.");
        }
        if(num > 0){
            if(num % 2 == 0){
                System.out.println("다시 입력하세요.");
            }
        }
        int mid = num / 2;
        int idx2 = 0;

        for(int i = 0; i < num; i++){
            idx2 = i;
            if(i <= mid){
                System.out.print((i+1) + " ");
            }else{
                idx2--;
                System.out.print((idx2+1) -1 + " ");
            }

        }



    }
}
