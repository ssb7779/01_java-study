package com.john.section04.constructor;

/*
    ## 생성자 (constructor)
    1. 객체 생성시 호출되는 메서드
    2. 객체 생성 시점 외 임의호출 불가
    3. 생성자의 사용 목적
        3.1. 객체 생성 시점에 수행할 명령이 있는 경우
        3.2. 객체 생성 시, 전달값을 전달해서 각 필드에 초기화 시키고자 할 경우
        3.3. 객체를 생성하는 방법을 제한두기 위해 사용
    4. 필요한 상황에 맞춰 여러 생성자를 생성 가능
    5. 종류
        5.1. 기본 생성자
            - 매개변수가 없기 때문에 생성자 호출 시 별도의 전달값을 받을 수 없음
            - 객체생성이 목적일 때 사용
            - 별도의 생성자가 정의되어 있지 않은 경우, 자바 컴파일러에서 자동으로 추가됨
            - [접근제어자] {생성자명}(클래스 명}() {}
        5.2. 매개변수 생성자
            - 매개변수가 있는 생성자로 생성자 호출 시 전달값을 받아서 사용
            - 전달된 값을 필드에 초기화 할 목적으로 사용
                => 객체 생성과 동시에 필드에 원하는 값을 초기화할 때 사용
            - [접근제어자] {생성자명} (매개변수, ...){
                this.필드 = 매개변수,
                this.필드 = 매개변수
                ...
                }
     6. this()
      6.1. 동일 클래스 내에 작성되어있는 다른 생성자 호출 구문
      6.2. 해당 생성자 호출이 완료되면 복귀
      6.3. 유의사항: 반드시 블럭 내 첫문장으로 기술

 */

public class User {
    private String id;
    private String pwd;
    private String name;

    public User() {
        System.out.println("user 클래스 기본 생성자 호출됨");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User 클래스의 id, pwd를 초기화하는 생성자 호출");
    }

    public String getInfo() {
        return "아이디: " + id + ", 비밀번호: " + pwd + ", 이름: " + name;
    }

    public User(String id, String pwd, String name) {

        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출");
    }


}
