package com.john.practice3.run;

import com.john.practice3.controller.Function;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function f = new Function();
        f.printLottoNumbers();

//        System.out.println("Enter an char: ");
//        char c = sc.nextLine().charAt(0);
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();
//        sc.nextLine();
//        f.outputChar(num, c);

        char randomAlphabet = f.alphabette();
        System.out.println("랜덤 영문자 출력: " + randomAlphabet);

        System.out.print("입력할 문자열: ");
        String input = sc.nextLine();
        System.out.print("시작 인덱스: ");
        int start = sc.nextInt();
        System.out.print("끝 인덱스: ");
        int end = sc.nextInt();
        String s = f.mySubstring(input, start, end);
        if (s == null) {
            System.out.println("null");
        } else {
            System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력: ", s, start, end);
        }
    }
}
