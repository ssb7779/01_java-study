package com.kyungbae.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
            1. 카레이서는 시동걸기, 엑셀레이터 밟기, 브레이크 밟기, 시동 끄기를 할 수 있다.
            2. 자동차는 시동걸기, 앞으로가기, 멈추기 , 시동끄기를 할 수 있다.
            3. 자동차는 처음에 멈춘 상태로 대기하고 있는다.
            4. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
            5. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h 증가하며 앞으로 나간다.
            6. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다.
            7. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
            8. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
            9. 자동차가 달리는 중이라면 시동을 끌 수 없다.
         */

        // 메뉴 출력
        Scanner sc = new Scanner(System.in);

        CarRacer racer = new CarRacer();

        while (true) {
            System.out.println("\n=== 카레이싱 프로그램 ===");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: racer.startUp();break;
                case 2: racer.stepAccelator();break;
                case 3: racer.stepBreak();break;
                case 4: racer.turnOff();break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
            }
        }


    } // main end

} // class end
