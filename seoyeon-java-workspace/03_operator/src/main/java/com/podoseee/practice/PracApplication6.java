package com.podoseee.practice;

public class PracApplication6 {
    public static void main(String[] args){
        int korean = 60;
        int math = 80;
        int english = 40;
        int sum = korean + math + english;
        double average = sum / 3.0; //소수점 표현이 어려워서 데이터 손실이 발생한다. 따라서 3.0을 나눈 것임
        //int average = (korean + math + english) / 3;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
        System.out.println((korean>=40)&&(math>=40)&&(english>=40) && average >= 60 ? "합격" : "불합격");
    }
}
