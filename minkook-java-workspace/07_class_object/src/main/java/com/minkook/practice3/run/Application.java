package com.minkook.practice3.run;

import com.minkook.practice3.controller.Function;

public class Application {
    public static void main(String [] args){
        Function f = new Function();
        f.printLottoNumbers();
        System.out.println();
        f.outputChar(5,'a');
        System.out.println();
        System.out.println("랜덤 영문자 출력: " + f.alphabette());
        System.out.println(f.mySubstring("apple",2,4));

    }
}
