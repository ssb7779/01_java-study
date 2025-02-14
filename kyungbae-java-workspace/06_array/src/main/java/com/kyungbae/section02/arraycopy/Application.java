package com.kyungbae.section02.arraycopy;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        ArrayCopy ac = new ArrayCopy();

//        ac.testShallowArrayCopy();
//        ac.testDeepArrayCopy1();
//        ac.testDeepArrayCopy2();
//        ac.testDeepArrayCopy3();
//        ac.testDeepArrayCopy4();
        int[] arr = {1,2,3,4,5};
        System.out.println("기존 arr: " + Arrays.toString(arr));
//        ac.testArrayParameter(arr); // 얕은복사 발생
        ac.testArrayParameter(arr.clone()); // 깊은복사 (clone()) 발생
        System.out.println("메소드 실행 후 arr: " + Arrays.toString(arr));


    }

}
