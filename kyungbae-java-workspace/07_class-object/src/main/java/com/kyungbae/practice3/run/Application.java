package com.kyungbae.practice3.run;

import com.kyungbae.practice3.controller.Function;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Function f = new Function();
        Scanner sc = new Scanner(System.in);

        /*
        // 1번 메소드
        f.printLottoNumbers();

        // 2번 메소드
        System.out.print("출력할 갯수 : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("출력할 문자 : ");
        char ch = sc.nextLine().charAt(0);
        f.outputChar(num, ch);

         */

        // 3번 메소드
        System.out.print("랜덤 영문자 출력 : ");
        System.out.print(f.alphabette());

    }
}
