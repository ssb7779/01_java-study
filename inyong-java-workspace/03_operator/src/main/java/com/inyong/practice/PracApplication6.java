package com.inyong.practice;

public class PracApplication6 {
    public static void main(String[] args) {


    int korean = 60;
    int english = 80;
    int math = 40;

    int avg = (korean + english + math) / 3;

        System.out.println(korean < 40
                ? "불합격" : english < 40
                ? "불합격" : math <40
                ? "불합격" : avg < 60
                ? "불합격" : "합격"  );

    }

}
