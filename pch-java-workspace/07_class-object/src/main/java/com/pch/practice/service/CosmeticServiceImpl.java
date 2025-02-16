package com.pch.practice.service;

import com.pch.practice.dto.CosmeticDTO;

import java.util.Map;
import java.util.NoSuchElementException;

/*
    실습.
    화장품과 관련된 데이터를 보관할 CosmeticDTO 클래스 작성해보시오.
    이름, 가격, 브랜드, 카테고리, 할인여부를 속성으로 가져야된다.

    CosmeticDTO 클래스 작성이 다끝나면 실행용 클래스에서
    1. 기본생성자 + setter 이용해서 객체 생성
       - 화장품명 : 젠틀토닝로션
       - 가격 : 23000
       - 브랜드 : 아벤느
       - 카테고리 : 스킨케어
       - 할인여부 : 할인안함
    2. 매개변수생성자 이용해서 객체 생성
       - 화장품명 : 펜라이너
       - 가격 : 15000
       - 브랜드 : 클리오
       - 카테고리 : 아이메이크업
       - 할인여부 : 할인함

    각 객체의 정보 출력.
 */

public class CosmeticServiceImpl implements CosmeticService{

    @Override
    public CosmeticDTO createCosmeticWithSetter(Map<String, String> userInput) {
        CosmeticDTO cosmeticDTO = new CosmeticDTO();

        cosmeticDTO.setName(userInput.get("name"));
        cosmeticDTO.setBrand(userInput.get("brand"));
        cosmeticDTO.setCategory(userInput.get("category"));
        cosmeticDTO.setPrice(Integer.parseInt(userInput.get("price")));

        if (userInput.get("onSale").equals("할인함")) {
            cosmeticDTO.setOnSale(true);
        } else if("할인안함".equals(userInput.get("onSale"))) {
            cosmeticDTO.setOnSale(false);
        } else {
            throw new NoSuchElementException();
        }

        return cosmeticDTO;
    }

    @Override
    public CosmeticDTO createCosmeticWithConstructor(Map<String, String> userInput) {
        String name = userInput.get("name");
        int price = Integer.parseInt(userInput.get("price"));
        String brand = userInput.get("brand");
        String category = userInput.get("category");
        boolean onSale;
        if (userInput.get("onSale").equals("할인함")) {
            onSale = true;
        } else if("할인안함".equals(userInput.get("onSale"))) {
            onSale = false;
        } else {
            throw new NoSuchElementException();
        }

        CosmeticDTO cosmeticDTO = new CosmeticDTO(name, price, brand, category, onSale);

        return cosmeticDTO;
    }
}
