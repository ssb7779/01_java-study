package com.sotogito.section04.comparison;

public class Application2 {


    public static void main(String[] args) {
        //논리값 간의 비교연산
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 == bool2" + (bool1 == bool2));
        System.out.println("bool1 != bool2" + (bool1 != bool2));

        System.out.println("bool1 == bool2" + (bool1 == bool2));
        System.out.println("bool1 == bool2" + (bool1 == bool2));

        //논리값은 대소비교 불가능

        //문자
        char char1 = 'a';
        char char2 = 'A';
        System.out.println("char1 == char2" + (char1 == char2));
        System.out.println("char1 != char2" + (char1 != char2));
        System.out.println("char1 > char2" + (char1 > char2));

        //문자열
        String str1 = "자바";
        String str2 = "자바";
        System.out.println("str1 == str2" + (str1 == str2));
        System.out.println("str1 == str2" + (str1.equals(str2)));

        Application1 app1 = new Application1();
        Application1 app11 = new Application1();
        Application2 app2 = new Application2();



        System.out.println("app1 == app11" + (app1 == app11));

        Application1 single = Application1.getApp1();
        Application1 single2 = Application1.getApp1();

        System.out.println("single == single2" + (single == single2));
        System.out.println("single == single2" + (single.equals(single2)));

    }

}
