package com.podoseee.practice;

public class PracApplication6 {
    public static void main(String[] args){
        int korean = 60;
        int math = 80;
        int english = 40;
        int sum = korean + math + english;
        int average = (korean + math + english) / 3;

        String result = ((korean>=40)&&(math>=40)&&(english>=40) && average >= 60) ? "합격" : "불합격";
        System.out.println(result);
    }
}
