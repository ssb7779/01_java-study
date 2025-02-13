package com.minkook.homework.run;

import com.minkook.homework.controller.Function;
import com.minkook.homework.view.Menu;

public class Application {
    public static void main(String[] args){
        Function f = new Function();
        Menu menu = new Menu();
        menu.displayMenu();

    }
}
