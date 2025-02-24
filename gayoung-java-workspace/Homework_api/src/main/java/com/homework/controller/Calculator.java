package com.homework.controller;

import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.util.StringTokenizer;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {


    // 해당 클래스안에 정의해야되는 메소드들은 현재
    // StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다.
    // 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.

    // 메뉴 1, 2, 3
    // StringCalculator 인터페이스에 있는 메소드 오버라이딩

    // 1. 전달받은 문자열로부터 전달된 문자가 대소문자 상관없이 몇 개있는지 반환하는 메소드
    @Override
    public int findCharCount(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for(char c : str.toCharArray()) {
            if(c == ch) {
                count++;
            }
        }
        return count;
    }

    // 2. 전달받은 문자열을 공백을 기준으로 분리시켰을 때 몇 개의 문자열이 있는지 반환하는 메소드
    @Override
    public int selectTokenCount(String str) {
        StringTokenizer st = new StringTokenizer(str);
        return st.countTokens();
    }

    // 3. 전달받은 문자열에 공백을 기준으로 매 단어 앞글자마다 대문자로 처리하여 반환하시오
    @Override
    public String toSpaceUpper(String str) {
        StringBuilder sb = new StringBuilder();
        String[] inputArr = str.split(" ");

        for(String input : inputArr) {
            sb.append(Character.toUpperCase(input.charAt(0))).append(input.substring(1)).append(" ");
        }
        return sb.toString();
    }

    @Override
    public FoodShop[] csvFormat() {
        String csvStr =  "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
                + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
                + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
                + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
                + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
                + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
                + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
                + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
                + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
                + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";

        String[] foodStr = csvStr.split("\n");
        FoodShop[] foodShopArr = new FoodShop[10];

        for (int i=0; i<foodStr.length; i++){
            StringTokenizer st = new StringTokenizer(foodStr[i], ",");
            foodShopArr[i] = new FoodShop(Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken(), st.nextToken(), st.nextToken(), makeCalendar()); //
        }


        return foodShopArr;
    }
}
