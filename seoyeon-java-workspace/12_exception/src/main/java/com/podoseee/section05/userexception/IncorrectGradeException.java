package com.podoseee.section05.userexception;

public class IncorrectGradeException extends Exception{

    /*
        ## 사용자 정의 예외클래스 만들기 ##

     */
    public IncorrectGradeException(){

    }

    public IncorrectGradeException(String message){
        super(message);
    }
}
