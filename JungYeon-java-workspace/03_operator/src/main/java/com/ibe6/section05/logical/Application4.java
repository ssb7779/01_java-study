package com.ibe6.section05.logical;

public class Application4 {
    public static void main(String[] args) {
            // 특정 성별값(m/M/f/F)을 가지고 남자인지 판별
            char gender = 'f';

            boolean result = (gender == 'm') || (gender == 'M');
            System.out.println("남자인가요 : " + result);


    }
}
