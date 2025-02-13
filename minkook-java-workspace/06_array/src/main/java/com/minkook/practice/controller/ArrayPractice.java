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
        sc.nextLine();

        int[] arr = new int[num];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print("배열 " + i +"번째 인덱스에 넣을값: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];


        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("총합: " +sum);
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
        int [] arr = new int[num];
        int mid = (num / 2);

        for(int i = 0; i<arr.length; i++){
            if(i <= mid) {
                System.out.print((i+1));
            } else if(i > mid){
                System.out.print(mid);
                mid--;
            }

        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String [] chiken = new String[]{"양념","불닭"};
        System.out.print("치킨 이름을 입력하세요: ");
        String input = sc.nextLine();


        for(int i = 0; i < chiken.length; i++){
            if(input.equals(chiken[i])){
                System.out.println(input + "치킨 배달가능");
                break;
            }else {
                System.out.println(input + "은 없는치킨");
                break;
            }
        }

    }
    public void practice10() {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public void practice11() {
        Scanner sc = new Scanner(System.in);
        char [] jumin = new char[14];
        char [] copyJumin;

        System.out.print("주민등록번호(-포함): ");
        String num = sc.nextLine();

        for(int i = 0; i < num.length(); i++){
            jumin[i] = num.charAt(i);
        }
        copyJumin = jumin.clone();

        for(int i = 0; i < copyJumin.length; i++){
            if(i > 7 && i < 15){
                copyJumin[i] = '*';
            }
        }
        System.out.println(jumin);
        System.out.println(copyJumin);


    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];


        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 +1);
        }
        int[] temp = arr;

    }
}
