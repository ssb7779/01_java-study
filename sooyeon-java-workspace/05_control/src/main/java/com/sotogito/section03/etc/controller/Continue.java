package com.sotogito.section03.etc.controller;

public class Continue {
    /**
     * 1. 반복문에서 사용
     * 2. 반복문 내에서 특정 로직을 제외하고 나머지 실행
     */

    public void testBasicContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }


        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

    public void testContinueExample1(){
        int sum = 0;
        for(int i = 1; i<=100; i++){
            if(i%6==0){
                continue;
            }
            sum +=i;
        }

//        for(int j = 6; j<=100; j+=6){
//            sum -=j;
//        }

    }

}
