package com.pch.practice.run;

import com.pch.practice.dto.CosmeticDTO;
import com.pch.practice.service.CosmeticService;
import com.pch.practice.service.CosmeticServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        CosmeticService cosmeticService = new CosmeticServiceImpl();

        Map<String, String> userInput = new HashMap<String, String>();
        userInput.put("name", "젠틀토닝로션");
        userInput.put("price", "23000");
        userInput.put("brand", "아벤느");
        userInput.put("category", "스킨케어");
        userInput.put("onSale", "할인안함");
        CosmeticDTO cosmeticDTO1 = cosmeticService.createCosmeticWithSetter(userInput);

        System.out.println("기본생성자 + setter 예제");
        System.out.println(cosmeticDTO1.toString());


        userInput.clear();
        userInput.put("name", "펜라이너");
        userInput.put("price", "15000");
        userInput.put("brand", "클리오");
        userInput.put("category", "아이메이크업");
        userInput.put("onSale", "할인함");
        CosmeticDTO cosmeticDTO2 = cosmeticService.createCosmeticWithConstructor(userInput);

        System.out.println("기본생성자 + setter 예제");
        System.out.println(cosmeticDTO2.toString());
    }
}
