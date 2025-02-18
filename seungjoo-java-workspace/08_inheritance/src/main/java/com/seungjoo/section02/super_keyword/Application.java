package com.seungjoo.section02.super_keyword;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("S-01234", "삼성", "갤럭시z폴드2",29384987);
        System.out.println(product2.getInformation());
        System.out.println("==============");

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512,512,"안드로이드");
        computer2.getInformation();




















    }
}
