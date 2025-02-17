package com.inyong.section07.objectarray.run;

import com.inyong.section07.controller.PhoneManager;
import com.inyong.section07.dto.Phone;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = {
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시"),
                new Phone(1600000, "삼성", "갤럭시")
        };

        PhoneManager pm = new PhoneManager();

        while (true) {
            System.out.println("폰판매점");
            System.out.println("1. 모든 폰 조회");
            System.out.println("2. 판매점 내의 모든 폰 평균가 조회");
            System.out.println("3. 구매하고자 하는 폰의 가격 조회");
            System.out.println("4. ");
            System.out.println("0 프로그램 종료");
            System.out.println(">> 메뉴 번호 : ");

            int menu = sc.nextInt();

            if (menu == 1) {
                pm.selectAllPhone(phones);
            } else if (menu == 2) {
                System.out.println("평균가격 : " + pm.selectPhoneAvgPrice(phones));
            } else if (menu == 3) {
                System.out.println("구매하고자하는 핸드폰");
                String search = sc.nextLine();

                int result = pm.searchPhonePrice(phones, search);
                if(result ==0){
                    System.out.println("해당 폰은 판매하지 않습니다.");
                }else {
                    System.out.println(search + result);
                }

            }
            else if (menu == 4) {
                System.out.println("구매하고자하는 핸드폰(핸드폰명 또는 시르즈명 키워드 가능) :");
                String search = sc.nextLine();

                int[] result = pm.searchKeywordPhonePrice(phones, search);

                int count = 0;
                for (int price : result){
                  if(price != 0){
                      System.out.println("검색된 핸드폰의 가격은" + price + "원 입니다.");
                      count++;
                  }
                }


                if(count == 0){
                    System.out.println("검색 결과가 없습니다.");
                }



            }
            else if (menu == 0) {
                System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
            } else {
                System.out.println("잘못 입력..");
            }
        }
    }
}
