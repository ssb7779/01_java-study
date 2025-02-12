package com.younggalee.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {
    /*
        ## 배열 복사 ##
        1. 배열 복사를 진행하는 경우
            1) 배열 내의 데이터를 통해 테스트 작업시 원본 데이터를 유지하고자 할때
            2) 배열의 크기를 늘리고 데이터를 옮겨담을때

        2. 종류
            1) 얕은 복사 : 주소값(참조값)만 복사
            2) 깊은 복사 : heap영역에 생성된 배열객체와 동일한 데이터가 담긴 새 배열이 생성되는 과정

     */
    public void testShallowArrayCopy(){
        int[] origin = {1, 2, 3, 4, 5};

        System.out.println("원본 배열: " + Arrays.toString(origin));

        int[] copy = origin; // 얕은 복사: 주소값을 복사(동일한 배열객체 참조)
        System.out.println("복사본 배열" + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("복사본 배열 수정 후");
        System.out.println("원본" + Arrays.toString(origin));
        System.out.println("복사본 배열" + Arrays.toString(copy));
        //복사본 배열을 수정하였으나 원본 배열도 수정된 이유
        //얕은 복사는 주소값을 복사하기 때문에 같은 데이터를 가르키고(참조) 있었다.
        System.out.println("===주소값 출력=====");
        System.out.println("origin주소값 출력=====" + copy.hashCode());
        System.out.println("copy주소값 출력=====" + copy.hashCode()); // 동일
    }

    public void testDeepArrayCopy1(){
        /*
         ## 깊은 복사 방법 1 : for문 활용 ##
         복사할 배열과 동일한 길이의 새로운 배열을 생성 후
         for문을 이용해 각 배열요소값들을 복사하는 과정
         */

        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[5];  //for문으로 복사할거면 더 작으면 안됨 바운더리에러출력
        int[] copy2 = new int[5]; //객체 생성부 꼭 작성해야함!!! (공간 같거나 크면 됨.)

        //copy2 = origin; 할당한 객체 공간 사용 안됨. 무조건 주소값만 변수에 들어가는 방식
        for(int i=0; i<origin.length; i++){
            copy[i] = origin[i];
        }
        System.out.println("복사본 배열" + Arrays.toString(copy));
        copy[0] = 100;

        System.out.println("원본" + Arrays.toString(origin));
        System.out.println("복사본 배열" + Arrays.toString(copy));
    }

    public void testDeepArrayCopy2(){
        /*
        ## 깉은 복사방법 2 : System.arraycopy() 활용 ##  *** 디테일하게 복사가능
        새로운 길이의 배열을 생성한 후
        System 클래스에서 제공하는 static void arraycopy() 메소드 활용
        해당 메소드는 5개의 매개변수를 넣어줘야함.
        ㄴ System.arraycopy(원본배열, 복사시작인덱스, 복사본배열, 복사될 시작 인덱스, 복사할 요소 개수)
         */
        int[] origin = {1, 2, 3, 4 ,5};
        int[] copy = new int[10];

        System.arraycopy(origin, 0, copy, 0,3); //java.lang 패키지안에 있어서 import할 필요 없음.

        System.out.println("원본" + Arrays.toString(origin));
        System.out.println("복사본 배열" + Arrays.toString(copy));
    }

    public void testDeepArrayCopy3(){
        /*
            ## 깊은복사방법3. Arrays.copyOf() ##
            내부적으로 새로운 배열객체 생성해서 복사가 진행된 후 반환

            Arrays.copyOf(원본배열, 복사할 길이);  //원본보다 복사할길이가 더 크면 길어짐
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(origin, 5);
        int[] copy2 = Arrays.copyOf(origin, 3);
        int[] copy3 = Arrays.copyOf(origin, 7);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));

        /*
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        [1, 2, 3]
        [1, 2, 3, 4, 5, 0, 0]
         */

    }

    public void testDeepArrayCopy4(){
        /*
        ## 깊은복사방법4. clone()활용## ************** 주로 사용됨
        원본배열과 똑같은 길이의 똑같은 데이터들이 담겨있는 새 배열 객체 반환

        원본배열.clone()
         */

        int[] origin = {1,2,3,4,5};
        int[] copy = origin.clone();  // java.lang 메소드임

        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열" + Arrays.toString(copy));
        System.out.println("===주소값 출력=====");
        System.out.println("origin주소값 출력=====" + origin.hashCode());
        System.out.println("copy주소값 출력=====" + copy.hashCode()); // 동일

    }

    public void testArrayParameter(int[] arr){  //주소값이 담김
        arr[0] = 100;
    }
}
