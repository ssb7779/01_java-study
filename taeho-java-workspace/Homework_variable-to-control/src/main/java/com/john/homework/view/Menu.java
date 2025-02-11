package com.john.homework.view;

import com.john.homework.controller.Function;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        Function func = new Function();
        boolean flag = true;
        do {
            System.out.println();
            System.out.println("""
                    1. 간단 계산기
                    2. 작은 수에서 큰 수까지 합계
                    3. 신상 정보 확인
                    4. 학생 정보 확인
                    5. 별과 숫자 출력
                    6. 난수까지의 합계
                    7. 구구단
                    8. 주사위 숫자 알아맞추기 게임
                    9. 프로그램 종료
                    """);

            System.out.print("메뉴 번호: ");
            int tester = sc.nextInt();

            switch (tester) {
                case 1:
                    func.calculator();
                    break;
                case 2:
                    func.totalCalculator();
                    break;
                case 3:
                    func.printProfile();
                    break;
                case 4:
                    func.printScore();
                    break;
                case 5:
                    func.printStarNumber();
                    break;
                case 6:
                    func.sumRandom();
                    break;
                case 7:
                    func.exceptGugu();
                    break;
                case 8:
                    func.diceGame();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
            }
        } while (flag);
    }
}
