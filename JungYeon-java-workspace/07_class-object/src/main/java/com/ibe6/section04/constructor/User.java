package com.ibe6.section04.constructor;

import java.util.SplittableRandom;

public class User {

    // 필드 선언부
    private String id;
    private String pwd;
    private String name;

    // 생성자 선언부
    /*
        ## 생성자 ##
        1. constructor
        2. 객체 생성시 호출되는 특별한 메소드
        3. 객체 생성 시점 외에 임의로 호출 할 수 없음
        4. 생성자 사용 목적
           1) 객체 생성 시점에 수행할 명령이 있을 경우 사용
           2) 객체 생성시 전달값을 전달해서 각 필드에 초기화 시키고자 할 경우
           3) 객체 생성하는 방법을 제한두기 위해 사용
        5. 생성자 종류
           1) 기본 생성자
              - 매개변수가 없기 떄문에 생성자 호출시 별도의 전달값 받을 수 없음
              - 단지 객체 생성만이 목적일 때 사용됨
              - ** 별도의 생성자가 정의되어 있지 않을 경우 Java Compiler가 자동으로 추가해줌
              - 작성형식
                접근제어자 생성자명() {
                    // 객체생성시 수행할 명령 작성
                 }

           2) 매개변수 생성자
              - 매개변수 있는 생성자로, 생성자 호출시 전달값을 받아서 사용할 수 있음
              - 주로 전달된 값을 필드에 초기화할 목적으로 사용
                즉, 객체 생성과 동시에 필드에 원하는 값을 초기화할 때 주로 사용
              - 작성형식
                접근제어자 생성자명(매개변수, ..) {
                    this.필드 = 매개변수;
                    this.필드 = 매개변수;
                    ...
                  }
     */
    //기본생성자
    public User(){
        System.out.println("User 클래스의 기본생성자 호출됨..");
    }


    public User(String id, String pwd){
        this.id = id;
        this.pwd= pwd;
        System.out.println("User 클래스의 ud,pwd를 초기화하는 생성자 호출됨..");
    }

    /*
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 클래스의 모든 필드(id, pwd, name)을 초기화하는 생성자 호출됨...");
    }
     */
    public User(String id, String pwd, String name) {
        this(id, pwd); // 사전에 작성되어있는 다른 생성자를 호출
        this.name = name;
        System.out.println("User 클래스의 모든 필드(id, pwd, name)을 초기화하는 생성자 호출됨...");
    }

    /*
        ## this() ##
        1. 동일 클래스 내에 작성되어있는 다른 생성자 호출 구문
        2. 해당 생성자 호출이 완료 되면 복귀함
        3. 유의사항 : 반드시 첫 문장으로 기술
     */

    public String getInformation(){
        return "아이디:" + id + " 비밀번호:" + pwd + " 이름:" + name;
    }

}
