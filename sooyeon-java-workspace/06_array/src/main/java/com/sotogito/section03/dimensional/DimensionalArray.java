package com.sotogito.section03.dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {
    /**
     * 2차원 배열
     * 1. 1차월 배열이 여러개 담긴 배열
     * 2. 행과 열의 테이블형태
     * 3. 사용되는 인덱스 2개 - 행, 열
     * <p>
     * 자료형[][] 배열명;
     * 자료형 배열명[][];
     * 자료형[] 배열명[];
     * <p>
     * new 자료형[행][열];
     * new 자료형[행][ ]; - 열의 크기가 같을 필요 없음
     * <p>
     * stack       heap
     * [행 주소]   [열주소] [1,2,3,4,5]
     * [열주소] [2.3,4,5,6]
     * [열주소] [2.3,4,5,6]
     */

    public void test1() {
        int arr[][];
        int[] arr2[];
        int arr3[][];

        arr = new int[3][5];
        System.out.println("행의 길이" + arr.length);//3
        System.out.println("열의 길이" + arr[0].length);//5

        //바깥 : 행
        //안 : 열
        for (int i = 0; i < arr.length; i++) {
            int[] nowArr = arr[i];
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.print(arr[i][j]);
                System.out.print(nowArr[j]);
            }
            System.out.println();
        }
    }

    public void test2() {
        int[][] arr = new int[3][5];

        int num = 1;
        for (int[] line : arr) {
            for (int i = 0; i < line.length; i++) {
                line[i] = num++; //fixme 대입후 바로 증감
            }
        }

        for (int[] line : arr) {
            for (int value : line) {
                System.out.printf("%-2d ", value);
            }
            System.out.println();
        }
    }

    public void test3() {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void test4() {
        /**
         * 가변길이
         * 열의 길이가 다름
         */

        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];

        for (int[] line : arr) {
            for (int num : line) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public void test5() {
        Scanner sc = new Scanner(System.in);
        double[][] record = new double[2][4];


//        double mathSum = 0;
//        for (int i = 0; i < record[0].length-1; i++) {
//            System.out.println("국어점수를 입력하세요 : ");
//            record[0][i] = sc.nextDouble();
//            mathSum += record[0][i];
//        }
//        record[0][record[0].length - 1] = mathSum;
//
//
//        double englishSum = 0;
//        for (int i = 0; i < record[1].length - 1; i++) {
//            System.out.println("영어점수를 입력하세요 : ");
//            record[1][i] = sc.nextDouble();
//            englishSum += record[1][i];
//        }
//        record[1][record[1].length - 1] = englishSum;


        for (int i = 0; i < record.length; i++) {
            String sub = "";
            int sum = 0;
            if (i == 0) {
               sub = "수학";
            } else if (i == 1) {
                sub = "영어";
            }

            for (int j = 0; j < record[i].length - 1; j++) {
                System.out.printf("%s점수를 입력해주세요 : ",sub);
                record[i][j] = sc.nextDouble();
                sum += record[i][j];
            }
            record[i][record[i].length - 1] = sum;
        }

        double mathAvg = record[0][record[0].length - 1] / 3;
        double englishAvg = record[1][record[1].length - 1] / 3;

        for (double[] subject : record) {
            String subjectPrintout = "";
            for (double score : subject) {
                subjectPrintout += score + "\t";
            }
            System.out.println(subjectPrintout);
            System.out.println();
        }

        System.out.printf("수학 평균 %.2f\n" , mathAvg);
        System.out.printf("영어 평균 %.2f\n" , englishAvg);

    }

}
