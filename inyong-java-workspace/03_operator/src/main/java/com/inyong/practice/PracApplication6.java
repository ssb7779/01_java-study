package com.inyong.practice;

public class PracApplication6 {
    public static void main(String[] args) {


    int korean = 60;
        int english = 80;
        int math = 40;

    double avg = (korean + english + math) / 3.0;
        System.out.println(avg);
        System.out.println(korean < 40
                ? "불합격" : english < 40
                ? "불합격" : math <40
                ? "불합격" : avg < 60
                ? "불합격" : "합격"  );

    }

}
