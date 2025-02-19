package com.sotogito.section02.super_keyword;

public class Application {
    public static void main(String[] args) {
//        Product p1 = new Product();
//        System.out.println(p1.getInformation());
//
//        Product p2 = new Product("S-01234","삼성","갤럭시 폴드",12431);
//        System.out.println(p2.getInformation());
//
//        Computer c1 = new Computer();
//        System.out.println(c1.getInformation());

        Computer c2 = new Computer("퀼컴", 512, 12, "안드");
        System.out.println(c2.getInformation());
        System.out.println(c2.getCode());

        Computer c3 = new Computer("S-01234", "삼성", "갤럭시 폴드", 12431, "퀼컴", 512, 12, "안드");
        System.out.println(c3.getInformation());
        System.out.println(c3.getCode());


    }
}
