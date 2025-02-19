package com.seokbong.homework.view;

import com.seokbong.homework.controller.Function;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {

        Function fc = new Function();
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("1. 간단계산기");
            System.out.println("2. 작은 수에서 큰 수까지 합계");
            System.out.println("3. 신상 정보 확인");
            System.out.println("4. 학생 정보 확인");
            System.out.println("5. 별과 숫자 출력");
            System.out.println("6. 난수까지의 합계");
            System.out.println("7. 구구단");
            System.out.println("8. 주사위 숫자 알아맞추기 게임");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 번호 : ");
            int menu = sc.nextInt();

            if (menu >= 1 && menu <= 9) {
                switch (menu) {
                    case 1:
                        fc.calculator();
                        return;
                    case 2:
                        fc.totalCalculator();
                        return;
                    case 3:
                        fc.printProfile();
                        return;
                    case 4:
                        fc.printScore();
                        return;
                    case 5:
                        fc.printStarNumber();
                        return;
                    case 6:
                        fc.sumRandom();
                        return;
                    case 7:
                        fc.exceptGugu();
                        return;
                    case 8:
                        fc.diceGame();
                        return;
                    case 9:
                        System.out.println("종료합니다.");
                        return;
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }


}
