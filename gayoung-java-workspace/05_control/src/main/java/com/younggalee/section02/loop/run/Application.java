package com.younggalee.section02.loop.run;

import com.younggalee.section02.loop.controller.While;
import com.younggalee.section02.loop.controller.For;

public class Application {
    /*
    # 반복문 #
    1. 특정 문장들을 반복적으로 수행할 수 있도록 하는 구문
    2. 종류
    : for문
    : while문 - do while문
     */
    public static void main(String[] args){
        While wh = new While();
//        wh.testBasicWhile();
//        wh.testWhileExample1();

        For f = new For();
//        f.testBasicFor();
//        f.testForExample1();
//        f.testForExample4();
//        f.testForExample5();
//        f.testForExample7();
//        f.testForExample8();
//        f.testForExample9();
//        f.testNestedForExample2();
//        f.testNestedForExample3();
//        f.testNestedForExample4();
        f.testInfinityLoop();
    }


}
