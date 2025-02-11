package com.younggalee.section03.etc.controller;

public class Continue {
    /*
    continue문
    반복문의 시작 지점으로 프로그램의 흐름이 이동되는 구문
    반복문 내에서 특정 구문을 제외하고 실행하고 싶을 경우 주로 사용
     */
    public void testBasicContinue(){
        for(int i=1; i<=10; i++){  // i+=2하면 2씩 증가됨 ********
            if (i%2 == 0){
                continue; // for 문의 상태변화식 실행 ****
            }
            System.out.print(i + " ");
        }
    }
    public void testContinueExample1(){
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i;
            if (i % 6 == 0) {
                continue;
            }
            if (i == 100){
                break;
            }
            i++;
        }
    }
}
