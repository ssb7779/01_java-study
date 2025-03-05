package com.sotogito.coffeeshop.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String id;
    private String password;
    private String name;
    private int amount;
    private boolean idAdministrator;

    private final List<Product> orders = new ArrayList<>();

    public User() {
    }

    public User(String id, String password, String name, int amount) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.amount = amount;
    }

    public User(String id, String password, String name, int amount, boolean idAdministrator) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.amount = amount;
        this.idAdministrator = idAdministrator;
    }

    public boolean addOrder(Product product) {
        if(!orders.contains(product)) {
            orders.add(product);
            return true;
        }
        return false;
    }

    public void updateAmount(int amount) {
        this.amount += amount;
    }

    public List<Product> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isIdAdministrator() {
        return idAdministrator;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", idAdministrator=" + idAdministrator +
                '}';
    }
}
