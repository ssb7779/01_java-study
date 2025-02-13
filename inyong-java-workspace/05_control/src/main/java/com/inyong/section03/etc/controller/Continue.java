package com.inyong.section03.etc.controller;

public class Continue {
    /*
    반복문의 시작지점
    1. 반복문의 시작 지점으로 프로그램의 흐름이 이동되는 구문
    2. 반복문 내에서 특정 구문을 제외하고 실행하고 싶을 경우 주로 사용
     */
    public void testBasicContinue1(){
        for(int i = 1; i < 10; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void testBasicContinue2(){
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public void testContinueExample1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 6 == 0){
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }

}
