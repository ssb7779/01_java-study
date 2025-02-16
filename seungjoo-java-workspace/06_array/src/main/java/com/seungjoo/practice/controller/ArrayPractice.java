package com.seungjoo.practice.controller;

import java.sql.SQLOutput;
import java.util.Arrays;
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
    public void practice12() {
        int k = 0;
        int[] arr = new int[10];

        int num1 = (int) (Math.random() * 10 + 1);
        arr[k++] = num1;

        while(k < arr.length) {
            int num = (int) (Math.random() * 10 + 1);
            boolean isDuplicate = false;

            for (int i = 0; i < k; i++) {
                if (arr[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[k++] = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요:");
        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[num];
        System.out.println("1번째 문자열:");
        String str1 = sc.nextLine();
        System.out.println("2번째 문자열:");
        String str2 = sc.nextLine();
        System.out.println("3번째 문자열:");
        int k = num;
        String str3 = sc.nextLine();
        arr[0] = str1;
        arr[1] = str2;
        arr[2] = str3;
        while(true) {
            System.out.println("더 값을 입력하시겠습니까?(Y/N):");
            String str4 = sc.nextLine();
            if(str4.equals("y")) {
                System.out.println("더 입력하고 싶은 개수:");
                int num1 = sc.nextInt();
                sc.nextLine();
                arr = Arrays.copyOf(arr, arr.length+num1 );
                for (int i = 1; i <= num1; i++) {
                    System.out.println(k + 1 + "번쨰 문자열:");
                    String str5 = sc.nextLine();
                    arr[k] = str5;
                    k++;
                }

            }else if(str4.equals("n")){
                System.out.println(Arrays.toString(arr));
                break;
            }


        }


    }
    public void practice14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int month = sc.nextInt();

        String[] seasons = {"겨울", "봄", "여름", "가을"};

        System.out.println(seasons[month/3]);}

    public void practice15() {

        int[] a = {10, 20, 30, 0, 0, 0};
        int[] b = {40, 50, 60};
        System.arraycopy(b, 0,a,3,3);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }








    }












