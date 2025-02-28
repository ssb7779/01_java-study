package com.kyungbae.section02.super_keyword;

public class Computer extends Product {

    // 컴퓨터에서만 추가적으로 둘 수 있는 필드
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer(){
        System.out.println("Computer 클래스의 기본생성자 호출됨");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스에만 정의되어있는 모든 필드 초기화해주는 매개변수생성자 호출됨");
    }

    public Computer(String code, String brand, String name, int price
                  , String cpu, int hdd, int ram, String operationSystem){
        // code ~ price => 부모필드에 대입
        // cpu ~ os => 자식필드에 대입
        /*
        super.setCode(code); // 부모 클래스의 setter 메소드를 이용
        super.setBrand(brand);
        super.setName(name);
        super.setPrice(price);
        */
        super(code, brand, name, price); // 부모클래스의 매개변수생성자 이용

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Comper, Product 모든 필드를 초기화하는 매개변수 생성자 호출됨");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
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
    public String getInformation(){
        return super.getInformation() + "\n" + "cpu = " + cpu +  "\t" + "hdd = " + hdd +  "\t" + "ram = " + ram +  "\t" + "os = " + operationSystem;
    }



}



