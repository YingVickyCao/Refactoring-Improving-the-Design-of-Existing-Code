package com.hades.example.java.refactoring.before.c6.c6_1_extract_method;

public class Order {
    private int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
