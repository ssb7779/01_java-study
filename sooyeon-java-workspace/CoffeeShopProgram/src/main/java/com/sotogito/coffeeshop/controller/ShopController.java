package com.sotogito.coffeeshop.controller;

import com.sotogito.coffeeshop.dao.ShopProductManager;
import com.sotogito.coffeeshop.model.Product;

import java.util.List;

public class ShopController {
    private final ShopProductManager shopProductManager;

    public ShopController(ShopProductManager shopProductManager) {
        this.shopProductManager = shopProductManager;
    }

    public List<Product> getCoffeeList(){
        return shopProductManager.getCoffeeList();
    }

    public List<Product> getBreadList(){
        return shopProductManager.getBreadList();
    }

}
