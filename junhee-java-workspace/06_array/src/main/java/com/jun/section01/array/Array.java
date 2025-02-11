package com.jun.section01.array;

import java.util.Scanner;

public class Array {

    /*
        ## 배열 ##
        1. Array
        2. 동일한 타입의 다수의 데이터를 저장해서 관리할 수 있는 자료구조
        3. 배열의 메모리 구조
           1) 배열은 메모리를 할당 받을 때 연속된 공간을 할당 받음
           2) 다수의 데이터들이 연속된 공간에 있기 때문에 빠르게 접근 가능
              (반복문을 이용한 연속 처리가 가능함)
     */

    public void whyUseArray() {
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
        System.out.println(sum);

    }

    /*
        ## 배열 선언 ##
        1. 배열의 타입과 이름을 결정하는 과정
        2. 배열 선언만으로 배열이 생성되는 것은 아니므로 주의해야함
        3. 작성 형식 ─────────────────────────┐
           │ 1) 데이터타입[] 배열이름 (추천)  │
           │ 2) 데이터타입 배열이름[]         │
           └──────────────────────────────────┘

        ## 배열 생성 ##
        1. 연속된 메모리 공간을 "할당" 받아 배열이 만들어지는 과정
        2. 몇 개의 데이터를 담을건지 크기를 미리 지정해야됨
        3. 메모리의 Heap(힙)영역에 해당 크기만큼의 배열 공간이 할당됨
        4. 작성 형식 ─────────────────────────────┐
           │ 배열이름 = new 데이터타입[배열길이]; │
           └──────────────────────────────────────┘

        ## 배열 선언과 동시에 생성 ##
        1. 위의 두 과정 동시에
        2. 작성 형식 ──────────────────────────────────────────┐
           │ 데이터타입[] 배열이름 = new 데이터타입[배열길이]; │
           └───────────────────────────────────────────────────┘

     */

    public void testBasicArray1() {
        // 배열 선언 및 생성(할당)

        //int[] arr; // 배열 선언
        //arr = new int[3]; // 배열 생성
        int[] arr = new int[3]; // 배열 선언과 동시에 생성

        /*
            ## 배열의 메모리 구조 ##
            Stack(스택)            Heap(힙)
                              0X123
            ┌───────┐        ┌─────┐─────┐─────┐
            │ 0X123 │ ------ │  0  │  0  │  0  │
            └───────┘        └─────┘─────┘─────┘
               arr             [0]   [1]   [2]     => 인덱스
                             arr[0] arr[1] arr[2]  => 배열요소

            arr 변수에는 Heap에 생성된 배열객체를 참조하는 주소값이 실질적으로 담겨있음
            따라서 이를 참조변수 또는 레퍼런스변수 라고함

            ## 배열 인덱스 ##
            1. 배열 요소를 구분하기 위한 고유 숫자
            2. 0부터 순차적으로 증가되며 부여됨

            ## 배열 요소 ##
            1. 배열에 저장된 각각의 데이터를 의미
            2. 배열이름과 대괄호[] 그리고 인덱스를 이용해서 배열 요소 나타냄
            3. 배열요소는 개별적인 변수 같은 개념
         */

        // 배열요소에 데이터 대입
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // 배열요소들 출력 및 총합계 구하기
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("총합계: " + sum);

        System.out.println(arr); // 배열객체를 참조하고 있는 주소값 기반의 문자열 출력

        /*
            ## 일반변수와 참조변수 ##
            1. 일반 변수
               1) 리터럴값을 바로 담을 수 있는 변수
               2) 기본자료형으로 선언된 변수
            2. 참조 변수
               1) 생성된 객체의 주소값(참조값)을 담는 변수
               2) 기본자료형 외의 자료형(String, 배열, ..)으로 선언된 변수
         */

    }

    public void testBasicArray2() {
        /*
            3개의 정수 데이터를 보관할 배열,
            4개의 실수         "
            5개의 문자열       "       배열 생성한 후
            곧바로 각 배열의 요소 출력해보기
         */
        int[] arr1 = new int[3]; // 0, 1, 2 인덱스
        double[] arr2 = new double[4]; // 0, 1, 2, 3 인덱스
        String[] arr3 = new String[5]; // 0, 1, 2, 3, 4 인덱스

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr3[i]);
        }

        // 각 인덱스 자리의 배열요소에 이미 데이터가 담겨있음

        /*
            ## Heap 메모리 특징 ##
            1. Heap에 생성된 객체마다 고유한 주소값(참조값)이 부여됨
               주소값은 중복되지 않으므로 다른 객체와 구별되는 식별자의 역할임
            2. 절대 빈공간이 존재할 수 없음
               즉, 직접 초기화 하거나
               초기화를 하지 않을 경우 JVM이 각 타입에 맞는 초기값을 대입해줌 (자동 초기화)
            3. 타입에 따른 초기값
               1) 정수형 : 0
               2) 실수형 : 0.0
               3) 논리형 : false
               4) 문자형 : \u0000('')
               5) 참조형 : null
         */

        System.out.println("==== 참조변수 출력 ====");
        // 출력형식 : 타입 + @ + 16진수형태의 주소값
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        // 레퍼런스변수.hashCode() : 10진수형태의 주소값
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr3.hashCode());

    }

    public void testBasicArray3() {
        // 5개의 정수 데이터를 담을 수 있는 배열 생성 후 임의의 숫자값 담아 출력
        int[] arr = new int[5];

        // 각 배열요소에 1~5까지의 숫자 담기
        /*
            arr[0] = 1;
            arr[1] = 2;
            ....
            arr[4] = 5;
         */
        for (int i = 0; i </*5*/arr.length; i++) {
            arr[i] = i + 1;
        }

        // 출력
        for (int i = 0; i </*5*/arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("배열의 길이 : " + arr.length);

    }

    public void testArrayException() {
        /*
            ## 배열 관련 예외(오류) ##
            1. NullPointerException
               : 생성되지 않은 배열 참조변수 사용할 경우 발생
            2. NegativeArraySizeException
               : 배열 생성시 배열의 길이를 음수로 지정할 경우 발생
            3. ArrayIndexOutOfBoundsException
               : 배열 요소 접근시 부적절한 인덱스 사용시 발생
         */
        int[] arr = null; // 배열 선언 (생성 x)

        // NullPointerException
        // System.out.println(arr.length);
        // System.out.println(arr[1]);

        // NegativeArraySizeException
        // arr = new int[-5];

        arr = new int[5]; // 인덱스 : 0~4

        System.out.println(arr[4]);

        // ArrayIndexOutOfBoundsException
        // System.out.println(arr[5]);

    }

    public void testBasicArray4() {
        /*
            ## 배열 초기화 ##
            1. 배열이 생성될 때 각 요소의 값들을 원하는 값으로 바로 초기화 가능
            2. 여러 요소의 값들을 한번에 초기화 할 수 있으므로 편리함
            3. 초기값으로 넣고자 하는게 정해져있을 경우 주로 사용
            4. 작성 형식 ────────────────────────────────────────────────────┐
               │ 1) 데이터타입[] 배열이름 = {값1, 값2, ...};                 │
               │ 2) 데이터타입[] 배열이름 = new 데이터타입[]{값1, 값2, ...}; │
               └─────────────────────────────────────────────────────────────┘
         */

        // 선언과 동시에 초기화 하는 경우
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};

        // 단, 이미 선언된 배열변수에 초기화를 진행하는 경우
        int[] arr;
        //arr = {1, 2, 3, 4}; // 오류
        arr = new int[]{1, 2, 3, 4};

        System.out.println(arr1 == arr2); // false
        // == 동등비교는 각 변수에 담긴 값을 가지고 비교함
        // 참조변수에는 다른 주소값이 담겨있으므로 false

    }

    public void testArrayExample1() {
        /*
            크기 10짜리 정수 배열 생성 후
            반복문 통해서 각 요소에 난수값(1~100) 대입
            출력해보기 (arr[x] : xx)
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.println("arr[" + i + "] : " + arr[i]);
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

    }

    public void testArrayExample2() {
        /*
            실습.
            크기 10짜리 정수 배열 생성 후
            모든 요소에 난수값(1~100) 대입

            모든 배열 요소 출력
            단, 배열요소 값이 홀수일 경우에만 출력

            추가.
            배열요소 값이 짝수인 데이터들의 총합과 개수를 출력
         */
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        int sum = 0; // 짝수 요소들의 총합
        int cnt = 0; // 짝수 요소들의 개수
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.printf("arr[%d] : %d\n", i, arr[i]);
            } else { // 짝수일 경우
                cnt++;
                sum += arr[i];
            }
        }

        System.out.println("짝수들의 총합: " + sum);
        System.out.println("짝수들의 개수: " + cnt);

    }

    public void testArrayExample3() {
        /*
            사용자에게 배열의 길이 입력받아 해당 길이만큼의 문자열 배열
            반복적으로 과일명을 입력받아 각 요소에 대입
            출력
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("좋아하는 과일 개수: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[size];

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("좋아하는 과일명 입력(종료를 원한다면 exit): ");
            String fruit = sc.nextLine();
            if (fruit.equals("exit")) {
                break;
            }
            fruits[i] = fruit;
        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null) {
                System.out.println(fruits[i]); // 배열요소값이 null이 아닐 경우 출력
            }
        }

    }

    public void testArrayExample4() {
        /*
            문자열 하나를 입력받아
            해당 문자열의 각 인덱스 자리의 문자들을
            char 배열에 옮겨 담기
         */

        // 1. 문자열 한개 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        // 2. char배열 생성해두기 (배열의 크기 == 문자열의 길이)
        char[] arr = new char[str.length()];

        // 3. 각 인덱스별 문자를 char배열의 각 인덱스 자리에 대입
        /*
            arr[0] = str.charAt(0);
            arr[1] = str.charAt(1);
            ...
            arr[마지막] = str.charAt(마지막);
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        // 4. 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr); // char[] 참조변수는 출력시 각 요소들을 하나의 문자열로 합쳐서 반환되어 출력

    }

    public void testArrayFault() {

        /*
            5개 정수 데이터 담는 배열 생성
            각 요소에 2,4,6,8,10 담고 출력
         */
        int[] arr = new int[5];

        /*
            			    인덱스활용		임의변수활용
            arr[0] = 2;		2 * (0+1)		  2
            arr[1] = 4;		2 * (1+1)		  2+2
            arr[2] = 6;		2 * (2+1)		  2+2+2
            arr[3] = 8;		2 * (3+1)		  2+2+2+2
            arr[4] = 10;	2 * (4+1)		  2+2+2+2+2
         */

        // 인덱스활용
        /*
        for(int i=0; i<arr.length; i++){
            arr[i] = 2 * (i + 1);
        }
         */

        // 임의의 변수 활용
        int value = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value += 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("arr의 주소값: " + arr.hashCode());

//        arr[5] = 12;

        /*
            ## 배열 단점 ##
            한번 지정된 배열의 크기는 변경이 불가함
            배열의 크기를 변경하고자 할 경우 새로운 크기의 배열을 다시 생성
         */
        arr = new int[7]; // 새로운 곳 참조(기존 배열은 연결 끊김)

        System.out.println("변경된 배열의 주소값: " + arr.hashCode());

        /*
            연결이 끊겨진 Heap영역에서의 기존 배열 객체는 일정시간 후에 GC(가비지 컬렉터)가 삭제시킴
            => 자바에서의 "자동메모리 관리" 특징
            => 개발자는 메모리 관리 신경쓸 필요 없이 개발에만 집중할 수 있음
         */

        // 만일 현재 배열 객체마저도 제거시키고자 할 경우 => 연결을 끊으면 됨 => null 대입
        arr = null;

    }

    public void testEnhancedFor() {
        /*
            ## 향상된 for문 ##
            1. Enhanced For Loop
            2. 인덱스를 사용하지 않고 배열 요소 또는 컬렉션의 요소들을 순회할 수 있는 for문
            3. 배열의 모든요소들을 순차적으로 변수로 전달해줌
            4. 주로 배열 내의 전체 요소들을 "조회"할 목적으로 사용
            5. JDK1.5 이상부터 사용 가능
            6. 작성 형식 ─────────────────────────────┐
               │ for(변수선언 : 순회할배열및컬렉션) { │
               │     변수활용                         │
               │ }                                    │
               └──────────────────────────────────────┘
         */
        int[] arr = {10, 20, 30, 40, 50};

        // 일반 for문
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("====");

        // 향상된 for문
        for (int num : arr) { // num = arr[0] => arr[1] => arr[2] => ... => arr[마지막]
            System.out.println(num);
        }
        // 향상된 for문 내의 변수 타입은 배열 요소 타입으로 작성하면됨

    }

    public void homework() {
        /*
            실습.
            사용자에게 문자열 하나를 입력받아
            해당 문자열의 각 문자마다 +1이 진행된 문자열을 얻고 싶다.
            ex) "AAP" => "BBQ"    / "GDKKN" => "HELLO"

            1. 사용자에게 문자열 입력받기
            2. 입력된 문자열의 각 인덱스 문자의 +1 된 문자를 기록할 char배열 생성하기
            3. 생성한 배열의 각 인덱스 자리에 문자+1 값 대입
            4. char배열의 각 인덱스에 담긴 문자값들을 하나의 문자열로 합쳐서 변수(String result)에 기록하기
            5. 해당 문자열 변수 결과값 출력
         */
    }
}

