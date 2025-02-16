package com.sotogito.section02.arrayCopy;

import java.util.Arrays;

public class ArrayCopy {
    /**
     * ## 배열 복사
     * 1. 나의 테이터를 통해 테스트 작업시 원본 데이터를 유지시키고 싶을 떄
     * 2. 배열크기를 늘리고 기존 배열의 데이터를 옮길때
     * <p>
     * - 얕은 복사 : 주소값 복사
     * <p>
     * - 깊은 복사 : Heap 영역 데이터까지 복사
     */

    public void testShallowArrayCopy() {
        int[] origin = {1, 2, 3, 4, 5};
        System.out.println("원본 배열 : " + Arrays.toString(origin));

        int[] copy = origin; //얕은 복사 : 주소값 복사
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        copy[0] = 100; //todo 복사본을 수정하면 원본도 같이 수정 = 같은 객체
        System.out.println("복사본 수정 후");
        System.out.println("원본 배열 : " + Arrays.toString(origin));
        System.out.println("복사본 배열 : " + Arrays.toString(copy));

        System.out.println(origin.hashCode()); //[I@23fc625e
        System.out.println(copy.hashCode()); // [I@23fc625e
    }

    public void testDeepArrayCopy1() {
        /**
         * ##깊은 복사 방법
         * 1. for문 사용 : 복사할 배열과 동일한 길이의 새로운 배열을 생성 후 for문으로 생성
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[7]; //배열 크기 늘림

        for (int i = 0; i < copy.length; i++) {
            copy[i] = origin[i];
        }

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("복사본 수정");
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));


        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    public void testDeepArrayCopy2() {
        /**
         * 깊은 복사 방법 2. System.arraycopy() 활용
         * 새로운 길이의 배열을 생성 후 적용
         *
         * System.arraycopy(원본배열,복사시작index,복사본배열,복사될시작index ,복사할요소개수)
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[10];
        System.arraycopy(origin, 1, copy, 2, 4);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
    }

    public void testDeepArrayCopy3() {
        /**
         * 깊은 복사3. Arrays.copyOf
         *
         * Arrays.copyOf(원본배열, 복사할길이)
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy =Arrays.copyOf(origin,5);
        int[] copy2 =Arrays.copyOf(origin,3);//1,2,3
        int[] copy3 =Arrays.copyOf(origin,10);//1,2,3,4,5,0,0,0,0,0

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    public void testDeepArrayCopy4(){
        /**
         * ## 깊은 복사 방법4. clone()
         * 원본배열과 완전히 똑같은 새 배열을 생성
         */
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = origin.clone();

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    public void testArrayParameter(int[] arr){
        arr[0] = 100;
    }
}
