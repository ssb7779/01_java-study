package com.seungjoo.section07.objcetarray.run;

import com.seungjoo.section07.objcetarray.controller.PhoneManager;
import com.seungjoo.section07.objcetarray.dto.Phone;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {


        Phone[] phones = {
            new Phone("삼성", "갤럭시", "z플립", 160000)
            ,new Phone("애플", "아이폰", "16rpo", 130000)
            ,new Phone("애플", "아이폰", "12pro", 120000)
            ,new Phone("삼성", "갤럭시", "s20", 110000)
            ,new Phone("LG", "롤리팝", "2", 110000)

        };
        PhoneManager pm = new PhoneManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("=====폰 판매점 ======");
            System.out.println("1.판매점 내의 모든 폰 조회");
            System.out.println("2. 판매점 내의 모든 폰의 평균가 조회");
            System.out.println("3. 구매하고자 하는 폰의 가격 조회");
            System.out.println("4.구매하고자 하는 폰들의 가격 조회");
            System.out.println("0. 프로그램 종료");
            System.out.println(">> 메뉴 번호:");
            int menu = sc.nextInt();

            if (menu == 1) {
                pm.selectAllPhone(phones);

            }else if (menu == 2) {
                double avg = pm.selectPhoneAvgPrice(phones);
                System.out.println("평균가격" + avg + "원");
            }else if (menu == 3) {
                System.out.println("구매하고자하는 팬드폰(핸드폰명+시리즈명):");
                String search = sc.nextLine();
                pm.searchPhonePrice(phones, search);
            }else if(menu == 4) {
                System.out.println("구매하고자 하는 핸드폰(핸드폰 명 또는 시리즈명 키워드 가능):");
                String search = sc.nextLine();
                int[] results = pm.searchKeywordPhonePrice(phones, search);
                int count = 0;
                for(int price : results){
                    if(price!= 0){
                        System.out.println("검색된 핸드폰의 가격은 " + price + "원 입니다.");
                    }if(count == 0){
                        System.out.println("검색 결과가 없습니다.");
                    }
                }
            }
            else if (menu == 0) {
                System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");

            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

            }
        }












    }
}
