package com.john.section02.super_keyword;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        Product product2 = new Product("코드","브랜드","이름",1000);
        System.out.println(product2.getInformation());

        System.out.println("======================================================");

        // 상속구조로 상위클래스가 호출되고 자식클래스가 호출됨
        Computer computer1 = new Computer();

        // ParentClass method Called(if Not define method)
        // System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("씨퓨", 1024, 32, "리눅스");
        System.out.println(computer2.getInformation());

        Computer computer3 = new Computer(
                "S-01234", "삼성", "갤럭시폴드", 248334,"퀄컴",512,12,"안드");
        // 상위 클래스의 매개변수를 넣어도 메서드 자체가 자식 클래스에 재정의된 getInformation()으로 상위 클래스의 필드값은 호출되지 않음
        // 하위 클래스의 getInformation() 메서드에 상위 클래스의 getInformation()를 super로 호출해서 상위 클래스의 매개변수를 출력
        System.out.println(computer3.getInformation());

    }
}
