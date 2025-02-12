package com.younggalee.homework.view;
import com.younggalee.homework.controller.Function;

import java.util.Scanner;

// 화면 제공용 클래스
public class Menu {
    public void displayMenu() {
        Function func = new Function();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. 간단 계산기\n" +
                    "2. 작은 수에서 큰 수까지 합계\n" +
                    "3. 신상 정보 확인\n" +
                    "4. 학생 정보 확인\n" +
                    "5. 별과 숫자 출력\n" +
                    "6. 난수까지의 합계\n" +
                    "7. 구구단\n" +
                    "8. 주사위 숫자 알아맞추기 게임\n" +
                    "9. 프로그램 종료\n");

            System.out.print("메뉴번호 : ");
            int menuNum = sc.nextInt();
            System.out.println();

            if (menuNum > 9 || menuNum < 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            switch (menuNum) {
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
            }

            if (menuNum == 9) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
