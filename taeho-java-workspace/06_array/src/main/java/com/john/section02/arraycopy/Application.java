package com.john.section02.arraycopy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ArrayCopy ac = new ArrayCopy();

//        ac.testShallowArrayCopy();
//        ac.testDeepArrayCopy();
//        ac.testDeepArrayCopy2();
//        ac.testDeepArrayCopy3();
        ac.testDeepArrayCopy4();

        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        //swallow copy
//        ac.testArrayParameter(arr);
//        System.out.println("\nOriginal Array After Method : " + Arrays.toString(arr));
        //deep copy
//        ac.testArrayParameter(arr.clone());
        System.out.println("\nOriginal Array After Method : " + Arrays.toString(arr));

    }


}
