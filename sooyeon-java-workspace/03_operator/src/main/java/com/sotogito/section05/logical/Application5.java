package com.sotogito.section05.logical;

public class Application5 {
    public static void main(String[] args) {
        /**
         * short curcuit
         * 1. &&
         *  true && true = true
         *  true && false = false
         *  false && true = false
         *  false && false = false
         *  앞쪽부터 처리 후 false시  break
         *
         * 1. ||
         *  true || true = true
         *  true | |false = true
         *  false || true = true
         *  false || false = false
         *  앞쪽부터 처리하면서 true일때까지 연산
         *  조건이 모두 false일때만 false
         */

        int num1 = 10;
        int num2 = 20;
        boolean resultAnd = (num1 < 5) && (++num1 > 0); //앞부분만 하고 break -> false

        boolean resultOr = (num1 < 5) || (++num1 > 0); //앞부분 false 지만 뒤에 true -> true
        boolean resultOr3 = (num2==20) ||(num2<10) || (num2>10);
        boolean resultBool = (false) || (false)|| (false);
        boolean resultBool2 = (false) || (true)|| (false);
        boolean resultBool3 = (false) || (false)|| (true);

        System.out.println(resultAnd);
        System.out.println(resultOr);
        System.out.println(resultOr3);
        System.out.println(resultBool);


    }
}
