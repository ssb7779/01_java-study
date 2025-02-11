package com.kyungbae.section03.etc.controller;

public class Continue {

    public void testBasicContinue(){
        /*
            1부터 10사이의 홀수만 출력
            1 3 5 7 9
         */

        /*
        // 방법 1.
        for (int i = 1; i <=10; i++){
            if ( i % 2 == 1 ) {
                System.out.print(i + " ");
            }
        }
         */

        /*
        // 방법 2.
        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0){
                continue; // 특정 회차 건너 뛰기
            }
            System.out.print(i + " ");
        }
         */

        // 방법 3.
        for (int i = 1; i <= 10; i+=2){
            System.out.print(i + " ");
        }

    } // tBC end

    public void testContinueExample1(){
        /*
            1부터 100까지의 총 합계를 구해보기
            단, 6이 배수값 제외
         */

        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 6 == 0){ // 6의 배수
                continue;   // 건너뛰기
            }
            sum += i;
        }
        System.out.println("결과 : " + sum);

    } // tCE1 end

} // class end
