package com.younggalee.section07.objectarray.run;

import com.younggalee.section01.user_type.Member;
import com.younggalee.section07.controller.PhoneManager;
import com.younggalee.section07.dto.Phone;

import java.awt.*;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {


        // 휴대폰 판매 매장 프로그램
        /*
         * 시스템 요구사항
         * 0. 핸드폰 정보로 브랜드명, 핸드폰 이름, 시리즈, 가격정보를 가질 수 있다.
         * 1. 현재 판매 중인 핸드폰은 총 5개로 이미 정해져있다.
         * 2. 판매점 내의 모든 폰에 대한 정보가 조회될 수 있어야된다.
         * 3. 판매점 내의 모든 폰의 평균가가 조회될 수 있어야된다.
         * 4. 검색을 통해 특정 폰의 가격이 조회 될 수 있어야한다.
         */

        Phone[] phone = {new Phone("삼", "갤", "플", 160000)
                , new Phone("삼2", "갤2", "플2", 16000)
                , new Phone("삼3", "갤3", "플3", 1600)
                , new Phone("삼4", "갤4", "플4", 160)
                , new Phone("삼5", "갤5", "플5", 16)
        };

        Scanner sc = new Scanner(System.in);
        PhoneManager phm = new PhoneManager();

        while (true) {
            System.out.println("\n============== 폰 판매점 =================");
            System.out.println("1. 판매점 내의 모든 폰 조회");
            System.out.println("2. 팬매점 내의 모든 폰의 평균가 조회");
            System.out.println("3. 구매하고자하는 폰의 가격 조회");
            System.out.println("4. 구매하고자 하는 폰들의 가격 조회(키워드 검색)");
            System.out.println("0. 프로그램 종료");
            System.out.println(">> 메뉴번호: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                phm.sellectAllPhone(phone);
            } else if (menu == 2) {
                double avg = phm.sellectPhoneAvgPrice(phone);
                System.out.println("평균가격: " +avg + "원");
            } else if (menu == 3) {
                System.out.println("구매하고자하는 핸드폰(핸드폰명+시리즈명)");

                String search = sc.nextLine();
                int result = phm.searchPhonePrice(phone, search);

                if (result == 0) {
                    System.out.println(search + "폰은 판매하지 않습니다.");
                } else {
                    System.out.println("구매하고자 하는 " + search + "의 가격은 " + result + "원 입니다.");
                }

            }else if(menu == 4){

                System.out.print("구매하고자하는 핸드폰 : ");

                String keyword = sc.nextLine();
                int[] result =  phm.searchkeywordPrice(phone, keyword);
                for (int price : result) {
                    if(price != 0) {
                        System.out.println("검색된 폰의 가격은 " + price + "원입니다.");
                    }
                }

            } else if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("다시입력하세요");
            }
        }

    }
}
