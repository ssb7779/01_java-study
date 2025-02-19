package com.seungjoo.section04.overriding;

public class SubClass extends SuperClass {

//    @Override
//    public int method(int num){return 0;}


    //메소드명, 반환타입, 매개변수가 일치할 경우 오버라이딩 성립
    @Override
    public void method(int i){}

    /*
    접근제어자가 protected보다 좁은 범위이므로 오버라이딩 불가
    @Override
    void protectedMethod(){}
     */



    //부모 메소드의 접근 제어자보다 더 넓은 범위이므로 오버라이딩 성립
    @Override
    public void protectedMethod(){} //protected도 가능


    /*
    @Override
    public final void finalMethod(){}
     */




}
