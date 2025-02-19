package com.john.section07.run;

import com.john.section07.controller.PhoneManager;
import com.john.section07.dto.Phone;

import java.util.Arrays;
import java.util.Scanner;

public class Application3_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone[] phones = {
                new Phone("삼성", "갤럭시", "노트", 1_600_000)
                , new Phone("애플", "아이폰", "16pro", 1_300_000)
                , new Phone("삼성", "갤럭시", "z플립", 1_200_000)
                , new Phone("애플", "아이폰", "13pro", 1_100_000)
                , new Phone("LG", "LG폰", "2", 800_000)
        };

        PhoneManager phoneManager = new PhoneManager();

        while (true) {
            System.out.println("\n============= 폰 판매 =============");
            System.out.println("1. 모든 핸드폰 조회");
            System.out.println("2. 모든 핸드폰의 평균가 확인");
            System.out.println("3. 구매하려는 핸드폰 가격 조회");
            System.out.println("4. 구매하려는 핸드폰 종류의 가격");
            System.out.println("0. 프로그램 종료");
            System.out.print("번호 입력 >> ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                phoneManager.selectAllPhone(phones);
            } else if (n == 2) {
                double avg = phoneManager.selectPhoneAvgPrice(phones);
                System.out.println("평균가격: " + avg + "원");
            } else if (n == 3) {
                System.out.print("구매하려고 하는 핸드폰(핸드폰명+시리즈명): ");
                String search = sc.nextLine();
                int result = phoneManager.searchPhonePrice(phones, search);
                if (result == 0) {
                    System.out.println(search + "핸드폰은 판매하지 않습니다");
                } else {
                    System.out.println("구매하고자 하는 " + search + "핸드폰의 가격은"
                            + result + "원 입니다");
                }
            } else if (n == 4) {
                System.out.print("구매하려는 핸드폰 종류: ");
                String str = sc.nextLine();
                String[] result = phoneManager.searchPhoneSeries(phones, str);
                System.out.println(Arrays.toString(result));
            }
        }
    }
}
