package com.minkook.section03.dimensional;

import java.util.Scanner;

public class DimensionalArray {
    /*
        ## 2차원 배열 ##
        1. 1차원 배열이 여러개 모인 자료구조
            1차원 배열 여러개를 하나의 이름으로 관리할 수 있음
        2. 행과 열의 집합체인 테이블 구조로 생각
        3. 사용되는 인덱스 2개(행,열)
        
        ## 배열생성과 선언##
        1. 선언
            1) 자료형[][] 배열명; --추천
            2) 자료형 배열명[][];
            3) 자료형[] 배열명[];
        2. 생성(할당)
        1) new 자료형[m][n] - 길이가 n인 1차원 배열이 m개 있는 배열로 생성(m행n열)
        2) new 자료형[m][]; - 길이가 ?인 1차원배열이 m개 있는 배열로 생성(m행?열) => 가변배열
     */
    public void testDimensionalArray1(){
        int arr1[][];
        int[] arr2[];
        int[][] arr;

        //2차원 배열 생성
        //배열명 = new 자료형[행크기][열크기]
        arr = new int[3][5];

        System.out.println("행의 길이:" +arr.length);

        System.out.println("0행의 열의길이:" +arr[0].length);
        System.out.println("1행의 열의길이:" +arr[1].length);
        System.out.println("2행의 열의길이:" +arr[2].length);

        for(int i = 0; i<arr.length; i++){
            System.out.println();
            for(int j = 0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public void testDimensionalArray2(){
        int arr1[][];
        int[] arr2[];
        int[][] arr;

        //2차원 배열 생성
        //배열명 = new 자료형[행크기][열크기]
        arr = new int[3][5];


        int value = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                arr[i][j] = value;
                value += 1;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println();
            for(int j = 0; j <arr[i].length; j++){
                System.out.printf("%2d ",arr[i][j]);
            }
        }
    }

    public void testDimensionalArray3(){
        int [][] arr = {
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15}
                        };

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){

            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println();
            for(int j = 0; j <arr[i].length; j++){
                System.out.printf("%2d ",arr[i][j]);
            }
        }
    }

    public void testDimensionalArray4(){
        /*
            ## 가변 배열 ##
            행 수는 정해져 있으나 각 행에 대한 열의수가 정해지지 않은 상태
         */
        int [][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];

        for(int i = 0; i<arr.length; i++){
            System.out.println();
            for(int j = 0; j <arr[i].length; j++){
                System.out.printf("%2d ",arr[i][j]);
            }
        }
    }

    public void testDimensionalArray5(){
        double [][] arr = new double[2][4];
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length - 1; j++){
                if(i == 0){
                    System.out.print("국어점수");
                    arr[i][j] = sc.nextDouble();
                    sum += arr[i][j];
                    arr[0][3] = sum;


                }
            }
        }
        double avg1 = (sum/2);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[1].length - 1; j++){
                if(i == 1){
                    sum = 0.0;
                    System.out.print("영어점수");
                    arr[i][j] = sc.nextDouble();
                    sum += arr[i][j];
                    arr[1][3] = sum;
                }
            }
        }
        double avg2 = (sum/2);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("국어평균: " + avg1);
        System.out.println("영어평균: " + avg2);
    }
}
