package com.inyong.section02.arraycopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        ArrayCopy ac = new ArrayCopy();


        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("기존 arr" + Arrays.toString(arr));

        ac.testArrayParameter(arr);

        System.out.println("메서드 실행 후 arr" + Arrays.toString(arr));
    }


}