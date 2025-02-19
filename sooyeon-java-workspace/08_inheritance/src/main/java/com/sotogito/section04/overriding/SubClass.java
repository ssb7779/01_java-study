package com.sotogito.section04.overriding;

public class SubClass extends SuperClass {

    /**
     * ## 오버라이딩
     * 1. 부모클래스에서 상속받는 메서드를 자식이 재정의
     * - 부모메서드명과 동일
     * - 부모메서드와 반환타입 동일
     * - 부모메서드의 매개변수(이름 제외) 동일
     * -!!!!! 접근제어자는 같거나, 더 넓은 범위, 예외처리는 같거나 더 하위 예외로 처리
     * <p>
     * ## 성립불가
     * - 부모메서드 private, final
     * <p>
     * ## Override 어노테이션
     * - 자동으로 생성되지만 작성 권장 - 추후 수정 필요시 오류 알려줌
     */

    @Override
    public void method(int i) {

    }

    /**
     * 부모(protected) -> 자식(public),(protected)
     * 자식은 부모 접근제어자보다 넓거나, 같아야함.
     * - 부모가 private나 final이면 불가능
     */
    @Override
    public void protectedMethod() {

    }

    /**
     * ##  final
     * - 변수 : 상수, 값 재선언 불가
     * - 메서드 : 오버라이딩 불가
     * - 클래스 : 상속 불가
     */



}
