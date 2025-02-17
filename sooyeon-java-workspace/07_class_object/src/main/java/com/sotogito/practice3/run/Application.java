package com.sotogito.practice3.run;

import com.sotogito.practice3.controller.Function;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function function = new Function();

        System.out.println("1. 랜덤값 출력");
        System.out.println("2. 문자 출력");
        System.out.println("3. 랜덤 알파벳");
        System.out.println("4. 문자열 추출");
        System.out.println("기능 선택 : ");
        int functionNum = sc.nextInt();
        sc.nextLine();

        switch (functionNum) {
            case 1:
                System.out.print("랜덤 값 : ");
                function.printLottoNumbers();
                break;


            case 2:
                System.out.println("반복 횟수 : ");
                int count = sc.nextInt();
                sc.nextLine();
                System.out.println("반복 문자 : ");
                char character = sc.nextLine().charAt(0);

                System.out.printf("%c문자 %d개 출력 : ", character, count);
                function.outputChar(count, character);
                break;


            case 3:
                System.out.printf("랜덤 영문자 출력 : %c\n", function.alphabette());
                break;


            case 4:
                System.out.println("문자열 : ");
                String word = sc.nextLine();
                System.out.println("시작 인덱스 : ");
                int startIndex = sc.nextInt();
                System.out.println("끝 인덱스 : ");
                int endIndex = sc.nextInt();

                System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : %s\n",
                        word, startIndex, endIndex,
                        function.mySubstring(word, startIndex, endIndex));


        }

    }
}
