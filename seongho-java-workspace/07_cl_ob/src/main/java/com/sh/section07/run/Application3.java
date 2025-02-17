package com.sh.section07.run;

import com.sh.section07.controller.PhoneManager;
import com.sh.section07.dto.Phonedto;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        브랜드 핸드폰 시리즈 가격정보
        핸드폰 5개
        모든폰 정보 조회
        평균가 조회
        검색 폰 가격 조회
         */
//        Phonedto[] pd = new Phonedto[4];
//        pd[0] = new Phonedto("ss1","ssg1","ssg1",1100000);
//        pd[1] = new Phonedto("ss2","ssg2","ssg2",1200000);
//        pd[2] = new Phonedto("ss3","ssg3","ssg3",1300000);
//        pd[4] = new Phonedto("ss4","ssg4","ssg4",1400000);
//        pd[5] = new Phonedto("ss5","ssg5","ssg5",1500000);
//
        Phonedto[] pd ={
        new Phonedto("ss1","ssg1","ssg1",1100000)
        ,new Phonedto("ss2","ssg2","ssg2",1200000)
        ,new Phonedto("ss3","ssg3","ssg3",1300000)
        ,new Phonedto("ss4","ssg4","ssg4",1400000)
        ,new Phonedto("ss5","ssg5","ssg5",1500000)

        };
        Scanner sc = new Scanner(System.in);
        PhoneManager pm = new PhoneManager();
        while (true){
            System.out.println("\n--------------------폰 판매");
            System.out.println("1. 모든 폰 조회");
            System.out.println("2. 모든 폰 평균가 조회");
            System.out.println("3. 구매 핸드폰 가격");
            System.out.println("4. 검색 핸드폰 가격");
            System.out.println("0. 종료");
            System.out.print("번호");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1){
                pm.selectallPhone(pd);
            } else if (menu == 2) {
                double avg = pm.selectAV(pd);
                System.out.println(avg);
            } else if (menu == 3) {
                System.out.println("살 폰 검 색(핸드폰과 시리즈 : ");
                String search = sc.nextLine();

                pm.searchPhPri(pd,search);
            } else if (menu ==4){
                System.out.println("사고싶은 폰 검색 : ");
                String search2 = sc.nextLine();
                int[] results= pm.search2PhPri(pd, search2);
                int count = 0;

                for (int price : results){
                    if (price !=0){
                        System.out.println(price);
                        count++;
                    }
                }
                if (count==0){
                    System.out.println("검색 결과 없음");
                }

            }
            else if (menu == 0) {
                System.out.println("종료");
                break;
            }else {
                System.out.println("다시입력");
            }
        }
     }

}
