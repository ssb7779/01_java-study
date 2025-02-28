package com.minkook.section07.run;

import com.minkook.section07.controller.PhoneManager;
import com.minkook.section07.dto.Phone;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args){
        /*
            ## 휴대폰 판매 매장 프로그램 ##
         */
        Phone[]phones = {
                new Phone("삼성","갤럭시","z플립",160000) //자바에서는 ,위치를 앞으로 보통 잡는다.
              , new Phone("애플","아이폰","16pro",130000)
              , new Phone("애플","아이폰","12pro",120000)
              , new Phone("삼성","갤럭시","s20",110000)
              , new Phone("LG","롤리팝","2",600000)
        };
        Scanner sc = new Scanner(System.in);
        PhoneManager pm = new PhoneManager();
        while(true){
            System.out.println("\n=====================폰 판매점=====================");
            System.out.println("1. 판매점 내의 모든 폰 조회");
            System.out.println("2. 판매점 내의 모든 폰의 평균가 조회");
            System.out.println("3. 구매하고자 하는 폰의 가격 조회");
            System.out.println("4. 구매하고자 하는 폰들의 가격 조회(키워드 검색)");
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴번호: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1){
                pm.selectAllPhone(phones);
            }else if(menu == 2){
                //pm.selectPhoneAvgPrice(phones);
                System.out.println("모든 폰의 평균가: " + pm.selectPhoneAvgPrice(phones));
            }else if(menu == 3){
                System.out.print("구매하고자 하는 핸드폰(핸드폰명+시리즈명)");
                String search = sc.nextLine();
                int res = pm.searchPhonePrice(phones,search);
                if(res == 0) {
                    System.out.println(search + "폰은 판매하지 않습니다.");
                }else {
                    System.out.println("구매할 폰 가격 " + pm.searchPhonePrice(phones,search));
                }

            }else if(menu == 4){
                System.out.print("구매하고자 하는 핸드폰(핸드폰명 또는 시리즈명 키워드 가격)");
                String search = sc.nextLine();
                int [] res = pm.searchKeywordPrice(phones,search);
                int count = 0;
                for(int price:res){
                    if(price != 0) {
                        System.out.println("검색된 핸드폰의 가격은 " + price);
                        count++;
                    }
                    if(count == 0){
                        System.out.println("검색결과가 없습니다.");
                    }

                }
            }else if(menu == 0){
                System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
