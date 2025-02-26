package com.younggalee.section05.userexception;

public class IncorrectAgeException extends RuntimeException{ // 강제화시키고 싶지 않을때

    public  IncorrectAgeException (){}

    public  IncorrectAgeException (String message){
        super(message);
    }
}
