package com.minkook.section01.array;

import java.util.Scanner;

public class Array {
    /*
        ## 배열 생성 ##
        1. 연속된 메모리 공간을 할당 받아 배열이 만들어지는 과정
        2. 몇 개의 데이터를 담을건지 크기를 미리 지정되어야 함
        3. 메모리의 Heap(힙)영역에 해당 크기만큼의 배열 공간이 할당됨
    */
    public void whyUseArray(){
        int num1 = 50;
        int num2 = 20;
        System.out.println(num1);
        System.out.println(num2);

        int sum = 0;
        sum += num1;
        sum += num2;
        System.out.println(sum);

        int [] num = new int[10];

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }

    public void testbasicArray(){
        int [] num = new int[5];
        /*
            ##배열인덱스 0부터 시작 배열요소의 고유주소

            ##배열 요소 배열에 저장된 각각의 데이터를 의미
         */
        num[0] = 10;
        num[1] = 20;
        num[3] = 30;
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
            sum += num[i];
        }
        System.out.println(sum);
    }

    public void testbasicArray2(){
        /*
            3개의 정수 데이터를 보관할 배열
            4개의 실수
            5개의 문자열
         */
        int [] arr1 = new int[3];
        double [] arr2 = new double[4];
        String [] arr3 = new String[5];

        for(int i = 0; i< arr1.length; i++){
            System.out.println("arr1의 배열요소는:" + arr1[i]);
        }

        for(int i = 0; i< arr2.length; i++){
            System.out.println("arr2의 배열요소는:" + arr2[i]);
        }

        for(int i = 0; i< arr3.length; i++){
            System.out.println("arr3의 배열요소는:" + arr3[i]);
        }
        
        //각 인덱스 자리의 배열요소에 이미 데이터가 담겨있음
        
        /*
            ## Heap 메모리 특징 ##
            1. Heap에 생성된 객체마다 고유한 주소값(참조값)이 부여됨
                주소값은 중복되지 않으므로 다르 객체와 구별되는 식별자의 역활임
            2. 절대 빈공간이 존재할 수 없음
                즉 직접 초기화 하거나
                초기화를 하지않을 경우 JVM이 각 타입에 맞는 초기값을 대입해줌
         */
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr3.hashCode());


    }
    public void testBasicArray3(){
        int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("배열의 길이: " + arr.length);
    }

    public void testArrayException(){
        /*
            ## 배열 관련 예외(오류) ##
            1. NullPointerException
                :생성되지 않은 배열 참조변수 사용할 경우 발생
            2. NegativeArraySizeException
                : 배열 생성시 배열의 길이를 음수로 지정할 경우 발생
            3. ArrayIndexOutofBoundsException
                : 배열 요소 접근시 부적절한 인덱스 사용시 발생
         */
        int [] arr = null;
        System.out.println(arr.length);

    }

    public void testBasicArray4(){
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[]{1,2,3,4,5};
        
        //단 이미 선언된 배열변수에 초기화를 진행하는 경우
        int [] arr;
        arr = new int[]{1,2,3,4,5};

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }



    }

    public void testBasicArray5(){
        int [] arr1  = new int[10];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = (int)(Math.random() * 100 + 1);
        }

        for(int i = 0; i<arr1.length; i++){
            System.out.println("arr[" + i + "]: " + arr1[i]);
        }

    }

    public void testBasicExample2(){
        int [] arr  = new int[10];
        int addSum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                System.out.println(arr[i]);
            } else{
                addSum += arr[i];
            }

        }
        System.out.println("짝수인 데이터들의 총합: " + addSum);



    }

    public void testBasicExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 과일 개수: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[size];

        for(int i = 0; i < fruits.length; i++){
            System.out.print("좋아하는 과일명 입력(종료를입력하면 exit): ");
            fruits[i] = sc.nextLine();
            if(fruits[i].equals("exit")){
                break;
            }
        }

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i] != null) {
                System.out.println("입력한 좋아하는 과일" +(i+1) + "번째: " + fruits[i]);
            }
        }
    }

    public void testBasicExample4(){
        /*
            문자열 하나를 입력받아
            해당 문자열의 각 인덱스 자리의 문자들을
            char 배열에 옮겨 담기
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        char[] arr = new char[str.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr); //char[] 참조변수는 출력시 각 요소들을 하나의 문자로 합쳐서 반환되어 출력
    }
    public void testArrayFault(){
        /*
            5개 정수 데이터 담는 배열 생성
         */
        int [] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 2 * (i+1);
        }

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
        System.out.println("arr의 주소값 " + arr.hashCode());

//        arr[5] = 12;

        /*
            ## 배열 단점 ##
            한번 지정된 배열의 크기는 변경이 불가함
            배열의 크기를 변경하고자 할 경우 새로운 크기의 배열을 다시 생성
         */

//        int idx = 0;
//        for(int i = 0; i < arr.length; i++){
//           idx += 2;
//           arr[i] += idx;
//        }
//
//        for(int i = 0; i < arr.length; i++){
//
//            System.out.println(arr[i]);
//        }
        /*
            연결이 끊겨진 Heap영역에서의 기존 배열객체는 일정시간 후에 GC(가비지 컬렉터)가 삭제시킴
            ==> 자동 메모리 관리특징
         */
        // 만일 현재 배열 객체마저도 제거시키고자 할 경우 -> 연결을 끊으면 됨 => null 대입


    }

    public void testEnhancedFor(){
        /*
            ## 향상된 for문 ##
            1. Enhanced for Loop
         */
        int[] arr ={10,20,30,40,50};

        //일반
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("====");

        for(int j : arr){
            System.out.println(j);

        }
        // 향상된 for문 내의 변수 타입은 배열 요소 타입으로 작성하면됨
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
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        char [] arr = new char[str.length()];

        int idx = 1;
        for(int i = 0; i < arr.length; i++){

            char res = (char)(str.charAt(i) + idx);
            System.out.print(res);

        }


    }
}
