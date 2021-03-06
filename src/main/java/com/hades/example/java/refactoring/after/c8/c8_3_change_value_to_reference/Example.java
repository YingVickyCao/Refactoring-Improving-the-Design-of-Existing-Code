package com.hades.example.java.refactoring.after.c8.c8_3_change_value_to_reference;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Custom.loadCustomers();
        Order order = new Order("A");
        Order order2 = new Order("A");

        List<Order> list = new ArrayList<>();
        list.add(order);
        list.add(order2);
        int num = numberOfOrdersFor(list, "A");
        System.out.println(num);    // 2
    }

    static int numberOfOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        for (Order each : orders) {
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}