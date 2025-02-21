package com.podoseee.section04.date_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        /*
            ## java.text.SimpleDateFormat ##
         */

        // java.util.Date 객체 생성 후 반영
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH(hh):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);

        // java.util.Calendar 객체 생성 후 반영 (Calendar 객체 바로 전달시 오류발생)
        Calendar today2 = Calendar.getInstance();
        //String dateStr2 = sdf.format(new Date(today2.getTimeInMillis())); // Calendar 객체를 Date객체로 변환해서 전달
        String dateStr2 = sdf.format(today2.getTimeInMillis());             // 밀리초 값을 전달
        System.out.println(dateStr2);
    }
}