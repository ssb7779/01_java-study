package com.ibe6.section07.objectarray.run;

import com.ibe6.section07.objectarray.controller.PhoneManager;
import com.ibe6.section07.objectarray.dto.Phone;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
            ## 핸드폰 판매 매장 프로그램 ##

            * 시스템 요구사항
            0.핸드폰 정보로 브랜드명, 핸드폰이름, 시리즈, 가격 정보를 가질 수 있다.
            1.현재 판매중인 핸드폰은 총 5개로 이미 정해져있다.
            2.판매점 내의 모든 폰에 대한 정보가 조회될 수 있어야된다.
            3.판매점 내의 모든 폰의 평균가가 조회될 수 있어야된다.
            4.검색을 통해 특정 폰의 가격이 조회될 수 있어야된다.

         */

        // 초기 데이터 세팅
        Phone[] phones = /*new Phone[]*/ {

                new Phone("삼성", "갤럭시", "z플립", 1600000)
                , new Phone("애플", "아이폰", "16pro", 1300000)
                , new Phone("애플", "아이폰", "12pro", 1200000)
                , new Phone("삼성", "갤럭시", "s20", 1100000)
                , new Phone("LG", "롤리팝", "2", 600000)
        };

        Scanner sc = new Scanner(System.in);
        PhoneManager pm = new PhoneManager();

        while (true) {

            System.out.println("\n============ 폰 판매점 =============");
            System.out.println("1. 판매점 내의 모든 폰 조회");
            System.out.println("2. 판매점 내의 모든 폰의 평균가 조회");
            System.out.println("3. 구매하고자 하는 폰의 가격 조회");
            System.out.println("4. 구매하고자 하는 폰들의 가격 조회(키워드검색)");
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴번호: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                pm.selectAllPhone(phones);
            } else if (menu == 2) {
                double avg = pm.selectPhoneAvgPrice(phones);
                System.out.println("평균가격: " + avg + "원");
            } else if (menu == 3) {
                System.out.print("구매하고자하는 핸드폰(핸드폰명+시리즈명): ");
                String search = sc.nextLine();
                int result = pm.searchPhonePrice(phones, search);

                if (result == 0) {//검색결과가 없는 경우
                    System.out.println(search + "폰은 판매하지 않습니다.");
                } else { //검색결과가 있는 경우
                    System.out.println("구매하고자 하는" + search + "의 가격은" + result + "원 입니다.");
                }

            } else if (menu == 4) {
                System.out.print("구매하고자 하는 핸드폰(핸드폰명 또는 시리즈명 키워드 가능): ");
                String search = sc.nextLine();

                int[] results =  pm.searchKeywordPhonePrice(phones, search);
                ///  {0, 1000000, 1500000, 0, 0} | {0, 0, 0, 0, 0}

                int count = 0;
                for(int price : results) {
                    if(price != 0){
                        System.out.println("검색된 핸드폰의 가격은" + price + "원 입니다.");
                        count++;
                    }
                }
                if(count == 0){
                    System.out.println("검색 결과가 없습니다.");
                }

            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
