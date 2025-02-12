package com.kyungbae.section01.array;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    // # 배열 (array)

    public void whyUseArray(){
        // 변수만을 가지고 프로그래밍

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
//        ...

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
//        ...

        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
//        ...
        System.out.println(sum);

    }

    /* # 배열 선언
    *   1) 데이터타입[] 배열이름
    *   2) 데이터타입 배열이름[]
    *
    *  # 배열 생성
    *   메모리 구조 : stack heap static
    *   메모리의 Heap 영역에 배열 공간 할당
    *   배열이름 = new 데이터타입[배열길이];
    *   new => Heap 영역에 생성하겠다
    *
    *  # 배열 선언 및 생성 동시
    *   데이터타입[] 배열이름 = new 데이터타입[배열길이];
    *
    * */

    public void testBasicArray1(){
        // 배열 선언 및 생성

//        int[] arr; // 배열 선언
//        arr = new int[5]; // 배열 생성
        int[] arr = new int[3]; // 배열 선언 및 생성
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // 출력
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        int sum = 0;
        for (int i = 0; i < 3; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println(arr); // arr 배열의 주소값(16진수)이 나타남

    } // tBA1 end

    public void testBasicArray2(){
        /*
        *   3개의 정수 데이터를 보관할 배열
        *   4개의 실수
        *   5개의 문자열
        *   배열 생성한 후
        *   배열의 요소 출력해보기
        * */

        int[] ina = new int[3];         // 0, 1, 2 인덱스
        double[] doa = new double[4];   // 0, 1, 2, 3 인덱스
        String[] sta = new String[5];   // 0, 1, 2, 3, 4 인덱스

//        for ( int i = 0; i < 3; i++){
//            System.out.println(ina[i]);   // 빈 공간에 0 출력
//        }
//        for ( int i = 0; i < 4; i++){
//            System.out.println(doa[i]);   // 빈 공간에 0.0 출력
//        }
//        for ( int i = 0; i < 5; i++){
//            System.out.println(sta[i]);   // 빈 공간에 null 출력
//        }

//        // 참조변수 출력
        System.out.println(ina);
        System.out.println(doa);
        System.out.println(sta);
        // 출력형식 : 타입 + @ + 16진수형태의 주소값

        // 10진수로 출력형식 보는 법
        // 레퍼런스변수.hachCode()
        System.out.println(ina.hashCode());
        System.out.println(doa.hashCode());
        System.out.println(sta.hashCode());

    } // tBA2 end

    public void testBasicArray3(){
        // 5개 정수 데이터를 담을 수 있는 배열 생성 후 임의의 숫자값 담아 출력
        // 정적인 변수 길이
        /*
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++){
//            arr[i] = (int)((Math.random() * 10 + 1));
            arr[i] = i + 1;
//            System.out.println(arr[i]);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

         */

        // 동적인 array 길이 파악
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        // ** 배열.length == 해당 배열의 길이
        for (int i = 0; i < arr.length; i++){ // 배열의 길이를 파악해서 자동으로 찾게 설정 => 유지보수 차원에서도 좋은 코드
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("배열의 길이 : " + arr.length);


    } // tBA3 end

    public void testArrayException(){
        /*
            # 배열 관련 오류
            1. NullPointerException
                : 생성되지 않은 배열 참조변수 사용할 경우 발생
            2. NegativeArraySizeException
                : 배열 생성시 배열의 길이를 음수로 지정할 경우 발생
            3. ArrayIndexOutOfBoundsException
                : 배열 요소 접근시 부적절한 인덱스 사용시 발생
         */

        int[] arr = null; // 참조변수 초기화 상태, 선언만 하고 생성되지 않은 형태

        // 1. NullPointerException
//        System.out.println(arr.length);
//        System.out.println(arr[1]);

        // 2. NegativeArraySizeException
//        arr = new int[-5]; // 음수로 배열 생성 시 오류

        // 3. ArrayIndexOutOfBoundsException
        arr = new int[5]; // 인덱스 : [0] ~ [4]

//        System.out.println(arr[5]); // 없는 인덱스 오류


    } // tAE end

    public void testBasicArray4(){
        // 선언과 동시에 초기화 하는 경우
        int[] arr1 = {1,2,3,4}; // 자동으로 4개의 인덱스 생성 및 각 대응하는 숫자로 초기화
        int[] arr2 = new int[] {1,2,3,4};

        // 이미 선언된 배열변수에 초기화를 진행하는 경우
        int[] arr;
//        arr = {1,2,3,4}; // 오류 발생
        arr = new int[] {1,2,3,4};

        System.out.println(arr1 == arr2); // false
        // == 동등비교는 변수의 값을 비교
        // arr1 및 arr2 의 변수값은 담긴 숫자들이 아닌 주소값이므로 false

    } // tBA4 end

    public void testArrayExample1(){
        /*
            크기 10짜리 정수 배열 생성 후
            반복문 통해서 각 요소에 난수값(1~100) 대입
            출력해보기 (arr[x] : xx)
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

    } // tAE1 end

    public void testArrayExample2(){
        /*
            실습.
            크기 10짜리 정수 배열 생성 후
            모든 요소에 난수값(1~100) 대입

            모든 배열 요소 출력
            단, 배열요소 값이 홀수일 경우에만 출력
            짝수의 갯수, 짝수의 총 합 출력
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 + 1 );
        }
        int sum = 0;
        int count = 0;
        for(int i=0; i < arr.length; i++){
            if (arr[i] % 2 == 1){
                System.out.printf("arr[%d] : %d\n", i, arr[i]);
            }else{
                sum += arr[i];
                count++;
            }
        }
        System.out.printf("짝수 갯수 : %d\n 총합 : %d", count, sum);

    } // tAE2 end

    public void testArrayExample3(){
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

        System.out.println("종료를 원한다면 : exit");

        for(int i = 0; i < fruits.length; i++){
            System.out.print("과일명 입력 : ");
            String fruit = sc.nextLine(); // 바로 fruits[i] 에 넣지않고 함수 하나 추가
            if (fruit.equals("exit")) { // 탈출
                break;
            }
            fruits[i] = fruit;
        }

        for ( int i = 0; i < fruits.length; i++){
            if(fruits[i] != null) {
                System.out.println(fruits[i]); // 배열요소값이 null이 아닐 경우 출력
            }
        }

    } // tAE3 end

    public void testArrayExample4(){
        /*
            문자열을 입력받아
            해당 문자열의 인덱스 자리의 문자들을
            char 배열에 옮겨 담기
         */
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        System.out.print("문자열 입력 : ");
        String text = sc.nextLine();

        // char 배열 생성
        char[] ch = new char[text.length()];

        // 각 인덱스 별 char 입력
        for (int i = 0; i < text.length(); i++){
            ch[i] = text.charAt(i);
        }

        // 출력
        for ( int i = 0; i < text.length(); i++){
            System.out.printf("ch[%d] = %c\n", i, ch[i]);
        }

        System.out.println(ch); // 출력 = apple
        // **char[] 참조변수는 출력시 각 요소들을 하나의 문자열로 합쳐서 반환되어 출력

    } // tAE4 end

    public void testArrayFault(){
      /*
        5개의 정수 데이터 담는 배열 생성
        각 요소에 2,4,6,8,10 담고 출력
       */
        int[] arr= new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = 2 * (i + 1);
        }

        /*
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = num;
            num += 2;
        }
         */

        /*
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
         */

        for ( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("주소값 : " + arr.hashCode());

//        arr[5] = 12; // 없는 배열크기 오류

        /*
        *   # 배열 단점
        * 한번 지정된 배열의 크기는 변경이 불가
        * 배열의 크기를 변경하고자 할 때 새로운 크기의 배열을 다시 생성
        *
        * */

        arr = new int[7]; // 크기 변경을 위해 배열 재생성

        for ( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); // 0 출력
        }

        System.out.println("주소값 : " + arr.hashCode()); // 재생성시 주소 변경과 함께 초기화
        // ** GC (가비지 컬렉터) 가 필요없어진 기존 데이터는 일정 시간 후 삭제

        arr = null; // 배열객체를 null 로 초기화 시켜 필요가 없어진 배열 객체를 제거 후 삭제 시킬 수 있음

    } // tAF end

    public void testEnhancedFor(){
        // 향상된 for문 (Enhanced For)

        int[] arr = {10,20,30,40,50};

        // 일반 for문
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("===========");

        // 향상된 for문
        // 배열의 요소값을 처음부터 끝까지 대입
        for (int num : arr){ // num == arr[0] => arr[1] => ... arr[마지막]
            System.out.println(num);
        }
        // 향상된 for문의 배열 타입은 요소 타입으로 작성


    } // tEF end

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

        // 문자열 입력
        System.out.print("문자열을 입력 : ");
        String srt = sc.nextLine();

        // char배열 생성
        char[] word = new char[srt.length()];

        // char배열에 각 문자 삽입
        for (int i = 0; i < srt.length(); i++){
            word[i] = (char)(srt.charAt(i) + 1);
        }

        // 하나의 문자열로 합
        String result = "";
        for (char j : word){
            result += j;
        }

        // 출력
        System.out.println(result);


    } // homework end


} // class end
