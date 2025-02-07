package com.kyungbae.practice;

public class PracApplication4 {

    public static void main(String[] args) {

//        4. 실행결과 예측

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // true
        System.out.println(y += 10 - x++);            // 13 (y=15 x=3)
        System.out.println(x += 2);                   // 5  (y=15 x=3)
        System.out.println( !('A' <= c && c <='Z') ); // false
        System.out.println('C' - c);                  // 2
        System.out.println('5' - '0');                // 5
        System.out.println(c + 1);                    // B * 66 (자동 형변환)
        System.out.println(++c);                      // B
        System.out.println(c++);                      // B
        System.out.println(c);                        // C


    }


}
