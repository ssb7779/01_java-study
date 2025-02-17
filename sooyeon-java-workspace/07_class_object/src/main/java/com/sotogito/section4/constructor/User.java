package com.sotogito.section4.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;

    /**
     * 생성자 constructor
     * 1. 객체 생성시 호출되는 메서드
     * 2. 생성 외 임의로 호출 불가능
     *
     * - 객체 생성시 명령이 있을 경우
     * - 개겣 생성시 필드에 초기화 시킬 값을 전달할때
     * - 객체 생성 방법을 제한두기 위해
     */

    public User() {
        System.out.println("User 클래스의 기본 생성자 호출");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User 클래스의 id와 pwd를 초기화해주는 생성자 호출");
    }

    public User(String id, String pwd,String name) {
        /**
         * 반드시 첫문장에
         *
         */
        this(id,pwd); //다른 생성자  활용
        this.name = name;
        System.out.println("User 클래스의 id와 pwd를 초기화해주는 생성자 호출");
    }

    public String getInfo(){
        return "아이디"+id+"비밀번호"+pwd+"이름"+name;
    }
}
