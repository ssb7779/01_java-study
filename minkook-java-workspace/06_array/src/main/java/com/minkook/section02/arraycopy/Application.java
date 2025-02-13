package com.minkook.section02.arraycopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        ArrayCopy ap = new ArrayCopy();

        int[] arr = {1,2,3,4,5};
        System.out.println("기존 arr: " + Arrays.toString(arr));
        ap.testDeepArrayCopy4(arr);
        System.out.println("메소드 실행후 arr: " + Arrays.toString(arr));
    }
}
