package com.seungjoo.practice.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPractice {
    public void practice1() {


        int[] arr = new int[10];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }


    public void practice2() {
        int[] arr = new int[10];
        for (int i = 10; i >= 1; i--) {
            arr[10 - i] = i;
            System.out.print(arr[10 - i] + " ");
        }
        System.out.println();


    }

    public void practice3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수:");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + " ");
        }


    }

    public void practice4() {
        String[] arr = new String[]{"사과”, “귤“, “포도“, “복숭아”, “참외"};
        System.out.println(arr[1]);


    }

    public void practice5() {


        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력:");
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("문자:");
        char c = sc.nextLine().charAt(0);

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == c) {
                cnt++;
            }
        }
        System.out.println(cnt);


    }

    public void practice6() {

        char[] ch = new char[]{'월', '화', '수', '목', '금', '토', '일'};
        Scanner sc = new Scanner(System.in);
        System.out.println("0~6 사이 숫자 입력:");
        int num = sc.nextInt();
        System.out.println(ch[num] + "요일");


    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수:");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("배열" + (i + 1) + "번째 인덱스에 넣을 값:");
            int num1 = sc1.nextInt();
            arr[i] = num1;


        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public void practice8() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("정수:");
            int num = sc.nextInt();
            if (num < 3 || num % 2 == 0) {
                System.out.println("다시 입력하세요.");
            } else {
                int k = 1;
                for (int i = 1; i <= num; i++) {
                    if (i <= num / 2 + 1) {
                        System.out.print(i + ",");


                    } else {
                        if (i != num) {

                            System.out.print(num - i + 1 + ",");

                        } else {
                            System.out.println(num - i + 1);
                        }

                    }

                }
                break;

            }


        } }
    public void practice9() {
        int cnt =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("치킨 이름을 입력하세요:");
        String str = sc.nextLine();
        String[] str_arr = new String[]{"후라이드", "양념"};
        for(int i = 0; i < str_arr.length; i++){
            if(str_arr[i].equals(str)) {
                System.out.println(str + "치킨 배달 가능");
                cnt = 0;
            }
            }
        if(cnt == 1){
            System.out.println(str + "치킨은 없는 메뉴입니다.");
        }

    }


    public void practice10() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호(-포함):");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }
        char[] arr= new char[ch.length];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }


        for (int i = 0; i < ch.length; i++) {
            if(i>=8){
                arr[i] = '*';
            }
        }
        for(char k : arr){
            System.out.print(k);
        }
    }












}

