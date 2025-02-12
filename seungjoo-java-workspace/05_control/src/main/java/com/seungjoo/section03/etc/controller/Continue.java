package com.seungjoo.section03.etc.controller;

public class Continue {
    /*
    ##continue문
    1.반복무의 시작 지점으로 프로그램의 흐름이 이동되는 구문
    2. 반복문 내에서 특정 구문을 제외하고 실행하고 싶을 경우 주로 사용
     */


    public void testBasicContinue() {

        /*
            1부터 10사이의 홀수만 출력
            1 3 5 7 9
         */

        // 방법 1. i값이 홀수일떄만 출력

       /*
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        */
        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }


    public void testContinueExample1(){
        /*
        1부터 100까지의 총 합계를 구해보기.
        단 ,6의 배수 값은 제외하고 덧셈연산 진행
         */

        int sum = 0;
        for(int i = 1; i<= 100; i++){
            if(i%6 == 0){
                continue;
            }else{
                sum += i;
            }
            System.out.println("결과 " + sum);
        }
    }
}