package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {

    // 해당 클래스안에 정의해야되는 메소드들은 현재
    // StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다.
    // 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.

    @Override
    public void printNowDateTime() {

    }

    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        return null;
    }

    @Override
    public void printFormat(Calendar calc) {

    }

    @Override
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }

    @Override
    public long leapDate(int startYear, int endYear) {
        LocalDateTime localDateTime = LocalDateTime.of(startYear, 1, 1, 0, 0);

        return 0;
    }

    @Override
    public int sumString(String num1, String num2) {
        return 0;
    }

    @Override
    public int minusString(String num1, String num2) {
        return 0;
    }

    @Override
    public int findCharCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(ch)
                    || str.charAt(i) == Character.toUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int selectTokenCount(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        return st.countTokens();
    }

    @Override
    public String toSpaceUpper(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        int tokenCount = st.countTokens();
        for (int i = 1; i <= tokenCount; i++) {
            String s = st.nextToken();
            if (i == tokenCount) {
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
            } else {
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(' ');
            }
        }
        return sb.toString();
    }

    @Override
    public FoodShop[] csvFormat() {
        return new FoodShop[0];
    }
}
