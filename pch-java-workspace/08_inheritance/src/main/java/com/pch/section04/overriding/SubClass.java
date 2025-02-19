package com.pch.section04.overriding;

public class SubClass extends SuperClass {

    @Override
    public void method(int i){}

    @Override
    public void protectedMethod(){} // 부모 메소드의 접근제어자보다 더 넓은 범위이므로 오버라이딩 성립

    // private 는 사용 불가
//    @Override
//    private void privateMethod(){}

    // final 경우에도 사용 불가
//    @Override
//    public final void finalMethod(){}
}
