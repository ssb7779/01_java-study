package com.podoseee.section04.overriding;

public class SubClass extends SuperClass{

    /*
        ## 오버라이딩 ##

        ## @Override ##

     */

    /* 메소드명이 다르므로 오버라이딩 할 수 없음
    @Override
    public void method2(int num){}
     */
    /* 반환타입이 다르므로 오버라이딩 할 수 없음
    @Override
    public int method(int num){ return 0; }
     */
    /* 매개변수가 다르므로 오버라이딩 할 수 없음
    @Override
    public void method(String num){}
    */

    // 메소드명, 반환타입, 매개변수가 일치할 경우 오버라이딩 성립
    @Override
    public void method(int i){}
    
    /* 접근제어자가 protected보다 좁은 범위이므로 오버라이딩 불가
    @Override
    void protectedMethod(){}
    */
    
    // 부모 메소드의 접근제어자보다 더 넓은 범위이므로 오버라이딩 성립
    @Override
    public void protectedMethod(){} // protected도 가능

    /* 부모 private 메소드는 오버라이딩 불가
    @Override
    private void privateMethod(){}
    */

    /* 부모 final 메소드는 오버라이딩 불가
    @Override
    public final void finalMethod(){}
    */

    /*
        final 변수    : 상수 (한번 초기화된 값 변경이 불가)
        final 메소드  : 오버라이딩 불가하도록
        final 클래스  : 상속이 불가하게끔 (상속 제한, 클래스 확장 불가)
     */
}
