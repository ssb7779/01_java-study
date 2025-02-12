package com.ibe6.section02.loop.run;

import com.ibe6.section02.loop.controller.For;
import com.ibe6.section02.loop.controller.While;

public class Application {

    /*
        ## 반복문 ##
        1. 특정 문장들을 반복적으로 수행할 수 있도록 하는 구문
        2. 종류
           1) for문
           2) while문
              ㄴ do while문
     */

    public static void main(String[] args) {
        While w = new While();
//        w.testBasicWhile();
//        w.testWhileExample1();
//        w.testWhileExample2();

//        w.testBasicDoWhile();
//        w.testDoWhileExample1();

        For f = new For();
//        f.testBasicFor();
//        f.testForExample1();
//        f.testForExample2();
//        f.testForExample3();
//        f.testForExample4();
//        f.testForExample5();
//        f.testForExample6();
//        f.testForExample7();
//        f.testForExample8();
//        f.testForExample9();
//        f.testNestedFor();
//        f.testNestedForExample1();
//        f.testNestedForExample2();
//        f.testNestedForExample3();
//        f.testNestedForExample4();
        f.testInfinityLoop();

    }
}
