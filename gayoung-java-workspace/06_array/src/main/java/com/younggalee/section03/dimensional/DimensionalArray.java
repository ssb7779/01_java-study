package com.younggalee.section03.dimensional;
import java.util.Arrays;
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
        1) 자료형[][] 배열명; *******
        2) 자료형 배열명[][];
        3)자료형[] 배열명[];
     2. 생성(할당)
        new 자료형[행m][열n];
        new 자료형[m][]; //길이가 ?인 1차원 배열이 m개 있는 배열 생성 (가변배열)
     */

    public void testDimensionalArray1(){
        int arr[][];
        arr = new int[3][5];
        System.out.println("행의 길이 : " + arr.length);
        System.out.println("0번 행 열의 길이 : " + arr[0].length);

        // 바깥쪽 for문 : 행을 지정
        // 안쪽 for문 : 열을 지정

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void testDimensionalArray2(){
        int[][] arr = new int[2][4];
        int value = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; i++){
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; i++){
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }

    }

    public void testDimensionalArray3(){
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray4(){
        /*
        ## 가변 배열 ##
        행 수는 정해져있으나 각 행에 대한 열의 수가 정해지지 않은 상태
         */
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];


        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; i++){
                System.out.println();
            }
        }

    }
    //*****************
    // 참조 자료형 변수는 데이터가 저장된 메모리 주소를 저장한다. class, 배열, 인터페이스
    // 참조 자료형의 초기값은 null (기본자료형에는 null들어 갈 수 없음)
    // 따라서 int[][] arr = new int[3][]; 일때 0이 아닌 null이 들어가 있음.
    public void tesetDimentionalArray5(){
        Scanner sc = new Scanner(System.in);
        double arr[][] = new double[2][4];
        double totalScore = 0.0;
        String[] subject = {"국어", "영어"};

        for (int i=0; i<arr.length;i++){

            for (int j=0; j < arr[i].length-1; j++){
                System.out.printf("%s점수를 입력하세요 : ", subject[i]);
                double score = sc.nextDouble();
                arr[i][j] = score;
                totalScore += score;
            }


            arr[i][3] = totalScore;
            System.out.printf("%s총점 : %.2f", subject[i], arr[i][3]);

            double avgScore = totalScore/(double)(arr[i].length-1);
            System.out.printf("%s 평균점수 : %.2f\n", subject[i], avgScore);
        }
        System.out.println(Arrays.deepToString(arr));

    }


}