package com.sotogito.practice;

public class PracApplication5 {
    /**
     * num <= 13 "어린이
     * num > 13 && num >= 19 "청소년"
     * num > 19 "성인"
     * "   * @param args
     */
    public static void main(String[] args) {
        int num = 18;

        String result = num > 19 ? "성인" : num > 13 ? "청소년" : "어린이";


        System.out.println(result);
    }
}
