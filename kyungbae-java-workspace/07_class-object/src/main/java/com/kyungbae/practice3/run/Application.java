package com.kyungbae.practice3.run;

import com.kyungbae.practice3.controller.Function;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Function f = new Function();
        Scanner sc = new Scanner(System.in);


        // 1번 메소드
        System.out.print("1. ");
        f.printLottoNumbers();

        // 2번 메소드
        System.out.println();
        System.out.print("2. 출력할 갯수 : ");
        f.outputChar(5, 'a');


        // 3번 메소드
        System.out.println();
        System.out.println("3. 랜덤 영문자 출력 : " + f.alphabette());

        // 4번 메소드
        System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + f.mySubstring("apple", 2, 4));

    }
}
