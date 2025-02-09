package com.younggalee.section01.conditional.run;

import com.younggalee.section01.conditional.controller.If;
import com.younggalee.section01.conditional.controller.Switch;

public class Application {
    public static void main(String[] args) {
        /*
        # 제어문
        프로그램의 흐름을 바꾸고자 할 때
        1) 조건문 : 선택적
        2) 반복문 : 반복적
        3) 기타
         */
        If i = new If();
//        i.testBasicIf();
//        i.testIfExample();
//        i.testNestedIfExample2();

        Switch sw = new Switch();
//        sw.testSwitchExample2();
        sw.testSwitchExample3();

    }
}
