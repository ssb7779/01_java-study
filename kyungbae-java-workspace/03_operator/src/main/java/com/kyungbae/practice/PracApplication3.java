package com.kyungbae.practice;

public class PracApplication3 { // class start

    public static void main(String[] args) { //

//        3. 실행결과 예측

        int result1 = 5 > 4 ? 50 : 40;
        System.out.println(result1); // 50

        int a = 2;
        int b = 4;
        int c = 2;
        boolean result2 = a == b ? a <= c : b > c;
//                          false
        System.out.println(result2); // true

        int d = 3;
        int e = 6;
        int result3 = true && false ? d * 2 + e : d - e;
//                      false
        System.out.println(result3); // -3


    }

}
