package com.kyungbae.section03.dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {
    // 2차원 배열
    // * table 구조 (행,열)
    /*
        1.선언
            1) 자료형[][] 배열명;
            2) 자료형 배열명[][];
            3) 자료형[] 배열명[];
         2.생성
           1) new 자료형[y][x]; // y = 행의 크기, x = 열의 크기 == 열의 크기가 같을때
           2) new 자료형[y][]; // 가변배열 : 열의 크기가 다를때 or 나중에 정한다
     */
    public void testDimensionalArray1(){
        // 2차원 배열 선언
        int[][] arr;
        int[] arr1[];
        int arr2[][];

        // 2차원 배열 생성
        arr = new int[3][5];

        System.out.println("행의 길이: " + arr.length); // 3

        System.out.println("0번 행 열의 길이 : " + arr[0].length);
        System.out.println("1번 행 열의 길이 : " + arr[1].length);
        System.out.println("2번 행 열의 길이 : " + arr[2].length);

        /*
            중첩 for문 이용
            바깥쪽 for문 : 행
            안쪽 for문 : 열
         */
        for(int i=0; i<arr.length; i++){ // 행의 길이 만큼

            for(int j=0; j<arr[i].length; j++){ // 각 행에 해당하는 열의 길이만큼
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    } // tDA1end

    public void testDimensionalArray2(){
        /*
             1  2  3  4  5
             6  7  8  9 10
            11 12 13 14 15
         */

        int[][] arr = new int[3][5];

        int count = 0;
        for(int i=0; i<arr.length; i++){
            for ( int j=0; j<arr[i].length; j++){
                arr[i][j] = ++count;
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
//                System.out.print(j + " ");
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
        System.out.println("행 : " + arr);
        for(int[] i: arr){
            System.out.println("열 : " +i);
        }

    } // tDA2 end

    public void testDimensionalArray3(){
        // 2차원 배열 초기화
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
                // \t = tab 추가
            }
            System.out.println();
        }

    } // tDA3 end

    public void testDimensionalArray4(){
        // 가변배열
//        int[][] arr = new int[3][];
//        System.out.println(arr[0]); // null로 초기화

        /*
        arr[0] = new int[2]; // 0행은 2열
        arr[1] = new int[1]; // 1행은 1열
        arr[2] = new int[3]; // 2행은 3열

         */
        int[][] arr = {{1,2},{1,2,3,4},{1}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    } // tDA4 end

    public void testDimensionalArray5() {
        Scanner sc = new Scanner(System.in);
        double[][] darr = new double[2][4];
        for (int i=0; i< darr.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < darr[i].length - 1; j++) {
                System.out.print((i == 0 ? "국어" : "영어") + "점수 : ");
                darr[i][j] = sc.nextDouble();
                // 총점 구하기
                sum += darr[i][j];
            }
            darr[i][3] = sum;
            /*
            if (i == 0) {
                // 국어점수 기록
                for (int j = 0; j < darr[i].length - 1; j++) {
                    System.out.print("국어점수 : ");
                    darr[i][j] = sc.nextDouble();
                }

            } else {
                // 영어점수 기록
                for (int j=0; j<darr[i].length-1; j++) {
                    System.out.print("영어점수 : ");
                    darr[i][j] = sc.nextDouble();
                }
            }

             */

        }
//        System.out.println(Arrays.toString(darr[0]));
//        System.out.println(Arrays.toString(darr[1]));
        // 출력하기
        for (double[] i : darr){
            for(double j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 평균구하기

        System.out.println("국어점수 평균 : " + darr[0][3] / 3);
        System.out.println("영어점수 평균 : " + darr[1][3] / 3);



    } // tDA5 end



} // class end
