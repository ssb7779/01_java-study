package com.kyungbae.section02.super_keyword;

public class Application {

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("S-012", "삼성", "갤럭시z폴드2", 2398000);
        System.out.println(product2.getInformation());

        System.out.println("=================================================================");

        System.out.println("---- computer1 ----");
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        System.out.println("---- computer2 ----");
        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        System.out.println("---- computer3 ----");
        Computer computer3 = new Computer(
                "S-013", "삼성", "갤럭시z플립", 2398000
                , "퀄컴 스냅드래곤", 512, 12, "안드로이드"
        );
        System.out.println(computer3.getInformation());
    }

}
