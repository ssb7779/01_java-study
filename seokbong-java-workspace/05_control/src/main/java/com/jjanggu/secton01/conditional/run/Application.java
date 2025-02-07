package com.jjanggu.secton01.conditional.run;
import com.jjanggu.secton01.conditional.controller.If;
import com.jjanggu.secton01.conditional.controller.Switch;
import com.jjanggu.secton01.conditional.controller.ConditionPractice;

public class Application {
    public static void main(String[] args) {
        /*
            ## 제어문 ##
            프로그램의 흐름을 바꾸고자 할 때 제시하는 구문
            1) 조건문 => 선택적으로 구문 실행 가능
            2) 반복문 => 반복적으로 구문 실행 가능
            3) 기타

            ## 조건문 ##
            1. 특정 조건에 따라 각기 다른 문장이 수행될 수 있도록
               제어할 수 있는 구문
            2. 조건식의 결과는 반드시 논리값(true/false) 여야됨
            3. 종류
               1) if문
                  ㄴ else문
                  ㄴ else if문
               2) switch문
        */

    //if 클래스의 testBasicIf 메소드 호출
    If i = new If();
//    i.testBasicIf();
//    i.testBasicElse();
//    i.testBasicElseIf();
//    i.testIfExample1();
//        i.testIfExample2();
//        i.testIfExample3();
//        i.testNestedIf();
//        i.testNestedIfExample1();
//        i.testNestedIfExample2();

        Switch s = new Switch();
//        s.testSwitchExample();
//        s.testSwitchExample2();
//        s.testSwitchExample3();

        ConditionPractice cp = new ConditionPractice();
//        cp.practice1();
//        cp.practice2();
//        cp.practice3();
//        cp.practice4();
//        cp.practice5();
        cp.practice6();

    }
}
