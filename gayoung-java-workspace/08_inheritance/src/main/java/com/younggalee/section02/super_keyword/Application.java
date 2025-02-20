package com.younggalee.section02.super_keyword;

public class Application {
    public static void main(String[] args) {
        Product pd1 = new Product();
        System.out.println(pd1.getInformation());
        System.out.println("---------------");

        Product pd2 = new Product("S-01234", "삼성", "갤럭시", 2390000);
        System.out.println(pd2.getInformation());

        Computer com1 = new Computer();
        System.out.println(com1.getInformation());

        Computer com2 = new Computer("스냅드래곤", 512, 12, "안드로이드");
        System.out.println(com2.getInformation());

        Computer com3 = new Computer("S-012999", "삼성2", "갤럭시2", 239000220, "스냅드래곤2", 5122, 122, "안드로이드2");
        System.out.println(com3.getInformation());
    }
}
