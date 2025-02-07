package com.sotogito.section06.ternary;

import java.util.regex.Pattern;

public class Application4 {
    public static void main(String[] args) {
        //특정 문자값이 영문자인지 아닌지 판별 후 출력
        // true : "영문자이다"
        //false : "영문자가 아니다"
        //65 ~ 90
        //97 ~ 122

        char chr = 'a';

        String result = ((chr >= 65 && chr <= 90)
                         || (chr >= 97 && chr <= 122)) ? "영문자이다."
                                                        : "영문자가 아니다.";

        String result2 = ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z'))
                ? "영문자이다." : "영문자가 아니다.";


        System.out.println(result2);
    }
}
