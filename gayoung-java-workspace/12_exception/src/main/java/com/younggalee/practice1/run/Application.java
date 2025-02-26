package com.younggalee.practice1.run;

import com.younggalee.practice1.controller.NamingTest;
import com.younggalee.practice1.exception.NamingException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException, NamingException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("변수명으로 쓸 문자열을 쓰시오 : ");
        String input = br.readLine();
        NamingTest nt = new NamingTest();

        Boolean resultR = nt.isReservedWord(input);
        Boolean resultS = nt.isSpecialWord(input);
        Boolean resultN = nt.isNumFirst(input);

        if (resultR && resultS && resultN){
            System.out.println("사용가능합니다.");
        }
    }
}
