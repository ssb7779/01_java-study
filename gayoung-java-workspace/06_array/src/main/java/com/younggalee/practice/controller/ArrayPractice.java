package com.younggalee.practice.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public void practice1() {
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for (int i=arr.length-1; i>=0; i--){
            arr[i] = i+1;
        }
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i=0; i<num; i++){
            arr[i] = i+1;
        }

        for (int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4() {
        String[] fruits = new String[5];
        fruits[0] = "사과";
        fruits[1] = "귤";
        fruits[2] = "포도";
        fruits[3] = "복숭아";
        fruits[4] = "참외";

        System.out.println(fruits[1]);
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char a = sc.nextLine().charAt(0);

        int count = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == a){
                count++;
            }
        }
        System.out.println("i 개수 : " + count);
    }
    public void practice6() {
        String[] day = {"월","화","수","목","금","토","일"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        int index = sc.nextInt();

        if (index >= 0 && index <=6){
            System.out.println(day[index] + "요일");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int sum = 0;

        for (int i=0 ; i<length; i++){
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        for (int i=0 ; i<length; i++){
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n총 합 : " + sum);
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수 : ");
            int num = sc.nextInt();
            int[] arr = new int[num];
            String result = "1";

            if (num >= 3 && num % 2 == 1) {
                for (int i = 0; i < num; i++) {
                    if (i < num / 2 + 1) {
                        arr[i] = i + 1;
                    } else {
                        arr[i] = num - i;
                    }
                }
                for (int i = 1; i < num; i++) {
                    result = result + ", " + arr[i];
                }
                System.out.println(result);
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String chickenName = sc.nextLine();

        switch(chickenName){
            case "양념", "간장", "오리지널":
                System.out.println(chickenName + "치킨 배달 가능");
                break;
            default:
                System.out.println(chickenName + "치킨은 없는 메뉴입니다.");
        }
    }

    public void practice10() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함) : ");
        String personalNum = sc.nextLine();

        char[] original = new char[personalNum.length()];
        for (int i = 0; i<personalNum.length(); i++){
            original[i] = personalNum.charAt(i);
        }

        char[] copyArr = new char[original.length];
        for (int i = 0; i<original.length; i++){
            if (i>7){
                copyArr[i] = '*';
            } else {
                copyArr[i] = original[i];
            }
        }
        for (int i = 0; i<copyArr.length; i++) {
            System.out.print(copyArr[i]);
        }

    }
    public void practice12() {
        int[] arr = new int[10];
        int[] table = new int[10];

        for (int i=0; i<10 ; i++) {
            while (true) {
                int random = (int) (Math.random() * 10 + 1);
                if (table[random-1] == 0) {
                    table[random-1] = 1;
                    arr[i] = random;
                    break;
                }
            }
        }
        for (int i=0; i<10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int lenOfArray = sc.nextInt();
        sc.nextLine();

        String[] original = new String[lenOfArray];
        String[] result;

        for(int i=0; i<lenOfArray; i++){
            System.out.printf("%d번째 문자열 : ", i+1);
            original[i] = sc.nextLine();
        }
        result = original;
        
        while(true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            String more = sc.nextLine();
            if (more.equals("y") || more.equals("Y")) {
                System.out.print("더 입력하고 싶은 개수 : ");
                int additionalLen = sc.nextInt();
                sc.nextLine();
                lenOfArray += additionalLen;

                String[] upgradeArr = Arrays.copyOf(original, lenOfArray);

                for (int i = lenOfArray; i < upgradeArr.length; i++) {
                    System.out.printf("%d번째 문자열 : ", i+1);
                    upgradeArr[i] = sc.nextLine();
                }
                result = upgradeArr;

            } else if (more.equals("n") || more.equals("N")) {
                System.out.println(Arrays.toString(result));
                break;
                int n = 0;

//                seasions[n/3%4]
            }
        }
    }

}






























