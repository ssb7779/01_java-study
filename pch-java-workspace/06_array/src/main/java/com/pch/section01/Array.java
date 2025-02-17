package com.pch.section01;

import java.util.Scanner;

public class Array {

    public void whyUseArray(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        int sum = 0;
        sum+=num1;
        sum+=num2;
        sum+=num3;
        sum+=num4;
        sum+=num5;
        System.out.println(sum);
    }

    public void testBasicArray1(){
        int arr[] = new int[3];

        for(int i = 0; i<arr.length; i++){
            arr[i] = i*10;
            System.out.println(arr[i]);
        }

    }

    public void testBasicArray2(){

    }

    public void testBasicArray3(){
        int arr[] = new int[5];

        int len = arr.length;
        for(int i = 0; i<len; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i<len; i++){
            System.out.println(arr[i]);
        }

        System.out.println("배열의 길이 : "+len);
    }

    public void testArrayException(){
        int []arr = null;

        arr = new int[-1];
    }

    public void testArrayExample1(){}

    public void testArrayExample2(){
        int []arr = new int[10];
    }

    public void testArrayExample3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("좋아하는 과일 갯수는?");

        int size = sc.nextInt();

        String[] fruits = new String[size];

        for(int i = 0; i<fruits.length; i++){
            System.out.println("좋아하는 과일명 입력(exit 입력시 종료) : ");
            String fruit = sc.nextLine();
            if(fruit.equals("exit")){
                break;
            }
            fruits[i] = fruit;
        }

        for(int i = 0; i<fruits.length; i++){
            if(fruits[i] != null){
                System.out.println(fruits[i]);
            }
        }
    }
    public void testArrayExample4(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];

        for(int i = 0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }

        for(char c : arr){
            System.out.println(c);
        }
        System.out.println(arr);
    }

    public void testArrayFauilt(){
        int []arr = new int[5];
        for(int i =0; i< arr.length; i++)arr[i] = (i+1)*2;
        for(int id : arr) System.out.println(id);
    }

    public void practice(){
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
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] += 1;
        }
        for(char c : arr) System.out.println(c);
    }

    
}
