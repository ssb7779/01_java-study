package com.sotogito.section05.logical;

public class Application4 {
    public static void main(String[] args) {
        //특정 성별값, 남자인지 판별
        char gender = 'm';

        boolean isMale = gender == 'm'|| gender == 'M';
        System.out.println(isMale);
    }
}
