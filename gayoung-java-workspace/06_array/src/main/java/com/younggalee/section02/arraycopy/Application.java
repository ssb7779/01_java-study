package com.younggalee.section02.arraycopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        ArrayCopy ac = new ArrayCopy();
        ac.testDeepArrayCopy4();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("기존 arr: " + Arrays.toString(arr));
        ac.testArrayParameter(arr);
        System.out.println("메소드 실행후" + Arrays.toString(arr));
    }


}
