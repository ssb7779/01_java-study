package com.sotogito.section3.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /**
         * ##객체
         * : 현실세계에서 독립적으로 존재하는 모든 것
         * 자바에서의 객체 : 힙메모리 영역에 만들어지는 모든 것
         *
         * ## 객체지향프로그래민
         * 현실세계에서의 모든 사건은 객체와 객체간의 상호작용에 의해 발생
         * 이를 가상세계에 적용하여 프로그래밍함
         *
         * ## 추상화 : 단순화
         * 1. 현실세계를 프로그램의 목적에 맞게 단순화
         * 2. 모듈화
         * 3. 재사용
         *
         * ## 객체와 객체간의 상호작용
         * 1. 메시자로 상호작용
         * 2. 객체송신자 -> msg -> 객체수신자
         * 3. 수신자 직접 자신의 상태를 처리함
         *
         *
         * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         * - 카레이서가 자동차를 운전하는 프로그램
         *
         * - 요구사항
         * - CarRacer
         * - Car
         * - Player
         *
         * - 객체간의 상호작용 도출
         *      - racer에게 수신되는 매시지
         *          1. 시동걸어
         *          2. 엑셀
         *          3. 브레이크
         *          4. 시동꺼
         *      - 자동차에게 수신되는 메시지
         *          1. 시동좀걸어봐
         *          1. 엑셀작동해
         *          2. 브레이크작동해
         *          4. 시동꺼봐
         *
         */


        Scanner sc = new Scanner(System.in);
        CarRacer carRacer = new CarRacer();

        while (true){
            System.out.println("\n카레이싱 프로그램");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("0. 프로그램 종료");
            int menuNum = sc.nextInt();

            if(menuNum == 0){
                System.out.println("종료");
                break;
            }

             switch (menuNum){
                 case 1 : carRacer.startUp(); break;
                 case 2 : carRacer.stepAccelator(); break;
                 case 3 : carRacer.stepBreak(); break;
                 case 4 : carRacer.turnOff(); break;
                 default:
                     System.out.println("잘못된 메뉴 선택. 다시 입력");
             }
        }
    }
}
