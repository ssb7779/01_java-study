package com.jjanggu.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
            ## 객체 ##
            1. 사전적 정의 : 현실세계에서 독립적으로 존재(목적,가치,의미있는)하는 모든 것
            2. 자바에서의 정의 : Heap 메모리 영역에 만들어지는 모든 것들


            ## 객체 지향 프로그래밍 ##
            현실세계에서의 모든 사건(event)은 객체간의 상호작용에 의해 발생됨
            이런 현실세계의 세계관을 프로그램을 만들때 적용해서 가상세계로 창조하는 방법론
            ex) 인터넷 쇼핑몰 (객체 : 상품, 고객 / 상호작용 :  구매, 환불 등)

            ## 추상화 ##
            1. 현실세계를 프로그램의 목적에 맞게 단순화하는 기법
            2. 공통된 부분을 추출하고 목적에 맞지 않는 것들을 제거해나가는 과정
            3. 유연성을 확보해서 재사용성이 높아질 수 있도록 작업할 수 있음

            ## 객체와 객체간 상호작용 ##
            1. 객체간에는 메세지를 통해 서로 상호작용함
            2. 객체(송신자) --메세지--> 객체(수신자)
            3. 수신자 입장에서 수신된 메세지를 어떻게 처리할건지를 결정하고,
               어떤 명령어들 순서대로 처리할건지를 기술하는 것을 "메소드" 라고함

            ############################### 예시 ################################
            * 프로그램 개요
              카레이서가 자동차를 운전하는 프로그램

            * 시스템 요구사항


            ## 프로그램 설계 ##
            1. 필요한 객체 도출
               1) 카레이서
               2) 자동차
               3) 플레이어(사용자)

            2. 객체간의 상호작용(행위) 도출
               1) 카레이서에게 수신되는 메세지 (사용자 -> 카레이서)
                  - 시동을 걸어라
                  - 엑셀을 밟아라
                  - 브레이크를 밟아라
                  - 시동을 꺼라
               2) 자동차에게 수신되는 메세지 (카레이서 -> 자동차)
                  - 시동을 걸어라
                  - 앞으로 가라
                  - 멈춰라
                  - 시동을 꺼라

            3. 커뮤니케이션 다이어그램(동적)

            4. 클래스 설계하기
               1) 자동차 클래스
                  - 속성   : 시동여부, 현재시속
                  - 메소드 : 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
               2) 카레이서 클래스
                  - 속성   : 자동차
                  - 메소드 : 시동을 걸어라, 엑셀을 밟아라, 브레이크를 밟아라, 시동을 꺼라


         */

        Scanner sc = new Scanner(System.in);

        CarRacer racer = new CarRacer();

        while(true){
            System.out.println("\n=== 카레이싱 프로그램 ====");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("0. 프로그램 종료");
            System.out.println(">> 메뉴 선택");
            int menu = sc.nextInt();

            switch (menu){
                case 1: racer.startUp(); break;
                case 2: racer.stepAccelator(); break;
                case 3: racer.stepBreak(); break;
                case 4: racer.turnOff(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다. 그동안 이용해주셔서 감사합니다.");
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요.");
            }

        }


    }
}
