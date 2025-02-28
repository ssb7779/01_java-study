package com.john.section04.bread;

public class Application {
    public static void main(String[] args) {
        BreadDTO bread = new BreadDTO();
        bread.setBreadName("초코빵");
        bread.setPrice(1000);
        System.out.println(bread.getInformation());

        BakeryDTO bakery = new BakeryDTO();
        bakery.setBakeryName("싱싱빵집");
        bakery.setAddress("삼성");
        System.out.println(bakery.getInformation());

        BakeryDTO bakery2 = new BakeryDTO();
        bakery2.setBakeryName("신선빵집");
        bakery2.setAddress("강남");
//        bakery2.setBread(bread);
        bakery2.setBread(new BreadDTO("크로와상", 5000));
        System.out.println(bakery2.getInformation());

        BakeryDTO bakery3 = new BakeryDTO("성심당", "대전시", new BreadDTO("튀김소보루",1000));
        System.out.println(bakery3);
        System.out.println("판매하는 빵: " + bakery3.getBread().getInformation());
    }
}
