package com.Kyungbae.section02.veriable;

import java.util.Arrays;

public class Application4 { // class start

    public static void main(String[] args) { // static main start

        /*
            # System.out.printf()
            System.out.printf("출력형식", 값, 값, ..);
            => 형식대로 출력 후 줄바꿈 X

            # 포맷 키워드
            1. %d : 정수
            2. %c : 문자
            3. %s : 문자열
            4. %f : 실수
            5. %b : 논리값
         */

        int i1 = 10;
        int i2 = 20;

        // 10 20%

        System.out.println(i1 + " " + i2 + "%");
        System.out.printf("%d %d%%\n", i1, i2);

        System.out.printf("%d\n", i1, i2);  // 10출력
//        System.out.printf("%d %d\n", i1); // error

        System.out.printf("%-5d\n", i1);    // 5칸의 여유를 얻는다
        System.out.printf("%-5d\n", 100);   // 음수는 좌측정렬
        System.out.printf("%5d\n", i2);     // 양수는 우측정렬
        System.out.printf("%5d\n", 3);
        System.out.printf("%5d\n", 65777);

        double d1 = 1.23456789;
        double d2 = 4.32;

        System.out.printf("%f %f\n", d1, d2);       // %f 출력 시 소수점 6자리 까지 표현
        System.out.printf("%.3f %.1f\n", d1, d2);   // %.nf 소수점 n 번쨰 자리 까지 표현

        char ch = '#';
        String str = "Hello World";

        System.out.printf("%c %15s %s\n", ch, str, ch);   // 문자열은 문자를 포함한다
        System.out.printf("%C %S %s\n", ch, str, ch);   // 대문자 사용시 대문자로 출력

    } // static main end

} // class end
