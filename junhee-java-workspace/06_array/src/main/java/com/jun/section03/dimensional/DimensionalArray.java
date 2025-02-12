package com.jun.section03.dimensional;

public class DimensionalArray {
       /*
        ## 2차원 배열 ##
        1. 1차원 배열이 여러개 모인 자료구조
           1차원 배열 여러개를 하나의 이름으로 관리할 수 있음
        2. 행과 열의 집합체인 테이블 구조
        3. 사용되는 인덱스 2개(행, 열)

        ## 배열 선언과 생성 ##
        1. 선언
           1) 자료형[][] 배열명; -- 추천
           2) 자료형 배열명[][];
           3) 자료형[] 배열명[];
        2. 생성(할당)
           1) new 자료형[m][n]; - 길이가n인 1차원배열이 m개 있는 배열로 생성(m행n열) = 정형배열
           2) new 자료형[m][ ]; - 길이가 ?인 1차원배열이 m개 있는 배열로 생성(m행?열) = 가변배열
     */

    public void testDimensionalArray1() {
        // 2차원 배열 선언
        int arr1[][];
        int[] arr2[];
        int[][] arr;

        //2차원 배열 생성
        // 배열명 = new 자료형[행크기][열크기]
        arr = new int[3][5];

        System.out.println("행의 길이: " + arr.length);// 3

        System.out.println("0번 행 열의 길이: " + arr[0].length);
        System.out.println("1번 행 열의 길이: " + arr[1].length);
        System.out.println("2번 행 열의 길이: " + arr[2].length);

    }

}
