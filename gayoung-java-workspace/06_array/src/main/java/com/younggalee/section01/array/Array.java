package com.younggalee.section01.array;

import java.util.Scanner;

public class Array {
    /*
    ## 배열 (Array) ##
    1. 동일한 타입의 다수의 데이터를 저장해서 관리할 수 있는 자료구조
    2. 배열의 메모리 구조
       ㄴ 배열은 메모리를 할당 받을 때 연속된 공간을 할당 반음
       ㄴ 다수의 데이터들이 연속된 공간에 있기 때문에 빠르게 접근 가능
          (반복문을 이용한 연속 처리가 가능함)
     */

     /*
     ## 배열 선언 ##
     1. 배열의 타입과 이름을 결정하는 과정
     2. 배열 선언만으로 배열이 생성되는 것은 아니므로 주의해야함.
     3. 작성 형식
       1) 데이터타입[] 배열이름 ****
       2) 데이터타입 배열이름[]
      */

      /*
      ## 배열 생성 ##
      1. 연속된 메모리 공간을 "할당" 받아 배열이 만들어지는 과정
      2. 몇 개의 데이터를 담을건지 크기를 미리 지정해야됨
      3. 메모리 영역(stack/heap/static) 중 heap영역에 해당 크기만큼의 배열 공간이 할당됨
      4. 작성형식
         : 배열이름 = new 데이터타입[배열길이];
       */

      /*
      ## 배열 선언과 동시에 생성 ##
      1. 위의 두 과정을 동시에
      2. 작성형식
         : 데이터타입[] 배열이름 = new 데이터타입[배열의 길이];
       */

    public void testBasicArray1(){
        // 배열 선언 및 생성(할당)
        //int[] arr; // 배열 선언
        //arr = new int[5]; // 배열 생성
        int[] arr = new int[3]; // 배열 선언과 동시에 생성

        // 배열 요소에 대이터 대입
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr); // 주소값 기반 문자열 출력됨 [I@asdfas] >@앞 타입 // int > I, @뒤에는 주소값관련 16진수
    }


//힙에 생성된 모든 것들을 자바에서는 객체라고 부른다. int[] arr : stack
//    객체에 찾아가기 위한 주소값 필요(new int[3] : heap에 할당됨) 참조한다.(=)(-> 화살표 steat>heap)
//    따라서 arr을 참조변수라고 부르겠다.

    /*
    ## 배열의 메모리구조 ##
    stack                            | heap
    --------------------------------------------
    arr(참조할 주소값 들어가 있음)   | 3칸짜리 메모리할당됨
                                     | arr[0] arr[1] arr[2] : 배열요소
    ---------------------------------------------
    int[] arr                           new arr[3]

     arr 변수에는 heap에 생성된 배열객체를 참조하는 주소값이 실질적으로 담겨있음
     따라서 arr을 참조변수 또는 레퍼런스변수 라고 함.

     ## 배열 인덱스 ##
     1. 배열 요소를 구분하기 위한 고유 숫자
     2. 0부터 순차적으로 증가되며 부여됨

     ## 배열 요소 ##
     1. 배열에 저장된 각각의 데이터를 의미
     2. 배열이름과 대괄호[] 그리고 인덱스를 이용해서 배열 요소 나타냄
     3. 배열요소는 개별적인 변수 같은 개념
     */

     /* 일반변수와 참조변수
     ## 참조변수
     생성된 객체의 주소값(참조값)을 담는 변수
      기본자료형 외의 자료형(String, 배열,..)으로 선언된 변수
      //일반변수는 리터럴 값을 바로 담을 수 있음
      */
    public void testBasicArray2(){
        /*
        3개의 정수 데이터를 보관할 배열,
        4개 실수
        5개 문자열 생성후, 곧바로 각 배열의 요소 출력해보기
         */
        int[] arrInt = new int[3]; // 0 jvm(덕분에 운영체제상관없이 돌아감)이 자동으로 초기화해줌
        double[] arrDouble = new double[4];  // 0.0
        String[] arrString = new String[5];  // null
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt);

        System.out.println("=== 참조변수 출력 ===");
        //출력형식 : 타입 + "@" + 16진수형태의 주소값
        //레퍼런스변수.hashCode() > 10진수형태의 주소값 확인가능

    }

    /*
    ## heap 메모리 특징 ##
    1. heap에 생성된 개체마다 고유한 주소값이 부여됨
        주소값은 중복되지 않으므로 다른 객체와 구별되는 식별자의 역할임
    2. 절대 빈공간이 존재할 수 없음
       즉, 직접 초기화 하거나
       초기화 하지 않은 경우 JVM이 각 타입에 맞는 초기값을 대입해줌 (자동초기화)
    3. 타입에 따른 초기값 (0,0.0,false(논리형),\u0000(' ')(문자형), null(참조형))
     */

    public void testBasicArray3() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    public void testArrayException() {
        /*
        ## 배열 관련 예외(오류)
        1. NullPointerException
         : 생성되지 않은 배열 참조변수 사용할 경우 발생
         2. NegativeArraySizeException
          : 배열 생성시 배열의 길이를 음수로 지정할 경우
          3. ArrayIndexOutOfBoundsException
           : 배열 요소 접근시 부적절한 인덱스 사용
         */
        int[] arr = null;
    }
    public void testBasicArray4(){

        //선언과 동시에 초기화 하는 경우
        int[] arr1 = {1, 2,3,4};
        int[] arr2 = new int[] {1, 2, 3,4 };
        // arr1 != arr2 //주소값이라

        /*
        int[] arr;
        //arr = {1,2,3,4};  //불가능
        arr = new int[] {1,2,3,4}; // 가능
        */
    }
    public void testArrayExample1(){
        /*
        크기 10인 정수배열 생성 후
        반복문 통해서 난수값 대입 (1~100)
        출력 (arr[x] : xxx)
         */
        int[] arr = new int[10];
        for(int i=0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*100 + 1);
        }
    }
    public void testArrayExample2(){
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;

        for (int i=0; i < arr.length ; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
            if (arr[i]%2 == 1){
                System.out.println(arr[i]);
            } else {
                sum += arr[i];
                ++count;
            }
        }

        System.out.println("총합 : " + sum);
        System.out.println("개수 : " + count);
    }

    public void testArrayExample3(){
        /*
        사용자에게 배열의 길이 입력받아 해당 길이만큼의 문자열 배열
        반복적으로 과일명을 입력받아 각 요소에 대입
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("좋아하는 과일 개수: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[size];

        for(int i=0; i<fruits.length; i++){
            System.out.print("좋아하는 과일명 입력(종료를 원한다면 exit) :");
            String fruit = sc.nextLine();
            if (fruit.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            fruits[i] = fruit;
        }
        for(int i=0; i<fruits.length; i++) {
            if (fruits[i] != null) {
                System.out.println(fruits[i]);
            }
        }
    }
    public void testArrayExample4(){
        /*
            문자열 하나를 입력받아
            해당 문자열의 각 인덱스 자리의 문자들을
            char 배열에 옮겨 담기
         */
        //1. 문자열 한개 입력받기
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = new char[input.length()];
        for (int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i);
        }

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println(arr);
        //char [] 참조변수는 출력시 각 요소들을 하나의 문자열로 합쳐서 반환되어 출력

        /*
         */

        // 2. char배열 생성해두기


    }

    public void testArrayFault() {
        /*
        5개 정수 데이터 담는 배열 생성
        각 요소에 2,4,6,8,10 담고 출력
         */
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
            System.out.println(arr[i]);
        }
        /*
        배열의 단점
        한번 지정된 배열의 크기는 변경이 불가함
        배열의 크기를 변경하고자 할 경우, 새로운 크기의 배열을 다시 생성해야한다.
         */
        arr = new int[7]; // 새로운 곳 참조(기본 배열은 연결 끊김)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 연결 끊엉진 heap영역에서의 기존 배열 객체는 일정시간 후에 GC(garbage collector)가 삭제시힘
        // >> 자바에서의 "자동메모리 관리" 특징
        // >> 개발자는 메모리 관리 신경쓸 필요 없이 개발에만 집중할 수 있음.

        // 만일 현재 배열 객체도 제거시키고자 할 경우  null을 대입하여 연결을 끊으면 됨.
        // 명확한 종료 시그널 전달

        /*
        GC 실행 시점
        1. 힙 메모리가 부족할때
        2. GC 요청이 있을때 (System.gc())
        3. 백그라운드에서 필요할때
         */
        arr = null;
    }

        public void testEnhancedFor(){
            /*
            ## 향상된 for문
            1. Enhanced for loop
            2. 인덱스를 사용하지 않고 배열요소 또는 컬렉션의 요소들을 순회할 수 있는 for문
            3. 배열의 모든요소들을 순차적으로 변수로 전달해줌
            4. 주로 배열 내의 전체 요소들을 조회할 목적으로 사용
            5. Jdk 1.5이상부터 사용가능
            for (int score : studentScores) { }

             */
            int[] arr = {10, 20, 30, 40, 50};

            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("=====");

            for (int num : arr){
                System.out.println(num);
            }
            //향상된 for문 내의 변수 타입은 배열 요소 타입으로 작성하면됨.

        }

        public void homework(){
        /*사용자에게 문자열 하나를 입력받아
        해당 문자열의 각 문자마다 +1이 진행된 문자열을 얻고 싶다.
         */
            Scanner sc = new Scanner(System.in);
            System.out.print("아무 문자열이나 입력하시오: ");
            String word = sc.nextLine();

            char[] arr = new char[word.length()];
            for (int i=0; i<arr.length; i++){
                arr[i] = (char)(word.charAt(i) + 1);
            }

            /*
            String result = ""; // null;  // nullbbq 이렇게됨
            // null뒤에 연결되기 때문에 null이 아니라 ""해야함
            for(int i=0; i<arr.length;i++){
                result += arr[i];
                // char >> String :for문을 통해 문자열화하기
            }
            */



            // String.valueOf(문자열화시키고자하는 값) : 이것도 static이라 별도의 선언없이 사용가능함.
            String result = String.valueOf(arr); //*******
            System.out.println(result);
        }
        /*

        */

    }



































