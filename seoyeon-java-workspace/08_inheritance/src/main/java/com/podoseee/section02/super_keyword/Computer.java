package com.podoseee.section02.super_keyword;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer(){
        // super(); 부모 클래스에 있는 기본생성자 출력문이 먼저 출력
        System.out.println("Computer클래스의 기본생성자 호출됨");
    }

    public Computer(String code, String brand, String name, int price
                    , String cpu, int hdd, int ram, String operationSystem) {
        // code~price => 부모필드에 대입
        // cpu~operationSystem => 자식필드에 대입

        /*
            ## super ##
         */
        /*private 멤버여서 직접 접근 불가
        super.code = code;
        super.brand = brand;
        super.name = name;
        super.price = price;
         */

        //해결방법1. 각 필드의 setter 메소드 이용 (간접접근)
        /*super.setCode(code);
        super.setBrand(brand);
        super.setName(name);
        super.setPrice(price);*/
        // 해결방법2. 부모 클래스에 정의되어있는 매개변수 생성자 이용
        super(code, brand, name, price);

        /*
            ## super() ##

         */

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer, Product 모든 필드를 초기화하는 매개변수 생성자 호출됨");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        // super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer클래스에만 정의되어있는 모든 필드 초기화해주는 매개변수생성자 호출됨");
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
        return "Computer[" + super.getInformation() + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", os=" + operationSystem + "]";
    }
}
