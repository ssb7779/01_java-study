package com.seunjoo.section04.constructor;

public class User {

    // 필드 선언부
    private String id;
    private String pwd;
    private String name;

    //생성자 선언부
    public User() {
        System.out.println("User 클래스의 기본 생성자 호출됨..");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;    //매개변수 2개짜리 생성자
        System.out.println("User 클래스의 id, pwd를 초기화하는 생성자가 호출됨..");
    }

    public User(String id, String pwd, String name) {
        this(id, pwd); //사전에 작성되어있는 다른 생성자 호출
        this.name = name;
        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출됨...");
    }


    public String getInformation() {
        return "아이디:" + id + ", 비밀번호: " + pwd + "입니다.";
    }

    //메소드 선언부


}
