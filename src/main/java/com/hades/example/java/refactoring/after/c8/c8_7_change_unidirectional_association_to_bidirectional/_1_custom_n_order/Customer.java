package com.hades.example.java.refactoring.after.c8.c8_7_change_unidirectional_association_to_bidirectional._1_custom_n_order;

import java.util.ArrayList;
import java.util.List;

/**
 * "1对多"
 * 1 个订单 只属于1 个客户， 1 个客户有多个订单
 */
public class Customer {
    private List<Order> _orderList = new ArrayList<>();

    List<Order> friendOrder() {
        return _orderList;
    }

    // 在Custom 中也能修改连接
    void addOrder(Order arg) {
        if (null != arg) {
            arg.setCustomer(this);
        }
    }
}