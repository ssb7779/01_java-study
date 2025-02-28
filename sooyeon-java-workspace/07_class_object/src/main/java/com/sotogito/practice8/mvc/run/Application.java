package com.sotogito.practice8.mvc.run;

import com.sotogito.practice8.mvc.view.MemberMenu;

public class Application {
    /**
     * 실행되는 곳
     * @param args
     */
    public static void main(String[] args) {
        MemberMenu menu = new MemberMenu();
        menu.mainMenu();
    }
}
