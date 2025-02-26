package com.younggalee.section05.userexception;

public class IncorrectGradeException extends Exception{

    /*
    ## 사용자 정의 예외 클래스 만들기 ##
    1. Exception 또는 RuntimeException을 상속받아 구현
       - 이렇게 정의하면 강제로 예외처리를 할 수 있게 만들 수 있음 >> Exception   : checked Exception이 됨
       - 예외처리를 강제화 시키지는 않게 할 경우 >> RuntimeException : unchecked Exception이 됨
     */
    public IncorrectGradeException(){

    }

    public IncorrectGradeException(String message){
        super(message);
    }

}
