package com.sotogito.section02.super_keyword;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("컴퓨터 기본생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        // super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("컴퓨터 필드 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price); //첫문장
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("컴퓨터+부터 필드 생성자 호출");
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


    public String getInformation() {
        return super.getInformation()
                + "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
