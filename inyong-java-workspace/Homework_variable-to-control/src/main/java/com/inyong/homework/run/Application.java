package com.inyong.homework.run;

import com.inyong.homework.controller.Function;
import com.inyong.homework.view.Menu;

public class Application {
    public static void main(String[] args) {
        Function function = new Function();
        Menu menu = new Menu();

        menu.displayMenu();
    }
}
