package com.john.section02.super_keyword;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Default Constructor of ComputerClass Called (ChildClass)");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Only Parameter Constructor of ComputerClass Called (ChildClass)");
    }


    /*
         code~price 필드 => 상위필드에 대입
         cpu~operationSystem 필드 => 하위필드에 대입

         ## super
            1. 상위 인스턴스 참조값(주소값)을 가지고 있는 레퍼런스 변수
            2. 하위 클래스 내의 모든 생성자와 메서드에서 사용가능
            3. super. 을 이용해서 부모 멤버에 접근 가능 ( private 멤버는 제외)
    */
    public Computer(String code, String brand, String name, int price, String cpu, int hdd, int ram, String operationSystem) {
        /* 직접 접근이 불가능한 상위 클래스의 필드
            super.code = code;
            super.brand = brand;
            super.name = name;
            super.price = price;

            - 직접 접근이 안되는 경우에 대한 해결 방법1. => 상위 클래스에 있는 setter method를 사용
            super.setCode(code);
            super.setBrand(brand);
            super.setName(name);
            super.setPrice(price);

            - 해결 방법2. 상위 클래스에 정의되어있는 매개변수 생성자 이용
            super(): 
                상위 클래스에 정의되어있는 생성자 호출
                매개변수의 타입, 개수, 순서가 일치하는 부모 생성자 호출
                모든 클래스의 생성자에는 첫 줄에 직접 명시하지 않아도 super() 구문이 자동으로 추가됨(컴파일러 에서)
                다른 생성자를 호출하는 구문은 첫 문장으로 작성
        */
        super(code, brand, name, price);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer, Product의 모든 필드를 초기화하는 매개변수 생성");
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

//    @Override
//    public String getInformation() {
//        return "Computer[cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", operationSystem=" + operationSystem + "]";
//    }

    @Override
    public String getInformation() {
        return "Computer[" + super.getInformation() + "cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", operationSystem=" + operationSystem + "]";
    }
}

