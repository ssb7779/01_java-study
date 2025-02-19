package com.minkook.section02.super_keyword;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

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

    public Computer() {
        System.out.println("Computer클래스의 기본생성자 호출됨");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer클래스의 매개변수생성자 호출됨");
    }

    public Computer(String code, String brand, String name, int price,String cpu, int hdd, int ram, String operationSystem) {
        /*
            code-price => 부모필드에 대입
            //cpu-operationSystem => 자식필드에 대입


            ## super ##
            1. 부모인스턴스 참조값(주소값)을 가지고 있는 레퍼런스 변수
            2. 자식클래스 내의 모든 생성자와 메소드에서 사용가능
            3. super. 을 이용해서 부모 멤버에 변수
         */
        
        
        //각 필드의 setter 메소드 이용
//        this.cpu = cpu;
//        this.hdd = hdd;
//        this.ram = ram;
//        this.operationSystem = operationSystem;
//
//        super.setCode(code);
//        super.setBrand(brand);
//        super.setName(name);
//        super.setPrice(price);

        //해결방법 부모클래스에 정의되어있는 매개변수 생성자이용
        // 다른생성자를 호출하는 구문은 첫 문장으로 작성해야 함
  
        super(code, brand, name, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer3클래스의 매개변수생성자 호출됨");

    }

    public String getInformation() {
        return "Computer{" + super.getCode() + super.getBrand() + super.getName() + super.getPrice()+
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem +
                '}';
    }
}
