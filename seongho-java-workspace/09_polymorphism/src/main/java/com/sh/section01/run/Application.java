package com.sh.section01.run;

import com.sh.section01.controller.ElectronicManager1;
import com.sh.section01.dto.Desktop;
import com.sh.section01.dto.NoteBook;
import com.sh.section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {
        ElectronicManager1 es1 = new ElectronicManager1();
        es1.insert(new Desktop("ss","데탑",1200000,"GF1070"));
        es1.insert(new NoteBook("lg","그램",1300000,4));
        es1.insert(new Tablet("ap","아이패드",1100000,false));

        es1.selectDesktop();

        /*
        대표적으로 다형성이 적용된 멧드
        Object 클래스의 equals메소드
        public boolean equals(Object o){}

        학생객체.equals(학생객체)
        도서객체.equals(도서객체)
        제품객체.equals(제품객체)
         */
    }
}
