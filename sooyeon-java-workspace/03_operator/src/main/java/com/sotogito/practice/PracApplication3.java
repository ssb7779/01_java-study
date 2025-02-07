package com.sotogito.practice;

public class PracApplication3 {
    /**
     * 50
     * t
     * -3
     */
    public static void main(String[] args) {

        int result = 5>4?50:40;
        System.out.println(result);

        int a =2;
        int b =4;
        int c = 2;
        boolean result2 = a == b ? a <= c: b>c;
        System.out.println(result2);

        int d = 3;
        int e = 6;
        int result3 = true && false ? d*2+e:d-e;
        System.out.println(result3);
    }

}
