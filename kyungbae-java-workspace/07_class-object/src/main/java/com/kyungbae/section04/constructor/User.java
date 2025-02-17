package com.kyungbae.section04.constructor;

public class User {
    /* 일반적으로 class 생성시 */

    // 필드 선언부
    private String id;
    private String pwd;
    private String name;

    // 생성자 선언부
    /*
        Constructor 종류
        1) 기본 생성자
        - 객체 생성만이 목적일때 사용됨
        - 별도의 생성자가 정의되어 있지 않을 경우 java Compiler 가 자동으로 추가해줌
            ** 생성자가 없을때만 생성
        <작성형식>
            public User() {}  // ** 반환타입 없음 (반환타입 입력시 메소드로 생성)
       접근제어자 생성자명==class명() {
            // 객체 생성시 수행할 명령 작성 <- 일반적으로 아무것도 안씀 (default constructor)
       }
       2) 매개변수 생성자
       - 전달된 값을 필드에 초기화 할 목적으로 사용
       <작성형식>
            public User(String id, String pwd, ...){
                this.id = id;
                this.pwd = pwd;
                ...
            }
           접근제어자 생성자명(매개변수, ..){
            this.필드 = 매개변수;
           }
     */


    public User() {
        System.out.println("User 클래스의 기본생성자 호출됨..");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User 클래스의 id, pwd를 초기화하는 생성자 호출됨..");
    }
    /*
    public User(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 클래스의 id, pwd, name를 초기화하는 생성자 호출됨..");
    }
    */
    public User(String id, String pwd, String name){
        this(id, pwd); // 같은 클래스 內 사전에 작성되어있는 다른 생성자를 호출 ** 반드시 첫문장으로 기술해야함
        this.name = name;
        System.out.println("User 클래스의 id, pwd, name를 초기화하는 생성자 호출됨..");
    }
    /*
//    오버로딩 (overloading)
        생성자 이름이 같지만 매개변수가 달라서 서로 다른 생성자로 인식한다.
     */


    // 메소드 선언부

    public String getInformation() {
        return "아이디 " + id + ", 비밀번호 " + pwd + ", 이름 " + name;
    }



}
