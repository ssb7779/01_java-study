package com.sotogito.practice;
// todo 우선순위 && -> ||
public class PracApplication4 {
    /**
     * x 2 3 5
     * y 5 15
     * c A
     *
     * t || f && f -> t
     * 15 -2 =13
     * 5
     * f
     * 2
     * 5
     * 66
     * B
     * B
     * C
     *
     *
     *
     * 15 - 2 = 13
     * 7
     * !(t&&t) = f
     * 34 - 32 = 2
     * 53 - 48 = 5
     * B
     * C
     * C
     * D
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
