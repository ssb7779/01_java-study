package com.sotogito.section7.objectarray.run;

import com.sotogito.practice2.dto.BookDTO;
import com.sotogito.section7.objectarray.controller.PhoneManager;
import com.sotogito.section7.objectarray.dto.Phone;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneManager manager = new PhoneManager();

        Phone[] phones = {
                new Phone("삼성", "갤럭시", "z플립", 1600000)
                , new Phone("애플", "아이폰", "16프로", 1300000)
                , new Phone("애플", "아이폰", "12프로", 1310000)
                , new Phone("삼성", "갤럭시아이폰", " s20", 1200000)
                , new Phone("LG", "롤리팝", "2", 600000)
        };

        while (true) {
            System.out.println("폰");
            System.out.println("1. 모든 폰 조회");
            System.out.println("2. 폰 평균가 조회");
            System.out.println("3. 핸드폰 가격 조회");
            System.out.println("3. 핸드폰들 가격 조회");
            System.out.println("0. 종료");
            int functionNum = sc.nextInt();


            if(functionNum == 0){
                System.out.println("종료합니다.");
                return;
            }

            if(functionNum == 1){
                manager.selectAllPhone(phones);

            }else if (functionNum == 2) {
                System.out.println(manager.calculatePhonePriceAverage(phones));

            }else if (functionNum == 3) {
                sc.nextLine();
                String inputPhoneName = sc.nextLine();
                int price = manager.findPhonePriceByName(phones,inputPhoneName);
                if(price <0){
                    System.out.println("존재하지 않음");
                    continue;
                }
                System.out.println(price);

            } else if (functionNum == 4) {
                sc.nextLine();
                String inputPhoneName = sc.nextLine();
                for(Phone phone : manager.findPhonesByName(phones,inputPhoneName)){
                    System.out.printf("%s핸드폰의 가격은 %d입니다.\n",phone.getSeries(),phone.getPrice());
                }

            } else {
                System.out.println("잘못입력하였습니다.");
            }
        }


    }

}
