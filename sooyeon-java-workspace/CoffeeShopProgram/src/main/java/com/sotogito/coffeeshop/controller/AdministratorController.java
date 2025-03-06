package com.sotogito.coffeeshop.controller;

import com.sotogito.coffeeshop.dao.ShopInformationManager;
import com.sotogito.coffeeshop.dao.ShopProductManager;
import com.sotogito.coffeeshop.dao.ShopSalesManager;
import com.sotogito.coffeeshop.model.Product;
import com.sotogito.coffeeshop.model.Shop;

import java.util.List;

public class AdministratorController {
    private final ShopInformationManager shopInformationManager;
    private final ShopProductManager shopProductManager;
    private final ShopSalesManager shopSalesManagement;

    public AdministratorController(ShopInformationManager shopInformationManager, ShopProductManager shopProductManager, ShopSalesManager shopSalesManagement) {
        this.shopInformationManager = shopInformationManager;
        this.shopProductManager = shopProductManager;
        this.shopSalesManagement = shopSalesManagement;
    }

    public Shop getShop() {
        return shopInformationManager.getShop();
    }

    public void editShopName(String newName){
        shopInformationManager.editShopName(newName);
    }

    public void editShopAddress(String newAddress){
        shopInformationManager.editShopAddress(newAddress);
    }

    public void editShopMasterId(int newMasterId){
        shopInformationManager.editShopMasterId(newMasterId);
    }

    public void addNewCoffeeProduct(Product product){
        shopProductManager.addNewCoffeeProduct(product);
    }

}
