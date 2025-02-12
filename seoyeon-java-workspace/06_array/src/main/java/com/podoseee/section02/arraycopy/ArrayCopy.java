package com.podoseee.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

    /*
            ## 배열 복사 ##

     */

    public void testShallowArrayCopy(){

        int[] origin = {1, 2, 3, 4, 5};
        System.out.println("원본 배열 : " + Arrays.toString(origin));
        int[] copy = origin; // 얕은복사 : 주소값을 복사 (동일한 배열객체 참조)
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("== 복사본 배열 수정 후 ==");
        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        System.out.println("== 주소값 출력 ==");
        System.out.println("origin 주소값 : " + origin.hashCode());
        System.out.println("copy 주소값 : " + copy.hashCode());

    }

    public void testDeepArrayCopy1(){
        /*
            ## 깊은복사방법 1. for문 활용 ##
         */

        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[7];

        /*
            copy[0] = origin[0];
            copy[1] = origin[1];
            ...
            copy[4] = origin[4];
         */
        for(int i=0; i<origin.length; i++){
            copy[i] = origin[i];
        }
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        System.out.println("== 주소값 출력 ==");
        System.out.println("origin의 주소값 : " + origin.hashCode());
        System.out.println("copy의 주소값 : " + copy.hashCode());
    }

    public void testDeepArrayCopy2(){
        /*
            ## 깊은복사방법2. System.arraycopy() 활용 ##

         */

        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[10];

        System.arraycopy(origin, 1, copy, 2, 3);

        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        System.out.println("== 주소값 출력 ==");
        System.out.println("origin 주소값 : " + origin.hashCode());
        System.out.println("copy 주소값 : " + copy.hashCode());
    }

    public void testDeepArrayCopy3(){
        /*
            ## 깊은복사방법3. Arrays.copyOf() 활용 ##

         */

        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(origin, 10);

        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        System.out.println("== 주소값 출력 ==");
        System.out.println("origin 주소값 : " + origin.hashCode());
        System.out.println("copy 주소값 : " + copy.hashCode());
    }

    public void testDeepArrayCopy4(){
        /*
            ## 깊은복사방법4. clone() 활용 ##
            원본배열과 똑같은 길이의 똑같은 데이터들이 담겨있는 새 배열 객체 반환

            원본배열.clone()
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = origin.clone();

        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));
        System.out.println("== 주소값 출력 ==");
        System.out.println("origin 주소값 : " + origin.hashCode());
        System.out.println("copy 주소값 : " + copy.hashCode());
    }

    public void testArrayParameter(int[] arr){
        arr[0] = 100;
    }
}
