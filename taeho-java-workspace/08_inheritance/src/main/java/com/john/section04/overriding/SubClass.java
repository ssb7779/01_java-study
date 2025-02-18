package com.john.section04.overriding;

/*
    ## 오버라이딩(Overriding)
    1. 부모클래스에서 상속받은 메서드를 자식클래스에서 재정의해서 사용하는 개념
    2. 성립요건
        2.1. 부모클래스의 메서드 명과 반환타입, 매개변수(타입, 개수, 순서)를 동일하게 작성해야함
        2.2. 접근제어자는 부모메서드의 접근제어자와 같거나 더 넓은 범위여야함
        2.3. 예외 처리시, 같거나 더 구체(하위)적인 예외처리문으로 작성해야함

    3. 성립이 불가능한 경우
        3.1. 부모 메서드의 접근제어자가 private 혹은 final이 붙어있는 경우
        3.2. 부모 클래스에 final이 붙어 있는 경우


    ## @Override Annotation
    1. 오버라이딩 된 메서드임을 알리는 애너테이션 (생략가능, 작성권장)
    2. 부모메서드 수정 or 규칙에 맞지 않게 작성시
        => 자식메서드에 해당 애너테이션이 있다면 오류 발생

 */
public class SubClass extends SuperClass {
    /* 
    메서드 명이 다른 경우
    @Override
    public void method2(int num) {}
    
    반환 타입이 다른 경우
    @Override
    public int method(int num){return 0;

    매개 변수의 타입이 다른 경우
    @Override
    public void superClassPublicMethod(String num){}

    접근 제어자의 범위가 좁은 경우
    @Override
    void superClassProtectedMethod() {}

    부모 메서드의 접근제어자가 private 인 경우
    @Override
    private void superClassPrivateMethod(){}
       
    부모 메서드에 final이 있는 경우
    @Override
    public final void superClassPublicFinalMethod(){}

     */

    // 부모 메서드 Override
    @Override
    public void superClassPublicMethod(int num) {
        super.superClassPublicMethod(num);
    }

    @Override
    public void superClassProtectedMethod(){}



}
