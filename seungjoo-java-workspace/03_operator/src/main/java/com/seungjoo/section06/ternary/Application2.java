package com.seungjoo.section06.ternary;

import org.w3c.dom.ls.LSOutput;

public class Application2 {

    //특정 정수값이 짝수인지 홀수인지 판별 후 출력
    //짝수일 경우 "짝수이다", 그게 아니면 "홀수이다"
    public static void main(String[] args) {



    int num = 4;

    String result = (num %2 == 1)? "홀수이다" : "짝수이다";
        System.out.println(result);

}}
