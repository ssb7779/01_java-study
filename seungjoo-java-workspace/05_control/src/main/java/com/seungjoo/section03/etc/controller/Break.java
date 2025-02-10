package com.seungjoo.section03.etc.controller;

import java.util.Scanner;

public class Break {
    /*
         ##break문
         1.break문으로 switch문을 종료시킬수 있듯이 와일문이나 for문같은 반복문서도 사용가능
         중첩 반복문일 경우 break문이 속해있는 최근접의 반복문만 종료됨


     */
    public void testBasicBreak(){
        while(true){
            int random = (int)(Math.random()*100+1);
            System.out.println(random);

            if(random % 5 ==0){
                break;
            }
        }
    }

    public void testBreakExample1() {
        /*
            반복적으로 사용자에게 문자열을 입력받고 해당 문자열과 문자열의 길이를 출력한다.
            단 사용자가 입력한 문자열이 "exit"일 경우 그 즉시 반복이 종료되도록 하시오
         */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("문자열 입력(종료하고 싶다면 exit을 입력):");
            String str = sc.nextLine();

            System.out.println(str + "의 글자수는 " + str.length() + "입니다.");
            if (str.equals("exit")) {
                break;
            }
            System.out.println(str + "의 글주수는 " + str.length() + "입니다.");
        }
    }

        public void testBreakExample2(){
            while(true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("정수(2~9 입력");
                int dan = sc.nextInt();

                if (dan >= 2 && dan <= 9) { //정상 입력
                    for (int su = 1; su <= 9; su++) {
                        System.out.printf("%d x %d = %d\n", dan, su, dan * su);
                    }
                } else { //잘못 입력
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

                }
            }





















    }











}
