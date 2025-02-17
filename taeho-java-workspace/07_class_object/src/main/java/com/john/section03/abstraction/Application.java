package com.john.section03.abstraction;

/*
    ## 객체 ##
    - Heap 메모리 영역에 만들어 지는 모든 것들
    객체 지향 프로그래밍
    - 현실세계의 세계관을 프로그램으로 만들 때 적용해서 가상세계로 만드는 방법론

    ## 추상화 ##
    - 프로그램의 목적에 맞게 단순화 시키는 기법
    - 공통된 부분을 추출하고 목적에 맞지 않는 것들을 제거해나가는 과정
    - 유연성 확보 => 재사용성 증가

    ## 객체간 상호작용 ##
    1. 객체간에는 메시지를 통해 상호작용함
    2. 객체(송신자) -- 메시지 --> 객체(수신자)
    3. 수신자 입장에서 수신된 메시지를 어떻게 처리할 것인지,
       어떤 명령어들 순서대로 처리할건지 기술하는 것이 메서드

    ## 프로그램 설계 순서 ##
    1. 필요한 객체 도출
    2. 객체간 상호작용 도출
    3. 커뮤니케이션 다이어 그램
    4. 클래스 설계 - 자동차 프로그램 설계
        4.1. 자동차 클래스, 레이서 클래스 필요
        - 속성
        - 메서드

 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Racer racer = new Racer();

        while (true) {
            System.out.println("======================");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 차량정지");
            System.out.println("4. 시동 끄기");
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴 선택: ");

            int menu = sc.nextInt();
            boolean flag;

            switch (menu) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccel();
                    break;
                case 3:
                    racer.stepBreak();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
                    return;
                default:
                    System.out.println("잘못된 값을 입력하셨습니다. 다시 선택하세요");
            }
        }
    }
}
