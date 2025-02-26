package com.younggalee.section05.throw_exception;

import com.younggalee.section05.userexception.IncorrectAgeException;
import com.younggalee.section05.userexception.IncorrectGradeException;

public class ThrowTest {
    // 자바에서는 예외로 인식하지 못하지만 프로그램에서 요구되는 예외상황이 있음
    // 이럴때는 직접 throw로 예외를 발생시킬 수 있음
    // throw new 예외클래스([예외메세지]);

    public void checkScore(int score) {
        System.out.println(score);
        if (score < 0 || score > 100) {
            throw new RuntimeException();
        }
    }

    public void checkAge(int age) {
        if (!(age < 0 || age < 120)) {
            throw new IncorrectAgeException("말이 돼냐");
        }
        System.out.println(age);
    }

    public void checkGrade(char grade) throws Exception{
        if(!(grade >= 'A' && grade <= 'D')){
            throw new IncorrectGradeException("유효하지 않습니다. ");
        }
    }

}