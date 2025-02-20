package com.sh.section02.abstract_extends;

public abstract class Sports {
    private int people;
    public Sports(){}

    public Sports(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
    public abstract void rule();
    /*
    추상메소드 
    abstract method
    형태를 갖추지 못한 메소드(본문정의X
    본문이 필요없는 메소드를 추상 메소드로 정의하면 됨
    추상메소드를 포함하고 있는 클래스는 반드시 추상 클래스로 정의해야됨
     */
}
