package com.john.section04.references;

public class Account {
    private String ownerName;
    private int balance;

    public Account() {
    }

    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    public Account(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
