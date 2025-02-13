package com.inyong.section03.dto;

public class MemberDto {
    // 회원 번호, 회원명, 나이, 성별, 키, 몸무게, 회탈여


    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /*
    ## setter 메소드
    1. 해당 객체의 필드 값을 외부에서 변경할때 필요한 메소드
    2. 설정자 라고도 함

    set 필드명 (Camel Case)
    필드에 대입시킬 값을 전달받을 변수 (필드 타입과 동일하게 작성)
    반환 타입 void

     */
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    /*
    Getter
     */
    public int getNumber() {
        return number;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}


