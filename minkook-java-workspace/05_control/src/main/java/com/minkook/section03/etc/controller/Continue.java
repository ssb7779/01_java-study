package com.minkook.section03.etc.controller;

public class Continue {
    public void testBasicContinue(){
        /*
             1부터 10사이의 홀수만 출력
             1 3 5 7 9
         */
       /* for(int i = 1; i<=9; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }*/

        for(int i = 1; i<=9; i+=2){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }

    public void testContinueExample1(){
       /*
            1부터 100까지의 총 합계를 구해보기.
            단, 6의배수 값은 제외하고 덧셈연산 진행
        */
        int sum = 0;
        for(int i = 1; i<=100; i++){
            if(i % 6 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
