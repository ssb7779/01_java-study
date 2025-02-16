package com.podoseee.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

    /*
        ## 배열 복사 ##
        1. 배열 복사를 진행하는 경우
           1) 배열 내의 데이터를 통해 테스트 작업시 원본 데이터를 유지시키고자 할 때
           2) 배열의 크기를 늘리고 기존 배열의 데이터를 옮겨담을때
        2. 종류
           1) 얕은 복사 : 주소값(참조값)만 복사
           2) 깊은 복사 : Heap영역에 생성된 배열객체와 동일한 데이터가 담긴 새 배열이 생성되는 과정

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
            ## 깊은복사방법1. for문 활용 ##
            복사할 배열과 동일한 길이의 새로운 배열을 생성 후
            for문을 이용해 각 배열요소값들을 복사하는 과정
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
            새로운 길이의 배열을 생성한 후
            System 클래스에서 제공하는 static void arraycopy() 메소드 활용

            System.arraycopy(원본배열, 복사시작인덱스, 복사본배열, 복사될시작인덱스, 복사할요소개수)

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
            내부적으로 새로운 배열객체 생성해서 복사가 진행된 후 반환

            Arrays.copyOf(원본배열, 복사할길이);

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
