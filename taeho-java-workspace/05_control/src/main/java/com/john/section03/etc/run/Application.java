package com.john.section03.etc.run;

import com.john.section03.etc.controller.BreakClass;
import com.john.section03.etc.controller.ContinueClass;

public class Application {
    public static void main(String[] args) {
        BreakClass bc = new BreakClass();
        /*
            while Test
            bc.testBasicBreak();
            bc.testBreakExample1();
            bc.testBreakExample2();
         */

        ContinueClass cc = new ContinueClass();
//        cc.testBasicContinue();
        cc.testContinueExample1();
    }
}
