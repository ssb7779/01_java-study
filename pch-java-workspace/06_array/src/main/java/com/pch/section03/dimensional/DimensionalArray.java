package com.pch.section03.dimensional;

public class DimensionalArray {
    /**
     * 2차원 배열
     */

    public void testDimensionalArray1(){

    }

    public void testDimensionalArray2(){
        int arr[][] = new int[10][10];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i*10+j;
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public void testDimensionalArray3(){
        int[][] arr = new int[3][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public void testDimensionArray4(){

    }

    public void testDimensionArray5(){
        double[][] darr = new double[2][4];

        System.out.println("이상한 문ㅁ제");
    }
}
