package com.podoseee.section01.generic;

/*
    ## 제네릭 ##
 */

public class Container<T> {

    private T item; // T 타입의 item을 가질 수 있는 필드

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public String toString(){
        return String.valueOf(item);
    }

}
