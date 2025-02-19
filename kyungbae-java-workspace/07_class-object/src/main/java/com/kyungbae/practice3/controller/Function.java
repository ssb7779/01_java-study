package com.kyungbae.practice3.controller;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Function {

    public void printLottoNumbers() {
        int[] lotto = new int[6];

        for (int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45 + 1);
//            System.out.printf("%d 번째 번호 : %d\n",(i+1), lotto[i]);
        }
        System.out.print("랜덤 값 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
    public void outputChar(int num, char c){

        System.out.printf("%c문자 %d개 출력 : ", c, num);
        for (int i = 0; i < num; i++) {
            System.out.print(c + " ");
        }

    }

    public char alphabette(){
        int ranNum = 0;
        do {
            ranNum = (int) (Math.random() * 58 + 65);
        } while (ranNum < 97 && ranNum > 90);
        char ranCh = (char)ranNum;
        return ranCh;
    }


    public String mySubstring(String str, int index1, int index2){
        if(str != null && !str.equals("")) {

            String result = "";

            result = str.substring(index1, index2);

            return result;

        }else {
            return null;
        }
    }

}
