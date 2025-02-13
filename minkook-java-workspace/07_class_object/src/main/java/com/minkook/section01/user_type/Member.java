package com.minkook.section01.user_type;

public class Member {
    /*
        ## 필드 ##
        1. Field
        2. 클래스에 선언한 변수를 의미
        3. 멤버변수라고도 함
            * 멤버: 클래스에 정의되어 있는 변수 또는 메소드를 의미함
        4. 클래스 기반으로 생성되는 객체의 속성을 저장할 수 있음
        5. 필드는 해당 동일한 클래스 내의 모든 영역에서 사용할 수 있음
     */
    public String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[]hobby;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getPwd() {
        return pwd;
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

    public String[] getHobby() {
        return hobby;
    }

    public void printProfile(){
        System.out.println("이름은 " + getName());
        System.out.println("나이는 " + getAge());
    }


}
