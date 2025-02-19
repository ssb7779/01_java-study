package com.minkook.section02.super_package;

public class Application {
    public static void main(String[] args){
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("S-01234","삼성","갤럭시z폴드2",2398000);
        System.out.println(product2.getInformation());
    }
}
