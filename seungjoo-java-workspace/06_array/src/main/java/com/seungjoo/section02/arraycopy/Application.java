package com.seungjoo.section02.arraycopy;

import com.seungjoo.section03.DimensionalArray.DimensionalArray;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
       ArrayCopy ac = new ArrayCopy();

////        ac.testDeepArrayCopy3();
//
//
//        int[] arr = new int[]{1,2,3,4,5};
//        System.out.println("기존 arr:" + Arrays.toString(arr)); //매개변수에서 얕은 복서 잔향
//        ac.testArrayParameter(arr.clone()); // 이 경우에는 클론된 배열의 값이 변하므로 기본 배열의 값은 그대로임.
//        System.out.println("메소드 실행 후 arr:" + Arrays.toString(arr));


        DimensionalArray da = new DimensionalArray();
        da.testDimensionalArray4();




    }
}
