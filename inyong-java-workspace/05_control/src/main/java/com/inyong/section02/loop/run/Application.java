package com.inyong.section02.loop.run;

import com.inyong.section02.loop.controller.For;
import com.inyong.section02.loop.controller.While;

public class Application {
    public static void main(String[] args) {
        While w = new While();
        For f = new For();
        f.testInfinityLoop();
    }
}