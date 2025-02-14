package com.sotogito.section02.arrayCopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();
//        arrayCopy.testDeepArrayCopy4();

        int[] arr = {1,2,3,4,5};
        System.out.println("기존"+ Arrays.toString(arr));
        arrayCopy.testArrayParameter(arr);
        System.out.println(Arrays.toString(arr));
    }
}

