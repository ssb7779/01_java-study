package com.inyong.section02.arraycopy;
import java.util.Arrays;

public class ArrayCopy {
    /*
    배열 복사
    1. 배열 복사를 진행하는경우
     1) 배열 내의 데이터를 통해 테스트 작업시 원본 유지
     2) 배열 크기를 늘리고자 할 때

    2. 종류
      1) 얕은 복사 : 주소값(참조값)만 복사
      2) 깊은 복사 : Heap영역에 생성된 배열객체와 동일한 데이터가 담긴 새 배열
     */

    public void testShallowArrayCopy() {

        // 얕은 복사 : c + c / c + v
        // 깊은 복사 : 새로 만듬

        int[] origin = {1, 2, 3, 4, 5};
        System.out.println("원본 배열" + Arrays.toString(origin));
        char[] origin1 = {'a', 'b'};
        System.out.println(String.valueOf(origin1));

        int[] copy = origin;
        System.out.println("복사본 배열" + Arrays.toString(copy));

        copy[0] = 100;

        System.out.println("수정후");
        System.out.println("원본 배열" + Arrays.toString(origin));
        System.out.println("복사본 배열" + Arrays.toString(copy));

        System.out.println("주소값 출력");
        System.out.println("origin 주소" + origin.hashCode());
        System.out.println("copy 주소" + copy.hashCode());
    }

    public void testDeepArrayCopy1(){
        /*
        깊은 복사 방법
        1. for문

         */
        int[] origin = {1,2,3,4,5};
        int[] copy = new int [5];

        for(int i = 0 ; i<origin.length; i++){
            copy[i] = origin[i];

        }

        System.out.println("원본 배열 " + Arrays.toString(origin));
        System.out.println("복사본 배열 " + Arrays.toString(copy));

        copy[0] = 100;
        System.out.println("원본 배열 " + Arrays.toString(origin));
        System.out.println("복사본 배열 " + Arrays.toString(copy));

        System.out.println("origin 주소 " + origin.hashCode());
        System.out.println("copy 주소 " + copy.hashCode());
    }

    public void testDeepArrayCopy2(){

        /*
        ## 깊은복사방법2
        System.arraycopy() 활용
        새로운 길이의 배열을 생성한 후
        System 클래스에서 제공하는 static void arraycopy() 메소드 활용

        System.arraycopy(원본배열, 복사를 시작할 인덱스 ,복사본 배열 ,복사될 시작 인덱스 ,복사할 요소 개수)

         */

        int[] origin = {1,2,3,4,5};
        int[] copy = new int [10];

        System.arraycopy(origin, 0, copy, 3, 5);

        System.out.println(Arrays.toString(copy));
    }

    public void testDeepArrayCopy3() {


    /* Arrays.copyOf() 활용
    내부적으로 새로운 배열 객체 생성해서 복사가 진행된 후 반환
   Arrays.copyOf(원본배열, 복사할길이);

    */
        int[] origin = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(origin, 10);

        System.out.println("원본" + Arrays.toString(origin));
        System.out.println("복사" + Arrays.toString(copy));

        System.out.println("origin 주소 " + origin.hashCode());
        System.out.println("copy 주소 " + copy.hashCode());

    }

    public void testDeepArrayCopy4() {
        /*
        깊은복사방법 clone
        원본배열과 똑같은 길이의 똑같은 데이터들이 담겨있는 새 밸열 객체 반환
         */

        int[] origin = {1,2,3,4,5};
        int[] copy = origin.clone();

        System.out.println("원본" + Arrays.toString(origin));
        System.out.println("복사" + Arrays.toString(copy));

        System.out.println("origin 주소 " + origin.hashCode());
        System.out.println("copy 주소 " + copy.hashCode());
    }

    public void testArrayParameter(int[] arr) {
        arr[0] = 100;

    }
}
