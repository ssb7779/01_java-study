package com.sotogito.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    /**
     * ## 배열
     * 1. 동일한 타입의 다수의 데이터를 저장할 수 있는 자료구조
     * 2. 배열의 메모리
     * - 메모리를 할당 받을 때 연속된 공간을 할당 받음
     * - 다수의 데이터가 연속된 공간에 있기 때문에 빠르게 접근 가능 (반복문 빠름)
     * <p>
     * 3. 연속된 메모리 공간을 할당 받아 배열이 만들어지는 과정
     * 4. 크기를 미리 지정
     * 5. 메모리 Heap(힙)영역에 해당 크기만큼의 배열 공간이 할당
     * <p>
     * 배열 이름 = new 데이터타입[배열길이]
     */

    public void whyUserArray() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public void testBasicArray() {
//        int[] arr;
//        arr = new int[5];

        int[] arr = new int[3];
        /**
         * int[] arr 선언하면 stack에 배열의 주소값을 담음 - 참조변수
         *  new int[3]; Heap의 각주소에 객체 데이터를 저장
         *  stack에 생성된 주소로 Heap의 데이터를 참조한다.
         *
         *  [주소] ------ [?][?][?]
         *  stack          Heap
         *  int [] arr -----new int[3];
         *
         *                 1,2,3 : 인덱스
         *                 arr[1], arr[2] : 배열 요소
         */

        arr[0] = 10;
        arr[1] = 210;
        arr[2] = 1240;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr); //주소값 출력
    }

    public void testBasicArray1() {

    }

    public void testBasicArray2() {
        int[] intArr = new int[3]; //0,1,2
        double[] doubArr = new double[4]; //0,1,2,3
        String[] strArr = new String[5]; //01,2,3,4

        Arrays.fill(intArr, 0); //todo 한번에 초기화
        /**
         * 초기화하지 않아도 Heap영역이 생성되는 순간 jvm이 초기화를 해줌
         * 스택은 빈공간이 존재하도 되지만, 힙은 빈공간이 존재하면 안됨
         *
         *
         * 0
         * 0.0
         * false
         * \u0000
         * null
         * */

        for (int i = 0; i < 3; i++) {
            System.out.println(intArr[i]); //0
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(doubArr[i]); //0.0
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(strArr[i]); //null
        }
    }

    public void test3() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        //1,2,3,4,5
    }

    public void exception() {
        /**
         * NullPointException
         * 생성되지 않은 배열 참조변수를 사용할 경우
         */

        /**
         * NegativeArraySizeException
         * 배열 생성시 배여르이 길이를 음수로 지정할 경우
         */

        /**
         * ArrayIndexOutOfBoundsException
         * 배열 요소 접근시 부적정한 인덱스 사용할 경우
         */

        int[] arr = null;
        System.out.println(arr.length); //NullPointException
        System.out.println(arr[1]);


        arr = new int[-1]; //NegativeArraySizeException

        arr = new int[5];

        System.out.println(arr[6]);
    }

    public void testBasicArray6() {
        /**
         * 배열이 생성될 때 각 요소의 값을 바로 초기화 가능
         */

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};

        int[] arr;
        arr = new int[]{1, 2, 3, 4};

        System.out.println(arr1 == arr2); //false
    }

    public void testArrayExample1() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public void ex2() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                continue;
            }
            sum += arr[i];
        }

        System.out.println("짝수 총합" + sum);
    }

    public void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("크기 : ");
        int size = scanner.nextInt();

        String[] fruits = new String[size];

        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.printf("%d 번째 과일 이름 : ", i + 1);
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }
            fruits[i] = name;
        }


        for (String fruit : fruits) {
            if (fruit != null) {
                System.out.println(fruit);
            }
        }
    }


    public void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열 : ");
        String input = scanner.nextLine();


        char[] tokenInput = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            tokenInput[i] = input.charAt(i);
        }

        for (Character c : tokenInput) {
            System.out.println(c);
        }
    }

    public void tf() {
        int[] arr = new int[5];

        for (int i = 1; i <= 5; i++) {
            arr[i - 1] = i * 2;
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }

    /**
     * ## 배열 단점
     * 한번 지정한 배열의 크기는 변경이 불가
     * 크기를 변경하고 깊으면 new로 배열 다시 생성 - 참조 주소 변함
     * 자동메모리 관리 :  Heap에 있는 변경 전 배열은 GC(Garbage Collector)이 자동으로 삭제됨.
     * <p>
     * 사용중인 배열의 객체를 제거하고 싶으면 null 을 대입한다.
     * arr = null;
     */

    public void tEnhancedFor() {
        /**
         * 향상된 for문 (Enhanced For Loop)
         *1. 배열 요소들을 변수로 직접 순회 가능
         * 2. 보통 조회할 목적으로 사용
         */

        int[] arr = {10, 20, 30, 40, 50};

//        for(int i =1; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        for (Integer num : arr) {
            num = 1; //FIXME 값 부여는 불가능
            System.out.println(num); //메서드 안의 지역변수로만 부여 가능

            System.out.println(arr[1]);

        }
    }

    public void homework() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char[] wordToken = new char[word.length()];
        String result = "";
        //String result = null; //fixme 만약 null로 초기화하고 += 하면 null 뒤에 += 됨

        for (int i = 0; i < word.length(); i++) {
            wordToken[i] = word.charAt(i);
        }

        for (char c : wordToken) {
            result += (char) (c + 1);
        }

        System.out.println(result);
        System.out.println(String.valueOf(wordToken)); //fixme 특정 값을 문자열로 만들어 반환
    }

    public void remind() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); //TODO 배열 모두 출력
    }
}
