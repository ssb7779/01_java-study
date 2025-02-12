package com.john.section02.arraycopy;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
    ## 배열 복사
    1. 사용시기
        1.1. 배열 내 데이터를 통해 작업은 진행하되, 원본 데이터를 유지시키고자할 때 사용
        1.2. 배열 크기를 늘리고 기존 배열 데이터를 옮겨 담고 싶을 때
    2. 종류
        2.1. 얕은 복사 : 배열의 주소값만 복사
        2.2. 깊은 복사 : Heap 에 생성된 배열 객체와 동일한 데이터가 담긴 새 배열자체를 생성
 */
public class ArrayCopy {
    public void testShallowArrayCopy() {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Original Array Hash: " + originalArray.hashCode());
        int[] copyArray = originalArray;
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
        System.out.println("Copy Array Hash: " + copyArray.hashCode());

        System.out.println();
        copyArray[0] = 100;
        System.out.println("=========After Copy Array Modify================");
        System.out.println("Original Array After Modify: " + Arrays.toString(originalArray));
        System.out.println("Copy Array After Modify: " + Arrays.toString(copyArray));

    }

    public void testDeepArrayCopy() {
        /*
            ## Deep Copy For문 활용 - 원본과 동일한 길이의 새로운 배열을 생성 후 각 배열값을 복사
         */
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Original Array Hash: " + originalArray.hashCode());
        int[] copyArray = new int[7];
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
        System.out.println("Copy Array Hash: " + copyArray.hashCode());

        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        copyArray[0] = 100;
        System.out.println("=========After Deep Copy Array Modify================");
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copy Array: " + Arrays.toString(copyArray));

    }

    public void testDeepArrayCopy2() {
        /*
            ## Deep Copy System.arraycopy() 활용
            System.arraycopy(originArray, copy start index, copyArray, copy start index, copy val count)
         */
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copyArray = new int[10];

        System.arraycopy(originalArray, 1, copyArray, 3, 3);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
    }

    public void testDeepArrayCopy3() {
        /*
            ## Deep Copy Arrays.copyOf() 활용
            내부족으로 새로우 배열객체를 생성해서 복사가 진행된 후 반환
            Arrays.copyOf(OriginArray, copyLength);
         */
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copyArray = Arrays.copyOf(originalArray, 5);
        int[] copyArray2 = Arrays.copyOf(originalArray, 3);
        int[] copyArray3 = Arrays.copyOf(originalArray, 10);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Original Array Hash: " + originalArray.hashCode());
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
        System.out.println("Copy Array Hash: " + copyArray.hashCode());
        System.out.println("Copy Array2: " + Arrays.toString(copyArray2));
        System.out.println("Copy Array2 Hash: " + copyArray2.hashCode());
        System.out.println("Copy Array3: " + Arrays.toString(copyArray3));
        System.out.println("Copy Array3 Hash: " + copyArray3.hashCode());

    }

    public void testDeepArrayCopy4() {
        /*
            ## Deep Copy clone()
            원본 배열과 동일한 길이의 동일한 데이터가 담겨있는 새 배열객체 반환
         */

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copyArray = originalArray.clone();

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Original Array Hash: " + originalArray.hashCode());
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
        System.out.println("Copy Array Hash: " + copyArray.hashCode());
        System.out.println("Original Array Arrays.hashCode: " + Arrays.hashCode(originalArray));
        System.out.println("Copy Array Hash Arrays.hashCode: " + Arrays.hashCode(copyArray));
    }

    public void testArrayParameter(int[] arr){
        arr[0] = 100;
    }
}

