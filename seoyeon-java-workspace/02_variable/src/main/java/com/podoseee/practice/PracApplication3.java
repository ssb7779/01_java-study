package com.podoseee.practice;

public class PracApplication3 {
    public static void main(String[] args){
        int age = 23;
        String gender = "여";
        String name = "이서연";
        float height = 157.1f;

        // 처음 오류 코드
        // System.out.println("%d살 + %s + %s님 + 키가 %dcm 이시군요!" + (age+gender+name+height));

        // 수정 코드
        System.out.printf("%d살 %s자 %s님, 키가 %.1fcm 이시군요!", age, gender, name, height);
    }
}
