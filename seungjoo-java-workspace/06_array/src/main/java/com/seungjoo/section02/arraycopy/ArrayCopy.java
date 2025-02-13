package com.seungjoo.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {
    /*
        배열 복사
        1.배열 복사를 진행하는 경우
        1)
        2) 배열의 크기를 늘리고 기존 배열의 데이터를 옮겨담을 때
        2. 종류
            1)얕은 복사: 주소(참조값)만 복사
            2)깊은 복사: heap영역에 생성된 배열 객체와 동일한 데이터가 담긴 새 배열이 생성되는 과정
     */

        public void testShallowArrayCopy() {
            int[] origin = {1,2,3,4,5};


            System.out.println("원본 배열:" + Arrays.toString(origin));
            int[] copy = origin;
            System.out.println("복사본 배열:" + Arrays.toString(copy));
            copy[0] = 100;
            System.out.println("==복사본 배열 수정 후 ==");
            System.out.println("원본 배열:" + Arrays.toString(origin));
            System.out.println("복사본 배열:" + Arrays.toString(copy));   //원본배열도 같이 수정됨. 얕은 복사
            // 얕은 복사인지  깊은 복사인지 알고싶으면 배열의 주소값을 찍어보면 됨

            System.out.println(origin.hashCode());
            System.out.println(copy.hashCode());    //두 객체의 해시값이 같음, 해시값이란 객체를 식별할 수 있는 정수값

        }
        public void testDeepArrayCopy1() {
            /*
                 ##깊은 복사
                 for문을 이용해 각 배열요소값들을 복사하는 과정
             */
            int[] origin = {1,2,3,4,5};
            int[] copy = new int[5];

            for (int i = 0; i < origin.length; i++) {
                copy[i] = origin[i];
            }
            System.out.println("복사본 배열 : " + Arrays.toString(copy));
            copy[0] = 100;
            System.out.println("원본배열" + Arrays.toString(origin)); //원본배열은 수정이 안되고 그대로인 상태임!!
            System.out.println("카피 배열" + Arrays.toString(copy));

            System.out.println(origin.hashCode());
            System.out.println(copy.hashCode());    //두 객체의 해시값이 같음, 해시값이란 객체를 식별할 수 있는 정수값





        }
        public void testDeepArrayCopy2() {
            /*
                깊은 복사 방법2. System.arrayCopy() 활용
                새로운 길이의 배열을 생성한 후
                System 클래스에서 제공하는 static void arraycopy() 메소드 활용

                System.arraycopy(원본배열,복사 시작인덱스,복사본 배열,복사될시작인덱스,복사할 요소개수)
             */
            int[] origin = {1,2,3,4,5};
            int[] copy = new int[10];

            System.arraycopy(origin,1, copy, 3,3); //System은 java.lang에 있어서 자동임포트됨.

            System.out.println("원본배열:" + Arrays.toString(origin));
            System.out.println("복사본 배열:"+ Arrays.toString(copy));

        }

        public void testDeepArrayCopy3() {

            /*
                깊은 복사방법3. Arrays.copyOf() 활용
                내부적으로 새로운 배열객체 생성해서 복사가 진행된 후 반환
             */


            int[] origin = {1,2,3,4,5};
            int[] copy = Arrays.copyOf(origin,10);  //원본배열의 길이를 넘게 지정하면 기본값이 0이 채워 들어감, 내부적으로 arraycopy()를 사용함

            System.out.println("원본 배열:" + Arrays.toString(origin));
            System.out.println("복사본 배열:" + Arrays.toString(copy));


            System.out.println("== 주소값 출력 ==");
            System.out.println(origin.hashCode());
            System.out.println(copy.hashCode());


        }
        public void testDeepArrayCopy4() {
            /*
           ##깊은 복사4.clone() 활용
            원본 배열과 똑같은 길이의 똑같은 데이터들이 담겨있는 새 배열 객체 반환

            원본배열.clone();
             */

            int[] origin = {1,2,3,4,5};
            int[] copy  = origin.clone();

            System.out.println("원본 배열" + Arrays.toString(origin));
            System.out.println("복사본 배열" + Arrays.toString(copy));
            System.out.println(origin.hashCode());
            System.out.println(copy.hashCode());


        }

        public void testArrayParameter(int[] arr){
            arr[0] = 100;
        }




















}
