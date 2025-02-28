package com.sh.section02.example.run;

import com.sh.section02.abstract_extends.BasketBall;
import com.sh.section02.abstract_extends.FootBall;
import com.sh.section02.abstract_extends.Sports;
import com.sh.section02.example.dto.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Game g1 = new Wjstk();
//        Game g2 = new Rndtn();
//        Game g3 = new Akqjq();
//        Game g4 = new Dkatkf();
//
//        Game[] arr = new Game[4];
//        arr[0]=new Wjstk();
//        arr[1]=new Rndtn();
//        arr[2]=new Dkatkf();
//        arr[3]=new Akqjq();

        System.out.println("직업선택 (1.전붕이,2.법사,3.궁붕이,4.암살자) 번호입력");
        int chNum = sc.nextInt();
        sc.nextLine();

        System.out.println("이름");
        String cName =sc.nextLine();
        System.out.println("체력");
        int cHp =sc.nextInt();
        System.out.println("레벨");
        int cLv =sc.nextInt();
        System.out.println("exp:");
        int cExp = sc.nextInt();
        sc.nextLine();

        Game gc = null;

        if (chNum ==1){
            System.out.println("무기");
            String weapon =sc.nextLine();
            System.out.println("아이템1:");
            String item1 = sc.nextLine();
            System.out.println("아이템2:");
            String item2 = sc.nextLine();

            gc = new Wjstk(cName,cHp,cLv,cExp,weapon,new String[]{item1,item2});

        }else if (chNum==2){
            System.out.println("마력:");
            gc= new Akqjq(cName,cHp,cLv,cExp,sc.nextInt());
        }else if (chNum==3){
            System.out.print("사격 거리(M)");
            int distance = sc.nextInt();
            System.out.println("활 수 ");
            int count = sc.nextInt();

            gc = new Rndtn(cName,cHp,cLv,cExp,distance,count);

        }else if (chNum==4){
            gc = new Dkatkf(cName,cHp,cLv,cExp);
        }else {
            System.out.println("바보. 게임을 종료합니다.");
            return;
        }

        while (true){
            System.out.println("게임진행");
            System.out.println("1.정보");
            System.out.println("2.공격");
            System.out.println("3.방어");
            System.out.println("0.종료");

            System.out.print("번호: ");
            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println(gc);
                    break;
                case  2:
                    gc.att(); break;
                case 3:
                    gc.def(); break;
                case 0:
                    System.out.println("종료합니다"); return;
                default:
                    System.out.println("바보입니다.");
            }


        }
    }
}
