package com.sotogito.coffeeshop.model;

import java.util.*;

public class User {
    private String id;
    private String password;
    private String name;
    private int amount;
    private boolean idAdministrator;

    private final HashMap<Product, Integer> orders = new HashMap<>(); //상품 + 주문 개수

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

    public void addOrder(Product product) {
        if (orders.containsKey(product)) {
            orders.put(product, orders.get(product) + 1);
            return;
        }
        orders.put(product, 1);
    }

    public void updateAmount(int amount) {
        this.amount += amount;
    }

    public Map<Product,Integer> getOrders() {
        return Collections.unmodifiableMap(orders);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
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
