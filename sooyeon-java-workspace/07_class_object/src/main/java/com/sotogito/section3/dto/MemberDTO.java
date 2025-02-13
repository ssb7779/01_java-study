package com.sotogito.section3.dto;

public class MemberDTO {
    /**
     * ui DB의 테이블 기준으로 필드 작성
     * 회원번호, 회원명, 나이, 성별, 키 , 몸무게, 회원탈퇴여부
     */

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /**
     * ## setter
     * 1. 외부에서 필드값을 변경할때
     *
     */

    public void setNumber(int number){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) { //명명시 is뻄
        isActivated = activated;
    }


    /**
     * getter
     */
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
