package com.sotogito.section04.overriding;

/**
 * 클래스, 메서드의 final -> 상속, 오버라이딩을 막음
 */
public class SuperClass {

    public void method(int num){

    }

    protected void protectedMethod(){

    }

    private void privateMethod(){

    }

    public final void finalMethod(){ //final 외부에서 사용 가능하되, 자식에서 사용 불가

    }

}
