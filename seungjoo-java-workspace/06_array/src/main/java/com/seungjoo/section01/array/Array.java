package com.seungjoo.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    /*
      ##배열
      1.Array
      2.동일한 타입의 다수의 데이터를 저장해서 관리할 수 있는 자료구조
      3. 배열의 메모리 구조
        1)배열은 메모리를 할당 받을 때 연속된 공간을 할당받음
        2) 다수의 데이터들이 연속된 공간에 있기 때문에 빠르게 접근 가능
        (반복문을 이용한 연속처리가 가능함)
     */

    public void whyUseArray() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);


        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println(sum);
    }
    /*
    배열 선언
    작성형식
    1) 데이터타입[] 배열이름(추천)
    2) 데이터타입 배열이름[]

    ##배열 생성
    1. 연속된 메모리 공간을 "할당"받아 배열이 만들어지는 과정
    2. 몇 개의 데이터를 담을건지 크기를 미리 지정해야됨.
    3. 메모리의 힙 영역에 해당 크기만큼의 배열 공간이 할당됨
    4. 작성형식
        배열이름 = new 데이터타입[배열길이];

        ##배열 선언과 동시에 생성
        1. 위의 두 과정 동시에
        2. 작성 형식) 데이터타입[] 배열이름 = new 데이터타입[배열 길이];
     */

    public void tsetBasicArray1() {
        // 배열 선언 및 생성(할당)
//        int[] arr; //배열 선언
//        arr = new int[3]; //배열 생성
        int[] arr = new int[3];
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;

        //배열 요소들 출력 및 총 합계 구하기
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("총합계" + sum);
        System.out.println(arr); //주소값을 가지고있는 레퍼런스 변수이므로 배열 객체를 참조하고 있는 주소값 기반의 문자열 출력

        /*
            ##일반 변수와 참조 변수
            1. 일반 변수
            1)리터럴 값을 바로 담을 수 있는 변수
            2) 기본자료형으로 선언된 변수
            2) 참조 변수
            1)생성된 객체의 주소값(참조값)을 담는 변수
         */


    }

    /*
        배열의 메모리 구조
        arr변수에는 heap에 생성된 배열 객체를 참조하는주소값이 실질적으로 담겨있음.
        따라서 이를 참조변수 또는 레퍼런스 변수 라고함
     */
    public void testBasicArray2() {
        int[] arr1 = new int[3]; //0,1,2 인덱스
        double[] arr2 = new double[4];
        String[] arr3 = new String[5];


        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);

        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr3[i]);
        }
        //각 인덱스 자리의 배열 요소에 이미 데이터가 담겨있음.
        //힙은 빈공간이 있을 수없음. 개발자가 초기화를 진행하지 않으면  jvm이 자동초기화를 해줌

        /*
        Heap 메모리 특징
        1. hEAP에 생성되 ㄴ객체마다 고유한 주소값이 주어짐
        주소값은 중복되지 않으므로 다른 객체와 구별되는 식별자의 역할임
        2. 절대 빈공간이 존재할 수 없음
            즉, 직접 초기화하거나
            초기화를 하지않을 경우 JVM이 각 타입에 맞는 초기값을 대입해줌(자동 초기화)

            3)타입에 따른 초기값
            1) 정수형 : 0
            2) 실수형 : 0.0
            3) 논리형 ; false
            4) 문자형 : \u0000('')
            5) 참조형 : null


         */

        System.out.println("=====참조변수 출력======");
        // 출력 형식 : 타입 + @ 16진수 형태의 주소값
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);


    }
    public void testBasicArray3() {
        int[] arr = new int[3];
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);

    }
        System.out.println("배열의 길이 : " + arr.length);
    };


    public void testArrayException(){
        /*
        ##배열 관련 예외(오류)
        1.NullPointerException
        : 생성되지 않은 배열 참조변수 사용할 경우 발생
        2. NegativeArraySizeException
        : 배열 생성시 배열의 길이를 음수로 지정할 경우 발생
        3.ArrayIndeOutOfBoundsException
        : 배열 요소 접근시 부절적한 인덱스 사용시 발생
         */



        /*
        // 1.데이터타입[] 배열이름 = {값들}
           2. 데이터타입[] 배열이름 = new 데이터타입[]{값들}
         */
        //선언과 동시에 초기화하는 경우
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};



        //단, 이미 선언된 배열변수에 초기화를 진행하는 경우
        int[] arr;
//       arr = {1,2,3,4};  // ->이렇게 하면 안됨
        arr = new int[] {1,2,3,4};   //2번 방법은 항상 가능함.










    }
    public void testBasicArray4() {
        /*
        크기 10짜리 정수 배열 생성 후
        반복문 통해서 각 요소에 난수값(1~100) 대입
        출력해보기


         */

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100 + 1);

        }

        for(int i =0; i < arr.length; i++){
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }



    }

    public void testArrayExample2() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            } else if (arr[i] % 2 == 0) {
                sum += arr[i];
                cnt++;
            }
            System.out.printf("%d %d", sum, cnt);
        }
    }

        public void testArrayExample3() {
            Scanner sc = new Scanner(System.in);
            System.out.println("좋아하는 과일개수:");
            int size = sc.nextInt();

            String[] fruits = new String[size];

            for (int i = 0; i < fruits.length; i++) {
                System.out.println("좋아하는 과일명 입력:");
                fruits[i] = sc.next();
            }
            for (int i = 0; i < fruits.length; i++) {
                System.out.println("좋아하는 과일명 입력");
                fruits[i] = sc.nextLine();
            }
        }


            public void testArrayExample4(){

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            char[] ch = new char[str.length()];
            for(int i = 0; i < ch.length; i++){
                ch[i] = str.charAt(i);
            }
                System.out.println(ch);//char[] 참조변수는 출력시 각 요소들을 하나의 문자열로 합쳐서 반환되어 출력









        }
        public void testArrayFault(){

            /*
              5개 정수 데이터 담는 배열 생성
              각 요소에 2,4,6,8,10 담고 출력
             */
            //임의의 변수 활용

            int[] arr = new int[5];
            int value = 2;
            for(int i =0; i<arr.length; i++){
                arr[i] = value;
                value += 2;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);

                System.out.println("arr의 주소값: " + arr.hashCode());

                /*
                배열 단점
                한번 지정된 배열의 크기는 변경이 불가함
                배열의 크기를 변겨앟고자 할 경우 새로운 크기의 배열을 다시 생성
                 */
            }

            /*
                연결이 끊겨진 heap영역에서의 기존 배열 객체는 일정시간 후에 GC(가비지 컬렉터)가 삭제시킴
                -> 자바에서의 "자동 메모리" 특징
                -> 개발자는 메모리 관리 신경쓸 필요 없이 개발에만 집중할 수 있음.
             */

            //만일 현재 배열 객체마저도 제거시키고자 할 경우, 연결을 끊으면 됨 -> null 대입
            arr = null;



        }

        public void testEnhanedFor(){
            /*
                향상된 for문
                1. Enhanced For loop
                2. 인덱스를 사용하지 않고 배열 요소 또는 컬렉션의 요소들을 순회할 수 있는 for문
                3. 배열의 모든 요소들을 순차적으로 변수로 전달해줌
                4. 주로 배열 내의 전체 요소들을 "조회할" 목적으로 사용
                5. jdk 1.5이상부터 사용가능

             */
            int[] arr = {10,20,30,40,50};


            //향상된 for문
            for(int num : arr){
                System.out.println(num);
            }



        }
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
    public void homeWork() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = (char) (str.charAt(i) + 1); //문자 + 숫자 == 숫자타입으로 변환이 되서 이후에 char타입으로 변환해주어야함
        }
        String result = "";
        for (char ch : arr) {
            result += ch;
        }
        System.out.println(result);

//        String result = String.valueOf(arr); //배열의 요소들을 ,와 구분자 없이 합쳐서 반환해줌
//    Arrays.toString(arr);  배열의 요소를 합쳐서 String으로 반환 ->대괄호에 ,를 기준으로 구분하여 반환
// [10,20,30] 이렇게 반환

        //String.valueOf(문자열화시키고자하는 값) -> 배열이 됬든 숫자가됬든 문자열로 만들어 반환

    }










    }



























































