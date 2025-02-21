package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.util.Calendar;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {
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
        return false;
    }

    @Override
    public long leapDate(int startYear, int endYear) {
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
        return 0;
    }

    @Override
    public int selectTokenCount(String str) {
        return 0;
    }

    @Override
    public String toSpaceUpper(String str) {
        return "";
    }

    @Override
    public FoodShop[] csvFormat() {
        return new FoodShop[0];
    }

    // 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.
	
	
	
}
