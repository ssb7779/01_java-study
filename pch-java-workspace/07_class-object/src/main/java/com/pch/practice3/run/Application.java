package com.pch.practice3.run;

import com.pch.practice3.controller.Function;

public class Application {
    public static void main(String[] args) {
        Function function = new Function();

        function.printLottoNumbers();
        function.outputChar(5, 'a');
        System.out.println("3. 랜덤 영문자 출력 : "+function.alphabette());
        System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + function.mySubstring("apple", 2, 4));
    }
}
