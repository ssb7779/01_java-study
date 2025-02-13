package com.inyong.section01.array;

import java.util.Scanner;

public class Array {
    /*
    '동일한 타입'의 다수의 데이터를 저장해서 관리할 수 있는 자료 구조

    배열 선언
    1. 배열의 타입과 이름을 결정하는 과정
    2. 배열 선언만으로 배열이 생성 되는건 아님
    3. int [] array

    배열생성
    1. 연속된 메모리 공간을 할당 받아 배열이 만들어지는 과정
    2. 몇 개의 데이터를 담을 건지 크기를 미리 지정해야 됨
    3. 메모리의 Heap(힙)영역에 해당 크기만큼의 배열 공간이 할당됨
    4. 배열이름 = new 데이터 타입[배열 길이]
    new -> heap 영역에 생성 하겠다는 의미

    stack - int [] arr
    heap - new int[3] (heap에 생성되는 영역은 객체)
    stack은 Heap의 주소를 참조 할 수 있게 주소를 저장함

    arr 변수에는 Heap에 생성된 배열객체를 참조하는 주소값이 실질적으로 담겨있음
    따라서 이를 참조변수 또는 레퍼런스변수 라고함

    ## 배열 인덱스 ##
    1. 배열 요소를 구분하기 위한 고유 숫자
    2. 0부터 순차적으로 증가되며 부여됨

    */

    public void testBasic() {
        int[] arr = new int[3];
        arr[0] = 10;

        System.out.println(arr);
    }

    public void testBasicArray1() {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int sum = 0;
        for(int i= 0; i<3; i++){
            sum += arr[i];

        }

        System.out.println(sum);


    }

    /*
    일반변수, 참조변수

    1. 일반 변수
        1) 리터럴값을 바로 담을 수 있는 변수
        2) 기본 자료형으로 선언된 변수
    2. 참조 변수
        1) 생성된 객체의 주소값(참조값)을 담는 변수
        2) 기본자료형 외의 자료형(String, 배열, ..)으로 선언된 변수
     */

    public void testBasicArray2(){
        /*
        3개의 정수 데이터를 보관하는 배열
        4개의 실수
        5개의 문자열
         */

        int [] array1 = new int[3]; // 0
        double [] array2 = new double[4]; //0.0
        String [] array3 = new String[5]; //null

        for(int i= 0; i<3; i++){
            System.out.println(array1[i]);
        }
        for(int i= 0; i<4; i++){
            System.out.println(array2[i]);
        }
        for(int i= 0; i<5; i++){
            System.out.println(array3[i]);
        }

        // 각 인덱스 자리의 배열요소에 이미 데이터가 담겨 있음

        /*
        1.heap에 생성된 객체바다 고유한 주소값이 부여됨
        주소값은 중복되지 않음으로 다른객체와 구별되는 식별자의 역할
        2. 절대 빈공간 존재 x
        즉, 직접 초기화 하거나
        초기화를 하지 않을 경우 JVM이 각 타입에 맞는 초기값을 대입해줌 (자동 초기화)
        3. 타입에 따른 초기값
        정수형 0
        실수형 0.0
        논리형 false
        문자형 /u0000('')
        참조형 null
         */


        System.out.println("===참조변수 출력===");
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
//        [I@251a69d7
//            [D@7344699f
//                [Ljava.lang.String;@6b95977

        System.out.println(array1.hashCode());
        System.out.println(array2.hashCode());
        System.out.println(array3.hashCode());
    }


    public void testBasicArray3(){
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = i + 1;
        }

        for(int i=0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length); // 배열 길이 속성같은 존재여서 ()는 없음
    }

    public void testArrayException(){
        /*
        배열 관련 예외 오류
        1. NullPointerExption : 생성되지 않는 배열 참조변수 사용하는 경우
        2. NegativeArraySizeExption: 배열의 길이를 음수로 지정할 경우 발생
        3. ArrayIndexOutOfBoundsException: 배열 요소 접근시 부적절한 인덱스 사용시 발생

         */


        // int [] arr = null;
        // arr = new int [-5]
    }

    public void testBasicArray4(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[] {1,2,3,4};

        // 단 이미 선언된 변수배열에 초기화를 진행하는 경우

        int[] arr;
        //arr = {1, 2, 3, 4}
        arr = new int[] {1,2,3,4};
    }


    public void testArrayExample1(){
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100+1);
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void testArrayExample2(){
        int[] arr = new int[10];
        int result = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++) {

            arr[i]= (int)(Math.random()*100+1);

            if(arr[i] % 2 == 1){
                System.out.println(arr[i]);
            }

            if(arr[i] % 2 == 0){
                result += arr[i];
                ++count;
            }
        }

        System.out.println("배열 요소가 짝수인 합 : " + result);
        System.out.println("배열 요소가 짝수인 개수 : " + count);


    }


    public void testArrayExample3(){
        /*
        사용자에게 배열의 길이 입력받아 해당 길이만큼의 문자열 배열
        반복적으로 파일명을 입력받아 각 요소에 대입
        출력
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("좋아하는 과일 개수: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[size];

        for (int i = 0; i<fruits.length; i++){
            System.out.println("좋아하는 과일명 입력(종료를 원한다면 exit): ");
            String fruit = sc.nextLine();

            if(fruit.equals("exit")) {
                break;
            }
                fruits[i] = sc.nextLine();

        }

        for (int i = 0; i<fruits.length; i++){
            if(fruits[i] != null) {
                System.out.println(fruits[i]);
            }
        }

    }

    public void testArrayExample4(){
        /*
        문자열 하나를 입력받아 해당 문자열의 각 인덱스 자리의 문자들을
        char 배열에 옮겨 담기

         1. 문자열 한개 입력받기
         2. char 배열 생성해두기 (배열의 크기 == 문자열의 길이)
         3. 각 인덱스별 문자를 char 배열의 각 인덱스 자리에 대입을 진행
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String str = sc.nextLine();


        char[] arr = new char[str.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i]= str.charAt(i);
        }

        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(arr);
    }


    // java에서의 배열 단점
    public void testArrayFault(){
        /*
        5개 정수 데이터 담는 배열 생성
         */

        int [] arr = new int[5];

        for( int i= 0; i < 5; i ++){
            arr[i]= 2 * (i+1);
            System.out.println(arr[i]);
        }

    // 배열 단점, 지정된 배열의 크기는 변경이 불가능함
        arr = new int[7];
        for(int i = 0; i <arr.length; i++){

            System.out.println(arr[i]);
        }

        /*
        연결이 끊겨진 Heap 영역에서의 기존 배열 객체는 일정 시간 후에 GC 가비지 컬렉터가 삭제 시킴
        arr = null; 연결 끊김
         */

        arr = null;
    }

    public void testEnhancedFor(){
        /*
        ## 향상된 for 문 ##
        1. enhanced for loop
        2. 인덱스를 사용하지 않고 순회 가능.
        3. 배열의 모든요소들을 순차적으로 변수로 전달해줌
        4. 주로 배열 내의 전체 요소들을 조회할 목적으로 사용 '
        5. jdk 1.5 이상부터 사용 가능
         */

        int[] arr = {1,2,3,4,5};

        for (int num : arr){
            System.out.println(num);
        }
    }
}