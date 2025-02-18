package com.john.section07.run;

import com.john.section07.dto.Phone;

import java.util.Scanner;

/* 핸드폰 판매 매장 프로그램
    요구사항
    1. 핸드폰 정보: 브랜드명, 이름, 시리즈, 가격정보
    2. 5대의 핸드폰 정보가 이미 들어가 있는 상태
    3. 모든 핸드폰에 대한 정보조회
    4. 모든 핸드폰의 평균가 조회
    5. 검색을 통한 특정 핸드폰의 가격
 */
public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone[] phones = {
                new Phone("삼성", "갤럭시", "노트", 1_600_000)
                , new Phone("애플", "아이폰", "16pro", 1_300_000)
                , new Phone("삼성", "갤럭시", "z플립", 1_200_000)
                , new Phone("애플", "아이폰", "13pro", 1_100_000)
                , new Phone("LG", "LG폰", "2", 800_000)
        };

        while (true) {
            boolean flag = true;
            System.out.println("\n============= 폰 판매 =============");
            System.out.println("1. 모든 핸드폰 조회");
            System.out.println("2. 모든 핸드폰의 평균가 확인");
            System.out.println("3. 구매하려는 핸드폰 가격 조회");
            System.out.println("0. 프로그램 종료");
            System.out.print("번호 입력 >> ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    for (Phone phone : phones) {
                        System.out.println(phone.getInformation());
                    }
                    break;
                case 2:
                    int sum = 0;
                    for (Phone phone : phones) {
                        sum += phone.getPrice();
                    }
                    System.out.println(sum / phones.length);
                    break;
                case 3:
                    System.out.print("조회하려는 핸드폰(1~5): ");
                    int m = sc.nextInt();
                    System.out.println(phones[m - 1].getPrice());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                    break;
                default:
                    System.out.println("비정상적인 입력값입니다");
                    flag = false;
                    break;
            }
            if (!flag) {
                break;
            }
        }
    }
}
