package com.jjanggu.section02.super_keyword;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;


    public Computer(){
        // super();
        System.out.println("Computer클래스의 기본생성자 호출됨");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem){
        // super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer클래스에만 정의되어있는 모든 필드 초기화해주는 매개변수생성자 호출됨");
    }

    public Computer(String code, String brand, String name, int price
                   ,String cpu, int hdd, int ram, String operationSystem){
        // code~price => 부모필드에 대입
        // cpu~operationSystem => 자식필드에 대입

        /*
            ## super ##
            1. 부모 인스턴스 참조값(주소값)을 가지고 있는 레퍼런스 변수
            2. 자식 클래스 내의 모든 생성장와 메소드에서 사용 가능
            3. super. 을 이용해서 부모 멤버에 접근 가능
               단, private 멤버는 접근 불가 (protecter)
         */
       /* private 멤버여서 접근 불가
        super.code = code;
        super.brand() = brand;
        super.name = name;
        super.price = price;
        */

        /* 해결방법1. 각 필드의 setter 매소드 이용
        super.setCode(code);
        super.setBrand(brand);
        super.setName(name);
        super.setPrice(price);
        */

        // 해결방법2. 부모 클래스에 정의되어있는 매개변수 생성자 이용
        super(code, brand, name, price );

        /*
            ## super ##
            1. 부모클래스에 정의되어있는 생성자를 호출하는 구문
            2. 매개변수의 타입, 개수, 순서가 일치하는 부모 생성자 호출됨
            3. 모든 클래스의 생상제에게느는 맨 첫줄에 직접 명시하지 않아도  super() 구문이 자동으로 추가됨(컴파일러 역할)
            4. 다른 생성자를 호출하는 구문은 첫 문장으로 작성해야됨
         */
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer, Product 모든 필드를 초기화하는 매개변수 생성");

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
        return "Computer ["+ super.getInformation() + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", os=" + operationSystem + "]";
    }


}
