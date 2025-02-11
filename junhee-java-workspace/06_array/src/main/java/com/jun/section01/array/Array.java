package com.jun.section01.array;

import java.util.Scanner;

public class Array {
    public void whyUseArray() {
        //변수만을 가지고 프로그래밍

        //변수 개를 만들어 각 값 저장
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;


        for (int i = 1; i <= 5; i++) {
            System.out.println(num1);
        }

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
        # 배열 선언 ##
        1. 배열의 타입과 이름을 결정하는 과정
        2. 배열 선언만으로 배열이 생성되는 거은 아니므로 주의해야함
        3. 작성 형식
          1) 데이터타입[] 배열이름 (추천)
          2) 데이터타입 배열이름[]

          ## 배열 생성 ##
          1. 연속된 메모리 공간을 할당 받아 배열이 만들어지는 과정
          2. 몇 개의 데이터를 담을건지 크기를 미리 지정해야함
          3. 메모리의 heap(힙)영역에 해당 크기만큼의 배열 공간이 할당됨
          4. 작성 형식
             배열 이름 = new 데이터타입[배열길이];

             ## 배열 선언과 동시에 생성 ##
             1. 위의 두 과정 동시에
             2. 작성 형식
                데이터타입[] 배열이름 = new 데이터타입[배열길이];
     */

    public void testBasicArray1(){
        // 배열 선언 및 생성(할당)


//        int[]arr; // 배열 선언문
//        arr = new int[5];//배열 생성
        int[]arr = new int[3];//배열 선언과 동시에 생성

        /*
            ## 배열의 메모리 구조 ##



            arr 변수에는 Heap에 생성된 배열객체를 참조하는 주소값이 실질적으로 담겨있음
            따라서 이를 참조변수 또는 레퍼런스변수 라고함
         */

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //배열 요소들 출력 및 총합계 구하기
        int sum = 0;
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("총합계: " + sum);

        System.out.println(arr);// 배열객체를 참조하고 있는 주소값 기반의 문자열 출력


    }

public void testBasicArray2(){







        //각 인덱스 자리의 배열요소에 이미 데이터가 담겨있음
}
public void testBasicArray3(){

        int [] arr = new int[7];

        /*

         */
    for(int i = 0; i<arr.length;i++ ){
        arr[i] = i+1;
    }
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    System.out.println("배열의길이 :" + arr.length);//length는 배열의 길이 측정


}


public void testArrayException(){


        int[] arr = null;

    //System.out.println(arr.length);
    //System.out.println(arr[1]);

    //arr = new int[-5]

    arr = new int[5]; // 인덱스 : 0~4

    System.out.println(arr[4]);
    //System.out.println(arr[5]);


}

public void testBasicArray4(){



        //선언과 동시에 초기화 하는 경우
    int[] arr1 = {1,2,3,4};
    int[] arr2 = new int[]{1,2,3,4};

    //단, 이미 선언된 배열변수에 초기화를 진행하는 경우
    int[] arr;
    //arr = {1,2,3,4}; // 오류
    arr = new int[]{1,2,3,4};

    System.out.println(arr1 == arr2);; // faise
    // ==동등비교는 각 변수에 담긴 값을 가지고 비교함
    // 참조변수는 다른 주소값이 담겨있으므로 faise
}

public void testArrayExample1(){
        int[]arr = new int[10];

        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random() * 100 + 1);
        }
        for(int i = 0; i<arr.length;i++){
            System.out.println("arr[" +  i +"] : " + arr[i]);
        }
}

    public void testArrayExample2() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.printf("arr[%d]: %d\n", i, arr[i] );
            }
        }




    }

    public void testArrayExample3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("좋아하는 과일 개수: ");
        int size = sc.nextInt();

        String[] fruits = new String[size];

        sc.nextLine();

        for(int i=0; i<fruits.length; i++){
            System.out.print("좋아하는 과일명 입력(종료를 원한다면 exit):");
          //  fruits[i] = sc. nextLine();
            String friuit = sc.nextLine();
            if(friuit.equals("exit")){
                break;
            }
            fruits[i] = friuit;
        }
        for(int i=0; i<fruits.length; i++){
            if(fruits[i] !=null) {
                System.out.println(fruits[i]);// 배열요소값이 null이 아닐 경우
            }
        }
    }
    public void testArrayExample4(){

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        char[]arr = new char[str.length()];

        for(int i = 0; i<arr.length; i++){
            arr[i]= str.charAt(i);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr);//char[] 참조변수는 출력시 각 요소들을 하나의 문자열로 합쳐서 반환되어 출력


    }

    public void testArrayFault(){

        int [] arr = new int[5];

        for(int i=0; i<arr.length; i++ ){
            arr[i] = 2* (i+1);

        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("arr의 주소값:" + arr.hashCode());
       // arr[5] = 12;

        arr = new int[7];

        System.out.println("변경된 배열의 주소값:" + arr.hashCode());

        arr = null;
    }

    public void testEnhancedFor(){

        int[]arr = {10,20,30,40,50};

        //일반 for문
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("=====");
       //향상된 포문
       for(int num : arr){
           System.out.println(num);
       }


    }
    public void homework(){
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
