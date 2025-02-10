package com.seongho.section03.etc.controller;

public class Continue {
    /*
    continue
    반복문의 시작 지점으로 프로그램의 흐름이 이동되는 구문
    반복문 내에서 특정 구문 제외하고 실행하고 싶을때
     */
    public void testBC(){
        /*
        1~10 홀수만
         */
        for (int i =1; i<11; i++){
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    /*
    1부터 100까지 합 단, 더해지는 수중 6의 배수 제외
     */
    public void testCTNEx(){
        int sum = 0;
        for (int i = 1; i<101; i++){
            if (i%6==0){
                continue;
            }

                sum +=i;
        }
    }
}
