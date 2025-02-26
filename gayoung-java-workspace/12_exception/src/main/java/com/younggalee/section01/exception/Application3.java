package com.younggalee.section01.exception;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        // 예외상황3. 사용자에게 문자열을 입력받아 숫자로 변환하여 출력하기
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 : ");
        String numStr = sc.nextLine();

        int num = Integer.parseInt(numStr); // NumberFormatException
        System.out.println(num);
    }
}
