package com.kyungbae.section07.objectarray.run;

import com.kyungbae.section07.objectarray.controller.PhoneManager;
import com.kyungbae.section07.objectarray.dto.Phone;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneManager pm = new PhoneManager();

        Phone[] p = new Phone[] {
                new Phone("삼성", "갤럭시", "z플립", 1600000)
              , new Phone("애플", "아이폰", "16pro", 1700000)
              , new Phone("삼성", "갤럭시", "S25", 1100000)
              , new Phone("애플", "아이폰", "16ProMax", 2000000)
              , new Phone("삼성", "갤럭시", "A10", 700000)
        };

        while (true){

            System.out.println("\n================= 폰 판매점 ===================");
            System.out.println("1. 판매점 내의 모든 폰 조회");
            System.out.println("2. 판매점 내의 모든 폰의 평균가 조회");
            System.out.println("3. 구매하고자 하는 폰의 가격 조회");
            System.out.println("4. 구매하고자 하는 폰의 가격 조회(키워드 검색)");
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴번호 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if ( menu == 1 ){
                pm.selectAllPhone(p);
            } else if (menu == 2) {
                double avg = pm.selectPhoneAvgPrice(p);
                System.out.printf("평균가격 : %.0f원", avg);
            } else if (menu == 3) {

                System.out.print("구매하고자 하는 폰(핸드폰 명 + 시리즈명) : ");
                String search = sc.nextLine();
                int price = pm.searchPhonePrice(p, search); // 키워드 검색은 아님
                if (price == 0){
                    System.out.println("검색 결과가 없습니다.");
                }else{
                    System.out.printf("%s의 가격은 : %d원 입니다\n", search, price);
                }
            } else if (menu == 4) {
                System.out.print("구매하고자 하는 폰(핸드폰명 또는 시리즈명) : ");
                String search = sc.nextLine();
//                pm.searchKeywordPhonePrice(p,search);
                int[] result = pm.searchKeywordPhonePrice(p, search);

                int count = 0;
                for(int price : result){
                    if (price != 0){
                        count++;
                        System.out.println("검색된 핸드폰의 가격은 " + price + "원 입니다.");
                    }
                }
                if(count == 0) {
                    System.out.println("검색 결과가 없습니다.");
                }else {
                    System.out.println("검색 결과 : " + count + "건");
                }


            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        } // 메뉴판 end

    } // main end

} // class end
