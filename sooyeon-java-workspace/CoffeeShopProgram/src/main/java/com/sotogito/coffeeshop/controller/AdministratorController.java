package com.sotogito.coffeeshop.controller;

import com.sotogito.coffeeshop.dao.ShopInformationManager;
import com.sotogito.coffeeshop.dao.ShopProductManager;
import com.sotogito.coffeeshop.dao.ShopSalesManager;

public class AdministratorController {
    private final ShopInformationManager shopInformationManager;
    private final ShopProductManager shopProductManager;
    private final ShopSalesManager shopSalesManagement;

    public AdministratorController(ShopInformationManager shopInformationManager, ShopProductManager shopProductManager, ShopSalesManager shopSalesManagement) {
        this.shopInformationManager = shopInformationManager;
        this.shopProductManager = shopProductManager;
        this.shopSalesManagement = shopSalesManagement;
    }
}
