package com.podoseee.section01.array;

public class Array {

    /*
        ## 배열 ##
        
     */
    
    public void whyUseArray(){
        // 변수만을 가지고 프로그래밍
        
        // 변수 5개를 만들어 각 값 저장
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        // 출력시에도 일일히 변수를 호출 후 출력
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        // 총합 구할때도 일일히 더해줘야됨
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println("총합 : " + sum);

    }

    /*
        ## 배열 선언 ##

     */

    public void testBasicArray1(){
        // 배열 선언 및 생성(할당)
        
        //int[] arr; // 배열 선언
        //arr = new int[10]; // 배열 생성
        int[] arr = new int[10]; // 배열 선언과 동시에 생성

        /*
            ## 배열의 메모리 구조 ##
            
         */

        // 배열요소에 데이터 대입
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // 배열요소들 출력 및 총합계 구하기
        int sum = 0;
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("총합계 : " + sum);

        //System.out.println(arr); // 배열객체를 참조하고 있는 주소값 기반의 문자열 출력

        /*
            ## 일반변수와 참조변수 ##
         */
    }

    public void testBasicArray2(){
        /*
            3개의 정수 데이터를 보관할 배열,
            4개의 실수          "
            5개의 문자열        "        배열 생성한 후
            곧바로 각 배열의 요소 출력해보기
         */

        int[] arr1 = new int[3]; // 0, 1, 2 인덱스
        double[] arr2 = new double[4]; // 0, 1, 2, 3 인덱스
        String[] arr3 = new String[5]; // 0, 1, 2, 3, 4 인덱스

        for(int i=0; i<3; i++){
            System.out.println(arr1[i]);
        }

        for(int i=0; i<4; i++){
            System.out.println(arr2[i]);
        }

        for(int i=0; i<5; i++){
            System.out.println(arr3[i]);
        }
        
        // 각 인덱스 자리의 배열요소에 이미 데이터가 담겨있음

        /*
            ## Heap 메모리 특징 ##

         */

        System.out.println("=== 참조변수 출력 ===");
        // 출력형식 : 타입 + @ + 16진수형태의 주소값
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        // 레퍼런스변수.hashCode() : 10진수형태의 주소값
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr3.hashCode());
    }

    public void testBasicArray3(){
        // 5개의 정수 데이터를 담을 수 있는 배열 생성 후 임의의 숫자감ㅅ 담아 출력
        int[] arr = new int[7];

        // 각 배열요소에 1~5까지의 숫자 담기
        /*
            arr[0] = 1;
            arr[1] = 2;
            ...
            arr[4] = 5;
         */
        for(int i=0; i</*5*/arr.length; i++){
            arr[i] = i + 1;
        }

        // 출력
        for(int i=0; i</*5*/arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("배열의 길이 : " + arr.length);
    }

    public void testArrayException(){
        /*
            ## 배열 관련 예외(오류) ##
            1.
         */
        int[] arr = null; // 배열 선언 (생성 x)

        //NullPointerException
        //System.out.println(arr.length);
        System.out.println(arr[1]);

        //NegativeArraySizeException
        //arr = new int[-5];

        arr = new int[5]; // 인덱스 : 0 ~ 4

        //
        //System.out.println(arr[4]);

    }

    public void testBasicArray4(){
            /*
                ## 배열 초기화 ##
                1.
             */

        // 선언과 동시에 초기화 하는 경우
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[] {1, 2, 3, 4};

        // 단, 이미 선언된 배열변수에 초기화를 진행하는 경우
        int[] arr;
        //arr = {1, 2, 3, 4}; // 오류
        arr = new int[] {1, 2, 3, 4};

        System.out.println(arr1 == arr2); // false
        // == 동등비교는 각 변수에 담긴 값을 가지고 비교함
        // 참조변수에는 다른 주소값이 담겨있으므로 false
    }

    public void testArrayExample1(){
        /*
            크기 10짜리 정수 배열 생성 후
            반복문 통해서 각 요소에 난수값(1~100) 대입
            출력해보기 (arr[x] : xx)
         */
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 100  + 1);
        }

        for(int i=0; i<arr.length; i++){
           // System.out.println("arr[" + i + "] : " + arr[i]);
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
