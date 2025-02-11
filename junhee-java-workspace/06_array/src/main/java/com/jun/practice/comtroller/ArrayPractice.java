package com.jun.practice.comtroller;

import java.util.Scanner;

public class ArrayPractice {

    public void practice1(){

        int[]arr = new int[10];

        int num=1;
        for(int i=1; i<11; i++){
            System.out.print(i + " ");
        }


    }

    public void practice2(){

        int [] arr = new int[10];



        for(int i=0; i<arr.length; i++){
            arr[i] = arr.length-i;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

    public  void practice3(){

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수: ");
        int num = sc.nextInt();

        int[]arr = new int[num];



        for(int i=0; i < num; i++){
            arr[i]=i+1;

        }
        for(int i=0; i < num; i++){
            System.out.print(arr[i] +  " ");
        }

    }

    public void practice4(){
        String[] fruit = new String[5];

        fruit[0] ="사과";
        fruit[1] ="귤";
        fruit[2] ="포도";
        fruit[3] ="복숭아";
        fruit[4] ="참외";

        String[] str = {"사과","귤","포도","복숭아","참외"};

        System.out.print(fruit[1]);


    }

    public void practice5(){

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String str1 = sc.nextLine();

        System.out.print("문자:" );
        String str2 = sc.nextLine();


        char[]ch = new char[str1.length()];

        




    }
}
