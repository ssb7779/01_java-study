package com.kyungbae.section04.overriding;

public class SubClass extends SuperClass {

    /*
    case1. 메소드명이 달라서 Overriding 불가
    @Override // => 오류 표출
    public void method2(int num){} // => 부모메소드명과 다른 오류
     */

    /*
    case2. 반환타입이 달라서 Overriding 불가
    @Override
    public int method(int num){ return 0; } // => int 에서 오류
     */

    /*
    case3. 매개변수가 달라서 Overriding 불가
    @Override  // => 오류 표출
    public void method(String num){}
     */

    // 메소드명, 반환타입, 매개변수가 일치할 경우 Overriding 성립
    @Override
    public void method(int i){} // 매개변수명은 달라도 오류 없음

    /*
    case4. 접근제어자가 protected보다 좁은 범위여서 Overriding 불가
    @Override
    [default] void protectedMethod () {}
     */

    // 부모메소드보다 더 넓은 범위여서 Overriding 성립
    @Override
    protected void protectedMethod(){} // public도 가능

    /*
    case5. 부모 private 메소드는 Overriding 불가
    @Override // 오류 발생
    private void privateMethod(){}
     */

    /*
    case6. 부모 final 메소드는 Overriding 불가
    @Override
    public final void finalMethod(){}
     */


}
