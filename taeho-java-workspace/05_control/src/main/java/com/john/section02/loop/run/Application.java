package com.john.section02.loop.run;

import com.john.section02.loop.controller.ForClass;
import com.john.section02.loop.controller.WhileClass;

public class Application {
    public static void main(String[] args) {
        WhileClass whileloop = new WhileClass();
        /* while Test
        whileloop.testBasicWhile();
        whileloop.testWhileExample();
        whileloop.testWhileExample2();
        whileloop.testDoWhileExample1();
         */

        ForClass forloop = new ForClass();
        /* For Test
        forloop.testBasicFor();
        forloop.testForExample();
        forloop.testForExample2();
        forloop.testForExample3();
        forloop.testForExample4();
        forloop.testForExample5();
        forloop.testForExample6();
        forloop.testForExample7();
        forloop.testForExample8();
        forloop.testForExample9();
        forloop.testNestedFor();
        forloop.testNestedForExample1();
        forloop.testNestedForExample2();
        forloop.testNestedForExample3();
        forloop.testNestedForExample4();
         */
        forloop.testInfiniteLoop();
    }
}
