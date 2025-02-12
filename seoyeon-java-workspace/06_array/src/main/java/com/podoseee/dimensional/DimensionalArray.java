package com.podoseee.dimensional;

public class DimensionalArray {
    /*
        ## 2차원 배열 ##
     */

    public void testDimensionalArray1(){
        // 2차원 배열 선언
        int arr1[][];
        int[] arr2[];
        int[][] arr;

        // 2차원 배열 생성
        // 배열명 = new 자료형[행크기][열크기];
        arr = new int[3][5];

        System.out.println("행의 길이 : " + arr.length); // 3

        System.out.println("0번 행 열의 길이 : " + arr[0].length); // 5
        System.out.println("1번 행 열의 길이 : " + arr[1].length); // 5
        System.out.println("2번 행 열의 길이 : " + arr[2].length); // 5
        
        // 바깥쪽 for문 : 행을 지정하는
        // 안쪽 for문 : 열을 지정하는
        for(int i=0; i<arr.length; i++) { // i=0행~2행
            for (int j=0; j<arr[i].length; j++) { // j=0열~4열
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void testDimensionalArray2(){
        int[][] arr = new int[3][5];

        // 1  2  3  4  5
        // 6  7  8  9  10
        // 11 12 13 14 15

        int value = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                //System.out.print(arr[i][j] + " ");
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public void testDimensionalArray3(){
        // 2차원 배열 초기화
        int[][] arr = { {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15} };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
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

        int[][] arr = new int[3][];
        
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
}
