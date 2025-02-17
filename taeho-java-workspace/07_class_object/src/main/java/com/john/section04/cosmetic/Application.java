package com.john.section04.cosmetic;

public class Application {
    public static void main(String[] args) {
        CosmeticDTO cosmeticDTO = new CosmeticDTO();

        cosmeticDTO.setName("젠틀토닉로션");
        cosmeticDTO.setPrice(23000);
        cosmeticDTO.setBrand("아벤느");
        cosmeticDTO.setCategory("스킨케어");
        cosmeticDTO.setDiscount(false);

        System.out.println(cosmeticDTO.getInformation());
        System.out.println("==============");

        CosmeticDTO cosmeticDTO2 = new CosmeticDTO(
                "펜라이너", 15000, "클리오", "아이메이크업", true);

        System.out.println(cosmeticDTO2.getInformation());
    }
}
