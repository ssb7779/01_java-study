package com.podoseee.section02.loop.run;
import com.podoseee.section02.loop.controller.For;
import com.podoseee.section02.loop.controller.While;

public class Application {

    /*
        ## 반복문 ##
        1.
     */
    public static void main(String[] args){
        While w = new While();

        //w.testBasicWhile();
        //w.testWhileExample1();
        //w.testWhileExample2();

        //w.testBasicDoWhile();
        //w.testDoWhileExample1();

        // For 클랫의 testBasicFor 메소드 호출
        For f = new For();

        //f.testBasicFor();
        //f.testForExample1();
        //f.testForExample2();
        //f.testForExample3();
        //f.testForExample4();
        //f.testForExample5();
        //f.testForExample6();
        //f.testForExample7();
        //f.testForExample8();
        //f.testForExample9();

        //f.testNestedFor();
        //f.testNestedForExample1();
        //f.testNestedForExample2();
        //f.testNestedForExample3();
        //f.testNestedForExample4();

        f.testInfinityLoop();
    }
}
