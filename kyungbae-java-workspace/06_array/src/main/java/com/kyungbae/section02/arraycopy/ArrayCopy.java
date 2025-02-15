package com.kyungbae.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

    public void testShallowArrayCopy(){

        // 얕은 복사
        int[] origin = {1,2,3,4,5};
        System.out.println("원본 배열: " + Arrays.toString(origin));

        int[] copy = origin;
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        copy[0] = 100; // 원본 배열도 같이 수정 됨
        System.out.println("===복사본 수정 후====");
        System.out.println("원본 배열: " + Arrays.toString(origin));
        System.out.println("복사본 수정 배열: " + Arrays.toString(copy));

        System.out.println("===주소값 출력===");
        System.out.println("origin 주소값 :" + origin.hashCode());
        System.out.println("copy 주소값 :" + copy.hashCode());


    } // tSAC end

    public void testDeepArrayCopy1(){
        // 깊은복사

        int[] origin = {1,2,3,4,5};
        int[] copy = new int[7]; // 배열의 크기 변경 가능

        int c = 0;
        for (int i : origin){
            copy[c++] = i;
        }
        copy[0] = 100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
        System.out.println("===주소값====");
        System.out.println("origin:" + origin.hashCode());
        System.out.println("copy:" + copy.hashCode());


    } // tDAC1 end

    public void testDeepArrayCopy2(){
        // 깊은복사 2.
        /*
         System.arraycopy(원본배열, 복사를시작할인덱스, 복사본 배열, 복사본에 복사될 시작인덱스, 복사할 요소 개수)

         */
        int[] origin = {1,2,3,4,5};
        int[] copy = new int[10];

        int i = 0;
        System.arraycopy(origin, i, copy, 1, 5);

        System.out.println(Arrays.toString(copy));


    } // tDAC2

    public void testDeepArrayCopy3(){
        // 깊은복사 3.
        /*
            Arras.copyOf() 활용
            Arrays.copyOf(원본배열, 복사할길이);
         */
        int[] origin = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(origin, 10);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        System.out.println("=== 주소값 ===");
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

    } // tDAC3

    public void testDeepArrayCopy4(){
        // 깊은복사 4.
        /*
            clone() 활용
            원본배열과 같은 배열 복사
            원본배열.clone();
         */

        int[] origin = {1,2,3,4,5};
        int[] copy = origin.clone();

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
        System.out.println("===주소값===");
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

    } // tDAC4

    public void testArrayParameter(int[] arr){
        arr[0] = 100;

    } // tAP


} // class end
