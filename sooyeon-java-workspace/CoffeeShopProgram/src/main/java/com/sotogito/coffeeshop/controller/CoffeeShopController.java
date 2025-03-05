package com.sotogito.coffeeshop.controller;

public class CoffeeShopController {
    private final AdministratorController administratorController;
    private final UserController userController;

    public CoffeeShopController(AdministratorController administratorController, UserController userController) {
        this.administratorController = administratorController;
        this.userController = userController;
    }
}
