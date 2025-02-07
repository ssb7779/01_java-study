package com.younggalee.section02.variable;

public class Application4 {
    public static void main(String[] args){
        /*
            ## printf ##
            정수 : %d
            문자 : %c
            문자열 : %s
            실수 : %f
            논리값 : %b

         */
        int i1 = 10;
        int i2 = 20;

        System.out.printf("%d %d%%\n", i1, i2); // *******************
        System.out.printf("%5d\n", 100);  // 오
        System.out.printf("%-5d\n", 100);  // 왼
        System.out.printf("%5d\n", 10000);
        System.out.printf("%f\n", 1.123456789);
        System.out.printf("%f\n", 1234567891.123456);
        System.out.printf("%f\n", 1234567891234567.123456789);

        char ch = 'a';
        String str = "abc";

        System.out.printf("%c %10s %s\n", ch,str,ch);
        System.out.printf("%C %10S %s\n", ch,str,ch);
    }
}
