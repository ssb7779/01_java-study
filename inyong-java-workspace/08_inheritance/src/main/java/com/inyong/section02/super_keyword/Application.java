package com.inyong.section02.super_keyword;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("S-1234", "삼성", "갤럭시Z", 2398000);
        System.out.println(product2.getInformation());

        System.out.println("====================\n");

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        System.out.println("\n========Computer 3 =======\n");
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000,
                "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());

    }

}
