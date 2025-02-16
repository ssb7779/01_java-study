package com.john.section01.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
    ## 배열(Array)
    1. 동일한 타입의 다수의 데이터를 저장 및 관리할 수 잇는 자료구조
    2. 배열의 메모리 구조
        2.1. 메모리를 할당 받을 때 연속된 공간을 할당 받음
        2.2. 다수의 데이터들이 연속된 공간에 있어서 빠른 접근 가능
    3. 선언시 몇 개의 데이터를 담을 것인지 크기를 미리 지정해줘야함
        3.1. 처음 선언 시 Heap 영역에 해당크기만큼의 공간이 할당됨
        3.2. Array a = new Array();
        3.3. type[] ArrayName = new array[arrayLength];

    4. 배열의 메모리 구조
    Stack 에 변수 / Heap에 값이 들어감 (참조변수 arr이 배열 객체값을 참조한다)

    5. 배열 조회시 @기준 오른쪽 값이 해당 배열의 주소값(16진수)(타입 + @ + 16진수주소값)

    6. 배열 관련 에러
        6.1. NullPointException - 생성되지 않은 배열의 참조변수 사용시
        6.2. NegativeArraySizeException - 배열의 길이를 음수로 지정한 경우
        6.3. ArrayIndexOutOfBoundException - 부적절한 인덱스 접근

    7. 향상된For문(enhanced for)
        7.1. 배열의 전체요소를 조회할 때 사용
        7.2. 향상된 for문 내 변수타입은 배열요소 타입으로 작성


    * Heap
        1. Heap 영역에는 빈공간이 존재할 수 없음 => 각 공간에 따로 값을 선언하지 않은 경우
        compile 시 JVM이 자동으로 각 자료형에 맞는 초기값을 할당

        2. Heap에 생성된 객체마다 고유한 주소값이 부여됨.
            2.1. 주소값은 중복될 수 업스므로 다른 객체와 구별되는 식별자의 역할

        3. 각 타입에 따른 초기값
            1) 정수형 : 0
            2) 실수형 : 0.0
            3) 논리형 : false
            4) 문자형 : \u0000('')
            5) 참조형 : null


    
    *. 일반 변수와 참조 변수
        1.1.일반 변수
            1.1.1. 리터럴값을 바로 담을 수 있는 변수
            1.1.2. 기본 자료형으로 선언된 변수ㄴ
        
        5.2. 참조 변수
            5.2.1. 생성된 개겣의 주소값을 담는 변수
            5.2.2. 기본 자료형 외의 자료형으로 선언된 변수

 */
public class Array {
    public void whyUseArray(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        /* 불가
        for (int i=1; i<=5; i++){
            System.out.println(num + 1);
        }
         */

        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
    }

    public void testBasicArray1(){
//        int[] arr;
//        arr = new int[3];
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
        // 배열의 주소값 기반문자열 출력
        System.out.println(arr);
    }

    public void testBasicArray2(){
        int[] arr = new int[3];
        double[] arr2 = new double[4];
        String[] arr3 = new String[5];
        boolean[] arr4 = new boolean[3];

        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0; i < 4; i++){
            System.out.println(arr2[i]);
        }
        for(int i = 0; i < 5; i++){
            System.out.println(arr3[i]);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(arr4[i]);
        }

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
    }

    public void testBasicArray3(){
        int[] arr = new int[7];

        int arrLength = arr.length;

        for(int i = 0; i < arrLength; i++){
            arr[i] = (i + 1);
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }

    public void testBasicArrayException(){
        int[] arr = null;
        System.out.println(arr.length);
        arr = new int[-5];
        arr = new int[5];
        System.out.println(arr[5]);
    }

    public void testBasicArray4(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[] {1,2,3,4};

        int[] arr3;
        arr3 = new int[]{1,2,3,4};

        // 참조 변수의 주소가 다르므로 False
        System.out.println(arr1 == arr2);
    }

    public void testArrayExample1(){
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n",i,arr[i]);
        }
    }

    public void testArrayExample2(){
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }else{
                sum += arr[i];
                count++;
            }
        }
        System.out.println("짝수의 총합" + sum);
        System.out.println("짝수의 개수" + count);
    }

    public void testArrayExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이: ");

        int n = sc.nextInt();
        sc.nextLine();

        String[] sArr = new String[n];
        for (int i = 0; i < sArr.length; i++) {
            System.out.print("담고 싶은 과일(종료를 원한다면 exit): ");
            String s = sc.nextLine();
            if(s.equals("exit")){
                break;
            }
            sArr[i] = s;
        }

        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] != null){
                System.out.println(sArr[i]);
            }

        }
    }

    public void testArrayExample4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        char[] cArr = new char[s.length()];
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = s.charAt(i);
        }
        for(int i = 0; i < cArr.length; i++){
            System.out.println(cArr[i]);
        };
        System.out.println(cArr);

    }

    public void testArrayFault(){
        int[] intArr = new int[5];
        System.out.println(intArr.hashCode());
        int num = 2;
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = num;
            num +=2;
        }
        System.out.println(Arrays.toString(intArr));

        // 새로운 배열을 참조 (기존 배열 연결 해제)
        intArr = new int[7];
        System.out.println(intArr.hashCode());

        // 배열 객체도 제거하려는 경우 => null 대입
        intArr = null;
    }

    public void testEnhancedFor() {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------");

        for (int i: arr){
            System.out.println(i);
        }
    }

    public void remind(){
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for(int i: arr){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
