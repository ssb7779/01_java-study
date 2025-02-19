package com.inyong.section04.overriding;

public class SubClass extends SuperClass {

    /*
    오버라이딩

    1. overriding
    2. 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 개념
    3. 오버라이딩 성립요건
        1) 부모메소드명과 동일하게 작성
        2) 부모메소드와 반환타입이 동일해야됨
        3) 부모메소드의 매개변수(타입, 개수, 순서)도 동일해야됨
        4) 접근제어자는 부모메소드의 접근제어자와 같거나 더 넓은 범위여야됨
        5) 예외처리는 같은 예외이거나, 더 구체적인 예외를 처리해야됨
    4. 오버라이딩 성립 불가
        1) private 부모 메소드는 오버라이딩 불가
        2) final 부모 메소드는 오버라이딩 불가

       @Override
       1. 오버라이딩 된 메소드임을 알리는 역할의 어노테이션
       2. 생략가능함
       3. 작성 권장함
            ㄴ 후에 부모메소드 수정시 => 오버라이딩 하고 있는 자식 클래스에 오류로 알려줌
            ㄴ 오버라이딩 규칙에 맞지 않게 작성시 => 오류로 알려줌


    ! 반환 타입이나 매개변수가 다르므로 오버라이딩 할 수 없음
    @Override
    public int method(int num) {
        return 0;
    }

    @Override
    public void method(String num) {
        return 0;
    }

     */

    @Override
    public void method(int i){}

    /* 접근 제어자가 protected 보다 좁은 범위 이므로 오버라이딩 불가
    private < default < protected < public
    @Override
    default void protectedMethod(){}
    */
    public void protectedMethod(){}


    /*
    부모 final 메소드는 오버라이딩 불가
    @Override
    public final void finalMethod(){}

    final 변수    : 상수 ( 초기화된 값 변경 불가)
    final 메소드   : 오버라이딩 불가
    final 클래스  : 상속이 불가하게끔 (상속 제한, 클래스 확장 불가)
     */
}
