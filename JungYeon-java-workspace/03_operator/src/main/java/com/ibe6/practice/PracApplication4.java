package com.ibe6.practice;

public class PracApplication4 {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // ?
        System.out.println(y += 10 - x++); // 15 - 2(3) = 13
        System.out.println(x += 2); // 3 + 2 = 5
        System.out.println( !('A' <= c && c <='Z') ); // false
        System.out.println('C' - c); // 67 - 65 = 2
        System.out.println('5' - '0'); // 5
        System.out.println(c + 1); // 66
        System.out.println(++c); // B
        System.out.println(c++); // B(C)
        System.out.println(c); // C

    }
}
