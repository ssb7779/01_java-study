package com.ibe6.practice.controller;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class ArrayPractice {
    public void practice1() {
        /*
        길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
         */
        int arr[] = new int[10];
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice2() {
       /*
        길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
       */
        int arr[] = new int[10];
        for (int i=10; i>0; i--) {
            System.out.print(i + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        /*
        길이가 5인 String 배열을 선언하고
        “사과”, “귤“, “포도“, “복숭아”, “참외“로
        초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
         */
        String[] str = new String[5];
        String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(fruits[1]);


    }

    public void practice5 () {
        Scanner sc = new Scanner(System.in);
        /*
        문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
        개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
         */
    }
    public void practice6 () {
        /*
        “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 입력한
        숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
         */
    }

}











