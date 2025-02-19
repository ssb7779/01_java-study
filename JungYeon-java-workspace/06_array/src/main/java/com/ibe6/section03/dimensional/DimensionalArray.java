package com.ibe6.section03.dimensional;

import java.util.Scanner;

public class DimensionalArray {
    /*
        ## 2차원 배열 ##
        1. 1차원 배열이 여러개 모인 자료구조
           1차원 배열 여러개를 하나의 이름으로 관리할 수 있음
        2. 행과 열의 집합체인 테이블 구조로 생각
        3. 사용되는 인덱스 2개(행, 열)

        ## 배열 선언과 생성 ##
        1. 선언
           1) 자료형[][] 배열명; <= 추천
           2) 자료형 배열명[][];
           3) 자료형[] 배열명[];
        2. 생성(할당)
           1) new 자료형[m][n]; - 길이가 n인 1차원배열이 m개 있는 배열로 생성 (m행n열)
           2) new 자료형[m][]; - 길이가 ?인 1차원배열이 m개 있는 배열로 생성 (m행?열) =>가변배열
     */

    public void testDimensionalArray1() {
        // 2차원 배열 선언

        int arr1[][];
        int[] arr2[];
        int[][] arr;

        // 2차원 배열 생성
        // 배열명 = new 자료형[행크기][열크기];

        arr = new int[3][5];

        System.out.println("행의 길이: " + arr.length); //3
        System.out.println("0번 행 열의 길이: " + arr[0].length); //5
        System.out.println("1번 행 열의 길이: " + arr[1].length); //5
        System.out.println("2번 행 열의 길이: " + arr[2].length); //5

        //바깥쪽 for문 : 행을 지정하는
        //안쪽 for문: 열을 지정하는
        for (int i = 0; i < arr.length; i++) { // i= 0행~2행

            for (int j = 0; j < arr[i].length; j++) { // j= 0열~4열
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void testDimensionalArray2(){
        int[][] arr = new int[3][5];

        // 1  2 3 4 5
        // 6  7 8 9 10
        // 11 12 13 14

        int value = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                //System.out.print(arr[i][j] + " ");
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public void testDimensionalArray3(){
        // 2차원 배열 초기화
        int[][] arr = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15} };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray4(){
        /*
            ## 가변 배열 ##
            행 수는 정해져있으나 각 행에 대한 열의 수가 정해지지 않은 상태
         */

        int[][] arr = { {1, 2}, {3}, {4, 5, 6}};

        arr[0] = new int[2]; // 0행은 2열
        arr[1] = new int[1]; // 1행은 1열
        arr[2] = new int[3]; // 2행은 3열

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();

        }

    }

    public void testDimensionalArray5() {
            /*
            3명의 국어점수 영어점수 입력받아
            2차원 double배열(2행 4열)의 형태로 저장
            이때 매번 사용자에게 입력받아
            첫번쨰행 국어점수 두번째행 영어점수 기록
            각 행의 마지막열에는 각 언어별 총점
            국어 국어 국어 "국어총점"
            영어 영어 영어 "영어총점"
            2차원 배열에 모든 요소 순차적 출력
            국어 평균, 영어 평군 점수도 출력
             */

        Scanner sc = new Scanner(System.in);

        double[][] arr = new double[2][4];

        for (int i=0; i<arr.length; i++){
            // 한 행 시작
            double sum = 0.0; // 해당 행의 입력 점수값의 총합을 기록하기 위한 변수
            for(int j=0; j<arr[i].length-1; j++){ //j=0~2
                /*
                if(i == 0) {
                    System.out.print("국어점수: ");
                }else {
                    System.out.print("영어점수: ");
                }
                */
                System.out.print((i== 0 ? "국어" : "영어") + " 점수: ");
                arr [i][j] = sc.nextDouble();
                sum += arr[i][j];
            }
            arr[i][3] = sum; // 해당 행의 입력작업이 다끝나면 직접 마지막열을 선택해서 총점 기록
            // 한 행 끝
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("국어점수 평균 : " + arr[0][3] / 3);
        System.out.println("영어점수 평균 : " + arr[1][3] / 3);


    }
}
