package com.jun.section03.etc.controller;

import java.sql.SQLOutput;

public class Continue {

    /*
        ## continue문 ##
        1. 반복문의 시작 지점으로 프로그램의 흐름이 이동되는 구문
        2. 반복문 내에서 특정 구문을 제와하고 실행ㅎ고 싶을 경우 주로 사용
     */
    public  void testBasicContinue(){
    /*
        1부터 10사이의 홀수만 출력
        1 3 5 7 9
     */
        // 방법1.
//        for(int i=1; 1<=10; i++) {
//            System.out.print(i + " ");
//        }
        // 방법 3.. 애초에 2씩 증가하기
        for(int i=1; 1<=10; i+=2){
            System.out.print(i + " ");
        }

    }
    public void testContinueExample1(){
        /*
        1부터 100까지의 총 합계를 구해보기
        단, 6의 배수 값은 제외하고 덧셈연산 진행
         */
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 6 == 0){
                continue;
            }
            sum +=i;

        }
        System.out.println("결과: " + sum);
    }


}

