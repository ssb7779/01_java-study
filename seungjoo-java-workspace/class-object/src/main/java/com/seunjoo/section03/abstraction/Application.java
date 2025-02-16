package com.seunjoo.section03.abstraction;



import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CarRacer racer = new CarRacer();


        while(true){
            System.out.println("\n===카레이싱 프로그램 ====");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("0. 프로그램 종료");
            System.out.println(">> 메뉴 선택:");
            int menu = sc.nextInt();



            switch(menu){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 0:
                    System.out.println("프로그램을 종료합니다. 그동안 이용해주셔서 감사합니다.");
                    return; //리턴을 통해 while문 강제종료

                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요.");









            }
        }












    }



}
