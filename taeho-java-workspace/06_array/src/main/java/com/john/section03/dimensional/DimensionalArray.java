package com.john.section03.dimensional;

import java.util.Scanner;

/*
    ## 2차원 배열
    1. 1차원 배열이 여러개 모인 자료구조
    2. 선언
        2.1. {type}[][] arrName;
        2.2. {type} arrName[][];
        2.3. {type}[] arrName[];
    3. 할당
        3.1. new {type}[m][n] - 길이가 n인 1차원 배열이 m개 있는 배열 생성
        3.2. new {type}[m][] - 길이를 알 수 없는 1차원 배열이 m개 있는 배열생성 => 가변배열
 */
public class DimensionalArray {
    public void testDimensionalArray1() {
        //선언
        int arr1[][];
        int[] arr2[];
        int[][] arr3;

        //생성
        arr3 = new int[3][5];

        System.out.println("행의 길이:" + arr3.length);

        System.out.println("0번 행 열의 길이: " + arr3[0].length);
        System.out.println("1번 행 열의 길이: " + arr3[1].length);
        System.out.println("2번 행 열의 길이: " + arr3[2].length);

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j] + " ");
            }
        }
    }

    public void testDimensionalArray2() {
        int[][] arr = new int[3][5];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[0][3] = 4;
//        arr[1][0] = 5;
//        arr[1][1] = 6;
//        arr[1][2] = 7;
//        arr[1][3] = 8;
//        arr[2][0] = 8;
//        arr[2][1] = 9;
//        arr[2][2] = 10;
//        arr[2][3] = 11;
//        arr[2][4] = 12;
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = val;
                val++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public void testDimensionalArray3() {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%2d ", arr[i][j]);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray4() {
        /*
            ## 가변 배열 - 행 수는 정해져있으나 행에 대한 열의 개수가 정해지지 않은 상태
         */

        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray5() {
        Scanner sc = new Scanner(System.in);
        double[][] doubleArr = new double[2][4];
        for (int i = 0; i < doubleArr.length; i++) {
            double sum = 0;
            for (int j = 0; j < doubleArr[i].length - 1; j++) {
                System.out.print((i == 0 ? "국어" : "영어") + "점수: ");
                doubleArr[i][j] = sc.nextDouble();
                sum += doubleArr[i][j];
            }
            doubleArr[i][3] = sum;
        }

        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                System.out.print(doubleArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("국어점수 평균: " + (doubleArr[0][3] / 3));
        System.out.println("영어점수 평균: " + (doubleArr[1][3] / 3));
    }
}