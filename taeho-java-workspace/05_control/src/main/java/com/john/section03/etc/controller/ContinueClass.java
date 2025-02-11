package com.john.section03.etc.controller;

public class ContinueClass {
    public void testBasicContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

    public void testContinueExample1() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 6 ==0){
                continue;
            }
            sum += i;
        }
        System.out.println("결과: " + sum);
    }
}
