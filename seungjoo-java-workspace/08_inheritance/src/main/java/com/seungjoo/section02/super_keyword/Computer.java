package com.seungjoo.section02.super_keyword;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer클래스의 기본생성자 호출됨");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }



    public Computer(String code, String brand, String name, int price, String cpu, int hdd, int ram, String operationSystem) {
        //code ~ price -> 부모 필드에 대입
        //cpu ~ operationSystem -> 자식 필드에 대입
        /*
        super.code = code;    //캡슐화를 지키기 위해 private으로 설정해서 이렇게 사용 불가
        super.brand = brand;
        super.name = name;
        super.price = price;
         */
//
//        super.setCode(code);   //각 필드의 setter메소드 이용
//        super.setBrand(brand);
//        super.setName(name);
//        super.setPrice(price);
//        this.cpu = cpu;
//        this.hdd = hdd;
//        this.ram = ram;
//        this.operationSystem = operationSystem;


        //해결 방법2. 부모 클래스에 정의되어있는 매개변수 생성자 이용
        super(code, brand, name, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;


    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    @Override
    public String getInformation() {
        return super.getInformation() + " cpu : " + cpu + " hdd : " + hdd + " ram : " + ram + " operationSystem : " + operationSystem;
    }
}
