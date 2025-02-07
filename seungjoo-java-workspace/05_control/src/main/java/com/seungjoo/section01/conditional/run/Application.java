package com.seungjoo.section01.conditional.run;

import com.seungjoo.section01.controller.ConditionPractice;
import com.seungjoo.section01.controller.If;

public class Application {
    public static void main(String[] args) {


        /*
        ##제어문
        프로그램의 흐름을 바꾸고자 할 때 제시하는 구문
        1)조건문 => 선택적으로 구문 실행 가능
        2)반복문 => 반복적으로 구문 실행 가능
        3)기타
         */

        /*
         ##조건문
         1. 특정 조건에 따라 각기 다른 문장이 수행될 수 있도록 제어할 수 있는 구문
         2. 종류
            1)if문
             ㄴelse-if
             ㄴ else
            2)swithch문
         */

        If i = new If();
//        i.testBasicElseIf();
//        i.testBasicIf();
        ConditionPractice c = new ConditionPractice();
        c.practice9();

    }
}
