package com.podoseee.homework.run;

import com.podoseee.homework.view.Menu;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();

        menu.displayMenu();
    }
}
