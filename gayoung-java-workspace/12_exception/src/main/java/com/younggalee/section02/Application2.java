package com.younggalee.section02;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("0이 아닌 정수만 : ");
            int num = Integer.parseInt(sc.nextLine()); // NumberFormatException
            System.out.println("나눗셈 결과 : " + 10 / num); // ArithmeticException
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (NumberFormatException e){
            System.out.println("정수로 변환할 수 없는 값을 입력하셨습니다. ");
        }

        // 다중 catch 블럭 작성가능 > 각 예외 상황에 맞게 실행할 구문 작성
    }
}
