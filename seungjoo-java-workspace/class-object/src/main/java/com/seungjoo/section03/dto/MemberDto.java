package com.seungjoo.section03.dto;

public class MemberDto {

    /*
        회원 번호, 회원명, 나이, 성별, 키, 몸무게. 회원탈퇴여부
     */

    private int number;				    	//회원번호
    private String name;				    //회원명
    private int age;					      //나이
    private char gender;				    //성별
    private double height;			  	//키
    private double weight;			  	//몸무게
    private boolean isActivated;		//회원탈퇴여부(활성화여부)



    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumber() {
        return number;
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

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
