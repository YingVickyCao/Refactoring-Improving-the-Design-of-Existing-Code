package com.hades.example.java.refactoring.before.c8.c8_4_change_reference_to_value;

public class Example {
    public static void main(String[] args) {
        Currency.init();
        Currency currency = Currency.get("CNY");
        System.out.println(currency.getCode().equals("CNY"));;
    }
}
