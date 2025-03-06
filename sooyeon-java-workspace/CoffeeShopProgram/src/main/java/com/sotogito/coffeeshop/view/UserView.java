package com.sotogito.coffeeshop.view;

import com.sotogito.coffeeshop.controller.ShopController;
import com.sotogito.coffeeshop.controller.UserController;
import com.sotogito.coffeeshop.model.User;

public class UserView {
    private final ShopController shopController;
    private final UserController userController;

    public UserView(ShopController shopController, UserController userController) {
        this.shopController = shopController;
        this.userController = userController;
    }

    public void run(User user) {
        System.out.println("사용자 페이지입니다.");
    }

    public void printUserInformation(User user){
        System.out.println(user);
    }
}
