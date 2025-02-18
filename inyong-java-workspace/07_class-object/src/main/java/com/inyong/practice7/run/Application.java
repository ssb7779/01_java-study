package com.inyong.practice7.run;

import com.inyong.practice7.controller.ProductManager;

public class Application {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.mainMenu();
    }
}