package com.younggalee.section02.try_catch_handing;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("배열의 길이(양수) :");
            int size = sc.nextInt(); // InputMismatchException
            int[] arr = new int[size]; // NegativeArraySizeException
            System.out.println(Arrays.toString(arr));
            System.out.print("배열인덱스 : ");
            int index = sc.nextInt();
            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e){ // 부모타입 예외클래스 >> 자식예외객체 수용가능
            // negative, arrayindex 둘다
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
            System.out.println("배열과 관련된 문제가 발생되었습니다. " + e); // 빠져나감
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
            System.out.println("================");
//            e.printStackTrace(System.out);
        }
        // 여러 예외를 한번에 받아 처리하고자 할 경우 부모 예외클래스 타입으로 작성가능


        // **********************
        // 여러 예외를 한번에 받아 처리하고자 할 경우 부모 예외클래스 타입으로 작성가능
        // 단, 순서 유의할 것 (하위 예외클래스 타입이 상위 에외클래스 타입보다 아래에 위치해 있으면 안됨)
    }
}
