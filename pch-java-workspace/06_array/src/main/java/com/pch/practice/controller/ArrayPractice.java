package com.pch.practice.controller;

import java.util.Scanner;

public class ArrayPractice {
    public void practice1(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        for(int i : arr) System.out.print(i+" ");
    }

    public void practice2(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr.length-i;
        }
        for(int i : arr) System.out.print(i+" ");
    }

    public void practice3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void practice4(){
        String[] arr = new String[5];
        arr[0] = "사과";
        arr[1] = "귤";
        arr[2] = "포도";
        arr[3] = "복숭아";
        arr[4] = "참외";
        System.out.println(arr[1]);
    }

    public void practice5(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        int sum = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c){sum++;}
        }
        System.out.println(c+" 개수 : "+sum);
    }

    public void practice6(){
        String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0&&n<arr.length) System.out.println(arr[n]+"요일");
        else System.out.println("잘못된 입력");
    }

    public void practice7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i : arr) System.out.print(i+" ");
        System.out.println();
        System.out.println(sum);
    }

    public void practice8(){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            n = sc.nextInt();
            if(n%2==1&&n>2) break;
            else System.out.println("다시 입력하셈");
        }

        int[] arr = new int[n];
        int val = 1;
        for(int i = 0; i<n; i++){
            if(i<n/2) arr[i] = val++;
            else arr[i] = val--;
        }

        for(int i : arr) System.out.print(i+" ");
    }

    public void practice9(){
        String[] menu = {"후라이드", "양념","순살후라이드","순살양념"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = false;
        for(int i = 0; i<menu.length; i++){
            if(menu[i].equals(s)){
                System.out.println(s+" 배달 가능");
                flag = true;
                break;
            }
        }

        if(!flag) System.out.println(s + " 는 없는 메뉴");
    }

    public void practice10(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10)+1;
        }
        for(int i : arr) System.out.print(i+" ");
    }

    public void practice11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("주번 입력");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        for(int i = 8; i<arr.length; i++){
            arr[i] = '*';
        }

        for(char i : arr) System.out.print(i);
    }
}
