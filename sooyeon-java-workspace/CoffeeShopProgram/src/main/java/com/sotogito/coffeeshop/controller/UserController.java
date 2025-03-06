package com.sotogito.coffeeshop.controller;

import com.sotogito.coffeeshop.dao.ShopProductManager;
import com.sotogito.coffeeshop.dao.UserOrderManager;
import com.sotogito.coffeeshop.model.Product;
import com.sotogito.coffeeshop.model.User;

public class UserController {
    private final UserOrderManager userOrderManager;
    private final ShopProductManager shopProductManager;
    private User user;

    public UserController(UserOrderManager userOrderManager, ShopProductManager shopProductManager) {
        this.userOrderManager = userOrderManager;
        this.shopProductManager = shopProductManager;
    }

    public void setUser(){
    }

    public void order(String productName){
        Product product = shopProductManager.findProductByName(productName);
        userOrderManager.order(user, product);
    }






}
