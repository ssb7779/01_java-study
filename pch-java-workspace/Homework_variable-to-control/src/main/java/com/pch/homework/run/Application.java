package com.pch.homework.run;

import com.pch.homework.view.Menu;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();

        menu.displayMenu();
    }
}
