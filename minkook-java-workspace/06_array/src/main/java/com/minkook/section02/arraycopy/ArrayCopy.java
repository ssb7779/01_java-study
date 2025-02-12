package com.minkook.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {
    public void testShallowArrayCopy(){
        
        //같은 주소값 공유하므로 복사본이 변경되면 원본도 변경
        int[] origin ={1,2,3,4,5};
        System.out.println("원본 배열: " + Arrays.toString(origin));
        int[] copy = origin;
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("==복사본 배열을 수정한 후");
        System.out.println("원본 배열: " + Arrays.toString(origin));
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        System.out.println("==주소값");
        System.out.println("원본 배열: " + origin.hashCode());
        System.out.println("복사본 배열: " + copy.hashCode());
    }

    public void testDeepArrayCopy1(){

        int[] origin ={1,2,3,4,5};
        System.out.println("원본 배열: " + Arrays.toString(origin));
        int[] copy = origin;
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("==복사본 배열을 수정한 후");
        System.out.println("원본 배열: " + Arrays.toString(origin));
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        System.out.println("==주소값");
        System.out.println("원본 배열: " + origin.hashCode());
        System.out.println("복사본 배열: " + copy.hashCode());
    }

    public void testDeepArrayCopy2(){

        int[] origin ={1,2,3,4,5};
        int[] copy = new int[5];
        System.arraycopy(origin, 1, copy, 2, 3);
        System.out.println("원본 배열: " + Arrays.toString(origin));
        System.out.println("==복사본 배열을 수정한 후");
        System.out.println("원본 배열: " + Arrays.toString(origin));
        System.out.println("복사본 배열: " + Arrays.toString(copy));

        System.out.println("==주소값");
        System.out.println("원본 배열: " + origin.hashCode());
        System.out.println("복사본 배열: " + copy.hashCode());
    }

    public void testDeepArrayCopy3(){

       /*
            ##  깊은복사방법3 Arrays.copyOf() 활용##
            내부적으로 새로운 배열객체 생성해서 복사가 진행된 후 반환
            Arrays.copyOf(원본배열,복사할길이)
        */
        int [] origin = {1,2,3,4,5};

        int[] copy = Arrays.copyOf(origin,10);

        System.out.println("원본배열:" + Arrays.toString(origin));
        System.out.println("원본배열:" + Arrays.toString(copy));

        System.out.println("==주소값 출력==");
        System.out.println("origin 주소값: " + origin.hashCode());
        System.out.println("copy 주소값: " + copy.hashCode());
    }

    public void testDeepArrayCopy4(){

       /*
            ##  깊은복사방법4 clone() 활용
            원본배열과 똑같은 길이의 데이터들이 담겨있는 새 배열 객체 반환
        */
        int [] origin = {1,2,3,4,5};
        int [] copy = origin.clone();
        System.out.println("원본배열:" + Arrays.toString(origin));
        System.out.println("원본배열:" + Arrays.toString(copy));

        System.out.println("==주소값 출력==");
        System.out.println("origin 주소값: " + origin.hashCode());
        System.out.println("copy 주소값: " + copy.hashCode());
   
    }

    public void testDeepArrayCopy4(int[] arr){
        arr[0] = 100;
    }
}
