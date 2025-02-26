package com.younggalee.section01.exception;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // 예외상황2. 사용자에게 배열의 길이를 입력받아 배열 생성 >> 출력시킬 인덱스 수도 입력 받아 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 길이: "); // NegativeArraySizeException : -9
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println(Arrays.toString(arr));

        System.out.print("배열 인덱스: ");
        int index = sc.nextInt();
        System.out.println(arr[index]); // ArrayIndexOutOfBoundsException 발생가능
    }
}
