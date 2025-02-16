package com.seungjoo.homework.run;

import com.seungjoo.homework.controller.Function;
import com.seungjoo.homework.view.Menu;

public class Application {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Function f = new Function();
        f.displayMenu();
    }
}
