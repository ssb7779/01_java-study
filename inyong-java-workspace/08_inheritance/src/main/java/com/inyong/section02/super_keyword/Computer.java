package com.inyong.section02.super_keyword;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("computer 클래스에만 정의 되어있는 모든 필드 초기화 해주는 매개변수 생성자");
    }

    public Computer(String code, String brand, String name, int price, String cpu, int hdd, int ram, String operationSystem) {
        /* super
        1. 부모 인스턴스 참조값(주소값)을 가지고 있는 레퍼런스 변수
        2. 자식 클래스 내의 모든 생성자와 메소드에서 사용가능
        3. super. 을 이용해서 부모 멤버에 접근 가능
        단, private 멤버는 불가 (protected는 가능)
         */

        // super.code = code; (불가능 private)
        // super.setCode(code); (가능 setter)
        /*
        super()
        부모클래스에 정의 되어있는 생성자를 호출하는 구문
        매개변수의 타입, 개수, 순서가 일치하는 부모 생성자 호출
        모든 클래스의 생성자에는 맨 첫줄에 직접 명시하지 않아도 super() 구문이 자동으로 추가됨(컴파일러 역할)
        다른생성자를 호출하는 구문은 첫 문장으로 작성해야됨
         */
        super(code, brand, name, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer, Product 모든 필드를 초기화하는 매개변수 생성자 호출됨 ");
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String getInformation() {
        return "Computer[" + super.getInformation() + "\ncpu : " + cpu + "\nhdd : " + hdd + "\nram : " + ram + "\nos : " + operationSystem + "]";
    }
}
